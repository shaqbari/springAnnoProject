package com.sist.anno;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sist.dao.Board;

/*                         @Autowired     @Qualifier       @Resource
 * 	ElementType.TYPE          (o)            (o)            (o)
 * 	ElementType.METHOD        (o)            (o)            (o)
 * 	ElementType.PARAMETER     (x)            (o)            (x)
 * 	ElementType.FIELD         (o)            (o)            (o)
 * 	ElementType.CONSTRUCTOR   (o)            (o)            (x)
 *  
 *  annotatation나오면 사용 위치를 잘 확인해야 한다.200개이상!
 *  
 *  @Autowired
 * 	public class A{
 * 		
 * 		@Autowired
 * 		private B b;
 * 		
 * 		@Autowired
 * 		public A(B b){
 * 
 * 		}
 * 		
 * 		@Autowired
 * 		public void setA(B b){
 * 
 * 		}
 *  }
 * 
 * */
public class MainClass {
	//@Autowired
	//@Qualifier("fb")
	@Resource(name="rb")	//@Autowired+@Qualifieer("fb")
	private Board board;
	/*autowired는 객체명을 지정할 수 없기 때문에 같은 자료형이 여러개일 경우 qualifier를 이용해 선택해줘야 한다.
	 * resource는 둘을 합친것이다.
	 * 
	 * 자동주입은 instanceOf()를 이용한다.
	 *  */
	
	/* private Board board1;
	 * private Board board2;
	 * @Autowired //set method에도 autowired가 가능 위의 필드에 준거와 같다.
	public void setBoard(@Qualifier("rb") Board board1, @Qualifier("fb") Board board2) {
	//parameter가 여러개이면 위과 같이 qualifier를 매개변수안에 써야 한다.
		this.board1 = board1;
		this.board2 = board2;
	}*/
	
		
	public static void main(String[] args) {
	ApplicationContext app=new ClassPathXmlApplicationContext("app.xml");
	MainClass mc=(MainClass) app.getBean("mc");
			
	mc.board.select();
	mc.board.insert();
	mc.board.update();
	mc.board.delete();
	
	}

}

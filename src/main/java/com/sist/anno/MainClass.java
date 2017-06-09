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
 *  annotatation������ ��� ��ġ�� �� Ȯ���ؾ� �Ѵ�.200���̻�!
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
	/*autowired�� ��ü���� ������ �� ���� ������ ���� �ڷ����� �������� ��� qualifier�� �̿��� ��������� �Ѵ�.
	 * resource�� ���� ��ģ���̴�.
	 * 
	 * �ڵ������� instanceOf()�� �̿��Ѵ�.
	 *  */
	
	/* private Board board1;
	 * private Board board2;
	 * @Autowired //set method���� autowired�� ���� ���� �ʵ忡 �ذſ� ����.
	public void setBoard(@Qualifier("rb") Board board1, @Qualifier("fb") Board board2) {
	//parameter�� �������̸� ���� ���� qualifier�� �Ű������ȿ� ��� �Ѵ�.
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

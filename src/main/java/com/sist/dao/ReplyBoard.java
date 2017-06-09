package com.sist.dao;

/**
 * @author user
 *	라이브러리 vs 프레임워크
 *	완제품             레고
 *  고칠수 없다       수정가능(.java까지 제공하는 경우도 있다.)
 *  
 *	컨테이너(관련없는 클래스를 관리하는 것, 스프링), 모듈(관련있는 클래스를 묶은것, 패키지), 컴포넌트(클래스 하나)  
 * */
public class ReplyBoard implements Board{
	
	@Override
	public void select() {
		System.out.println("ReplyBoard: select() Call...");
		
	}

	@Override
	public void insert() {
		System.out.println("ReplyBoard: insert() Call...");
		
	}

	@Override
	public void update() {
		System.out.println("ReplyBoard: update() Call...");
		
	}

	@Override
	public void delete() {
		System.out.println("ReplyBoard: delete() Call...");
		
	}
	
}

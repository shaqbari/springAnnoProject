package com.sist.dao;

public class FreeBoard implements Board{

	@Override
	public void select() {
		System.out.println("FreeBoard: select() Call...");
	}

	@Override
	public void insert() {
		System.out.println("FreeBoard: insert() Call...");
		
	}

	@Override
	public void update() {
		System.out.println("FreeBoard: update() Call...");
		
	}

	@Override
	public void delete() {
		System.out.println("FreeBoard: delete() Call...");
		
	}
	
}

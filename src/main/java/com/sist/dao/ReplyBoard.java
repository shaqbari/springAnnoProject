package com.sist.dao;

/**
 * @author user
 *	���̺귯�� vs �����ӿ�ũ
 *	����ǰ             ����
 *  ��ĥ�� ����       ��������(.java���� �����ϴ� ��쵵 �ִ�.)
 *  
 *	�����̳�(���þ��� Ŭ������ �����ϴ� ��, ������), ���(�����ִ� Ŭ������ ������, ��Ű��), ������Ʈ(Ŭ���� �ϳ�)  
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

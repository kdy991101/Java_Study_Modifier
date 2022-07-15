package com.iu.ex1;

public class Ex1Main {

	public static void main(String[] args) {
		//싱글톤 : 한개만 있다~
		//디자인 패턴
		
		// TODO Auto-generated method stub
		//9_13 1.
		
		Iu iu = Iu.getInstance();
//		Iu iu = new Iu(); // 객체 생성
		iu.setName("Iu");
		iu.setAge(24);
		
		String name = iu.getName();
		
		System.out.println(name);
		System.out.println(iu.getAge());
		System.out.println(iu);
		System.out.println("==========================");
		Iu iu2 = Iu.getInstance();
		System.out.println(iu2.getName());
		System.out.println(iu2.getAge());
		System.out.println(iu2);
		
	}

}

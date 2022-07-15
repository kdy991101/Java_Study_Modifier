package com.iu.animal;

public class Zoo {
	
	//멤버변수 선언
	//접근 지정자 [그외 지정자] 데이터타입 변수명;
	//클래스변수
	public static String title = "사파리";
	
	//인스턴스 변수 선언
	public final int PRICE = 50000;//두단어 이상일 시에는 언더바 작성 ex) MAX_VALUE
	
	
	//멤버메서드 선언
	//접근 지정자[그외 지정자] 리턴타입 메서드명([매개변수 선언]) {}
	//클래스 메서드
	public static void info() {
		System.out.println("Static Method");
		System.out.println(Zoo.title);
//		System.out.println(price);
		
	}
	
	//인스턴스 메서드
	public void getprice() {
		System.out.println(PRICE);
		System.out.println(Zoo.title);
		Zoo.info();
	}
	
	

}

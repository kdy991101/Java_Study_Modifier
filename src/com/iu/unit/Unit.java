package com.iu.unit;

public abstract class Unit {
	//abstrac = 추상화 한다.
	
//클래스 간의 공통요소를 저장
	private int hp;
	String color;
	String name;
	
	public Unit(int hp) {//생성자는 상속하지 않음
		System.out.println("Super 생성자");
		this.hp = hp;
	}
	
	//왼성되지 않은 메서드라는 뜻
	public abstract void move();
	public abstract void attack();
	public void info() {//일반 메서드,
		System.out.println("Super Info");
	}//일반 메서드, 
	
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}

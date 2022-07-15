package com.iu.himart;

public  abstract class Common {
	private int price; //가격
	private int point; //포인트
	private String breand; //브랜드 제품명..
	
//	public abstract void info(); //이런식으로 가능
	public void info() {
		System.out.println("브랜드 : " + this.getPrice());
		System.out.println("가격 : " + this.getBreand());
		System.out.println("포인트 : " + this.getPoint());
	}
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	
	public String getBreand() {
		return breand;
	}
	public void setBreand(String breand) {
		this.breand = breand;
	}
	
	
}

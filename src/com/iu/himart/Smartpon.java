package com.iu.himart;

public class Smartpon extends Common {
	String maker = "삼성";
	
	public Smartpon() {
		this.setMaker("삼성");
		this.setBreand("몰라");
		this.setPrice(2000000);
		this.setPoint(100);
	}
	public void info() {
		super.info();
		System.out.println(this.maker);
	}
	public String getMaker() {
		return maker;
	}
	public void setMaker(String maker) {
		this.maker = maker;
	}
	
}

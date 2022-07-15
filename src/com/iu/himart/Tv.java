package com.iu.himart;

public class Tv extends Common {
	
	private int size;
	
public Tv() {
	this.setSize(100);
	this.setPrice(200000);
	this.setBreand("삼성");
	this.setPoint(100);
}
	
	public int getSize() {
		return size;
	}



	public void setSize(int size) {
		this.size = size;
	}



	public void info() {
		super.info();
		System.out.println("사이즈 : " );
		
	}
	

}

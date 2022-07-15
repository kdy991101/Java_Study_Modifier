package com.iu.himart;

public class Computer extends Common {
	private String cpu;
	public Computer() {
		this.cpu = "M2";
		this.setBreand("MacMini");
		this.setPrice(2000000);
		this.setPoint(100);
	}
	
//	public void info() {
//		System.out.println("제품의 CPU는 :" + cpu);
//		System.out.println("제품의 브랜드는 : " + this.getBreand());
//		System.out.println("제품의 가격은 : " + this.getPrice());
//		System.out.println("제품 구매시 포인트는 : " + this.getPoint());
//	}
//	
	public void info() {
		super.info();
		System.out.println(this.cpu);
	}

	public String getCpu() {
		return cpu;
	}

	public void setCpu(String cpu) {
		this.cpu = cpu;
	}
}

package com.iu.himart;import java.util.Scanner;

import com.iu.main.Main;

public class Client {
	
	private int money;
	private int point;
	Computer cu = new Computer();
	
	
	public Client() {
		this.money = 30000000;
		this.setPoint(10);
	}
	
//	public void buy(int price, int point) {
//		this.money = this.money-price; //- 물건의 가격
//		this.point = this.point+point;// + 물건의 포인트
//		System.out.println("잔액 : " + this.money);
//		System.out.println("포인트 : " + this.point);
//	}
	
	//밑에 방식이 오버로딩
	//부모의 메서드를 넣어줌
	public void buy(Common common) {
		this.money = this.money-common.getPrice(); //- 물건의 가격
		this.point = this.point+common.getPoint();// + 물건의 포인트
		System.out.println("잔액 : " + this.money);
		System.out.println("포인트 : " + this.point);
	}
	
	 public void buy(Computer computer) {
		 this.money = this.money-computer.getPrice(); //- 물건의 가격
			this.point = this.point+computer.getPoint();// + 물건의 포인트
			System.out.println("잔액 : " + this.money);
			System.out.println("포인트 : " + this.point);
	 }
	 
	 public void buy(Smartpon smartpon) {
		 this.money = this.money-smartpon.getPrice(); //- 물건의 가격
			this.point = this.point+smartpon.getPoint();// + 물건의 포인트
			System.out.println("잔액 : " + this.money);
			System.out.println("포인트 : " + this.point);
	 }
	
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	
	
}

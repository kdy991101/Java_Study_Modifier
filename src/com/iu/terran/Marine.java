package com.iu.terran;

import com.iu.unit.Unit;

public class Marine extends Unit {
	 
	//오버라이딩
	public void move() 
	{
		super.info();//쓸일이 많이 있지는 않음
		System.out.println("뛰어다님");
	}
	public void attack() 
	{
		System.out.println("총으로 공격");
	}
	public void info()
	{//이런식으로 선언하는게 오버 라이딩
		System.out.println("Marine Info");
		
	}
	
	private String weapon;
	
	public Marine() 
	{
		super(30);
//		super();//눈에는 안보이지만 자동으로 생성되어있음, 생성자 라인 첫줄에 작성해야 함 위에 뭐 작성하면 에러.
		System.out.println("Marine 생성자");
	}
	

	public String getWeapon() 
	{
		return weapon;
	}
		
}

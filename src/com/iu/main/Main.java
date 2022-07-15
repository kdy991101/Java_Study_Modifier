package com.iu.main;
import com.iu.terran.Marine;
import com.iu.terran.Scv;
import com.iu.zerg.Hydra;


public class Main {

	public static void main(String[] args) {
		Marine m1 = new Marine();
		Scv s1 = new Scv();
		Hydra h1 = new Hydra();
	
		m1.setHp(100);
		m1.setColor("화이트");//매개변수 스티링 리턴타입은 보이드
		m1.setName("마린");
		m1.info();
		m1.move();
		
		s1.setHp(80);
		s1.setColor("블랙");
		s1.setName("Scv");
		
		h1.setHp(150);
		h1.setColor("핑크");
		h1.setName("히드라");
		
	
	}
}


package com.iu.main;

import com.iu.animal.Cat;
import com.iu.animal.Human;
import com.iu.animal.Zoo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Cat cat = new Cat();
//	 cat.sound();
		
		Human human = new Human();
//		human.age = 
		human.setAge(222);
		human.info();
		//---------------------------------------------
		System.out.println(Zoo.title);
		Zoo.info();
		
		Zoo zoo = new Zoo();
	
	}

}

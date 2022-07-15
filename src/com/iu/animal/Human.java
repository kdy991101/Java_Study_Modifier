package com.iu.animal;

public class Human {
	
	private int age;
	
	public int getAge() {
		//get으로 시작하는 메서드면 무언가를 꺼내오는 것
		
		return this.age;
	}
	public void setAge(int age) 
	//set으로 시작하느 매서드이면 대부분 넣는것
	//위 두가지를 setter/getter 메서드라함 활용도가 제일 높음
	{
		
		if(age >= 0 && age <=150) {
			this.age = age;
		}else 
		{
			this.age = 0;
		}
	}
	
	
	public void info() {
		System.out.println(this.age);
		
	}

	public void myPet() {
//		Cat cat = new Cat();
//		cat.age = 10;
//		cat.sound();
		
	}
}

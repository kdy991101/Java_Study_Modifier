package com.iu.ex1;
public class Iu {

		private String name;//null
		private int age;//0
		//실험
		private String test;
		
		private static Iu iu = null;			
	
		//생성자 생성	
		private  Iu() {}//클래스명과 동일하게
		//아이유가 private안에 있기 때문에 클래스를 하나더 생성하여 그외지정자static을 사용후
//		변환할 객체 아이유를 작성 후 리턴한다.
		//1.처음에는 초기값
		//2.두번째 호출할 때에는 주소값이 들어가 있기 때문에 false가 적용되며 밑에있는 (이미 주소가 담겨져있는)iu가 리턴된다
		
		//결과값
		//      Iu
		//		24
		//		com.iu.ex1.Iu@626b2d4a
		//		==========================
		//		Iu
		//		24
		//		com.iu.ex1.Iu@626b2d4a

		public static Iu getInstance() {
			if(Iu.iu == null)
			{
				Iu.iu = new Iu();
			}
			 return Iu.iu;
		}
		//Setter
		//public void set변수명()		
		//Getter
		//public 리턴타입 get변수명() {}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		
}


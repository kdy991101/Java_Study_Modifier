package com.iu.main;

import java.util.Scanner;

import com.iu.utill.CollectionQueue;
import com.iu.utill.CollectionSet;
import com.iu.utill.CollectionStack;

public class Main {
		public static void main(String[] args) {
			String name = "test";
			char ch = name.charAt(1);
//			name에 있는 charAt
			System.out.println(ch);
			
			Scanner sc = new Scanner(System.in);
			boolean isContinue = true;
//			iscontinue = 계속하다.
//			1. com.iu.utill.CollectionStack클래스 생성
//			add-새로운 숫자 추가(무조건 0번 인덱스에 추가), 입력받는  숫자를 추가
//			remove-0번 인덱스 삭제
			CollectionStack stack = new CollectionStack();
//			2. com.iu.utill.CollectionQueue클래스 생성
//			add-새로운 숫자 추가(무조건 0번 인덱스에 추가), 입력받은 숫자를 추가
//			remove-마지막 인덱스 삭제
			CollectionQueue queue = new CollectionQueue();
//			3. com.iu.utill.CollectionSet클래스 생성
//			add-새로운 숫자 루가(무조건 마지막 인덱스에 추가), 입력받는 숫자를 추가, 
//			단, 중복되지 않는 숫자만 추가
//			remove=삭제할 숫자를 입력받아서 일치하는 숫자를 삭제
			CollectionSet set = new CollectionSet();
			
			int[] numbers = init();
			
		 while(isContinue)
		 {
			 System.out.println("");
			 int selectTool = sc.nextInt();
			 int select = 0;
			 
			 if(select == 1)
			 {
				 select = selection();
				 
				 if(select == 1)
				 {
					 numbers = stack.add(numbers);
				 }else if(select == 2)
					 {
						 numbers = stack.remove(numbers);
					 }else 
					 {
						 System.out.println("잘못된 입력");	
					 }
				}else if(selectTool == 2) 
				{
					select = selection();
					
				 
			    }
		 }
			
			
			
			}
}


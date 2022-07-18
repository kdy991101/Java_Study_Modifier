package com.iu.utill;

import java.util.Scanner;

//CollectionQueue : 수짐 대기열
public class CollectionQueue implements Collection {
	 public int[] add(int[] numbers)
	 {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("추가할 숫자를 입력헤주세요");
		 int addNum = sc.nextInt();
		 int len = numbers.length;
		 int[] copyNumbers = new int[len + 1];
		 
		 copyNumbers[0] = addNum;
		 
		 for(int i = 1; i<len+1; i++) {
			 copyNumbers[i] = numbers[i - 1];
		 }
		 
		 return copyNumbers;
		 
	 }
	 
	 public int[] remove(int[] numbers) {
		 int len = numbers.length;
		 int[] copyNumbers = new int[len - 1];
		 
		 for(int i = 0; i<len - 1; i++) {
			 copyNumbers[i] = numbers[i];
		 }
		 return copyNumbers;
		
	}
	
	
}

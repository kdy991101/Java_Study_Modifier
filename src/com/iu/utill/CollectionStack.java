package com.iu.utill;

import java.util.Iterator;
import java.util.Scanner;

public class CollectionStack implements Collection  {
	
	public int[] add(int[] numbers) {
		Scanner sc = new Scanner(System.in);
		System.out.println("추가할 숫자를 입력해주세요.");
		int addnum = sc.nextInt();
		int len = numbers.length;
		int[] copyNumbers = new int[len + 1];
		
		copyNumbers[0] =addnum;
		
		for(int i = 0; i < len + 1; i++)
		{
			copyNumbers[i] = numbers[i - 1];
		}
		return copyNumbers;
	}
	
	public int[] remove(int[] numbers) 
	{
		int len = numbers.length;
		int[] copyNumbers = new int[len - 1];
		
		for (int i = 0; i < len; i++)
		{
			copyNumbers[i - 1] = numbers[i];
		}
		return copyNumbers;
		
	}
	
}
	
		
		

package com.iu.utill;

import java.util.Scanner;

public class CollectionSet implements Collection {
	
	Scanner sc = new Scanner(System.in);
	
	public int[] add(int[] numbers) {
		System.out.println("추가할 숫자를 입력하세요.");
		int addNum = sc.nextInt();
		int len = numbers.length;
		int[] copyNumbers = new int[len + 1];
		boolean isNotSameValue = true;
//		isNotSameValue = 값이 같지 않음
//		값이 같지 않은게 맞다면~
		for (int i = 0; i< len; i++)
		{
			copyNumbers[i] = numbers[i];
//		i = 0이고 길이가 numsbers배열의 길이보다 작음
//		copyNumbers[0]번째 인덱스에 numbers[0]번 인덱스를 대입시켜라
		}
		for(int number : numbers)
		{
			if(number == addNum)
			{
				isNotSameValue = !isNotSameValue;
				break;
//				number 와 addNum이 일치한다면
//				isNotSameValue(true)를 !isNotSameValue(false)로 바꿔고 브레이크
			}
		}
		if(isNotSameValue) 
		{
			copyNumbers[len] = addNum;
			
			return(copyNumbers);
//			copyNumbers[len] 참조변수 len과 addNUm이 같이다면
//			copyNumbers를 리턴(호출한 곳으도 돌려보냄)
//			같지 않다면 중족되는 숫자가 있음을 출력 후 numbers를 호출한 곳으로 리턴시킴
		}else 
		{
			
				System.out.println("중복되는 숫자가 있습니다.");
				return numbers;
			
		}
	}
		
		public int[] remove(int[] numbers)
		{
			System.out.println("삭제할 숫자를 입력해주세요");
			int removeNum = sc.nextInt();
			int len = numbers.length;
			int[] copyNumbers = new int[len - 1];
			boolean isSameValue = false;
//			isSameValue = 동일한 값
			int targetIndex = 0;
			
			for(int i = 0; i<len; i++)
			{
				if(numbers[i] == removeNum)
				{
					isSameValue = !isSameValue;
					targetIndex = i;
					break;
				}
			}
			if(isSameValue)
			{
				for(int i = 0; i<targetIndex; i++)
				{
					copyNumbers[i] = numbers[i];
				}
				for(int i = targetIndex + 1; i<len; i++)
				{
					copyNumbers[i - 1] = numbers[i];
				}
				return copyNumbers;
			}else 
			{
				System.out.println("일치하는 숫자가 없습니다.");
				return numbers;
				
			}
		}
		
		
	
}

package com.javaex.ex04;

import java.util.Scanner;

public class SumApp {

	public static void main(String[] args) {
		
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 공백으로 구분해서 입력하세요");
		String numLine = sc.nextLine();

		//코드를 작성하세요
		//입력받은 숫자를 공백 기준으로 나눠서 배열에 저장
		String[] numArray = numLine.split(" ");
		
		for(int i=0; i<numArray.length; i++) {
			sum += Integer.parseInt(numArray[i]);
		}
		
		
		System.out.println("합:" + sum);
		
		sc.close();
	}

}

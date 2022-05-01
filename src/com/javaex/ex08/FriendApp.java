package com.javaex.ex08;

import java.util.Scanner;

public class FriendApp {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("친구를 3명 등록해 주세요 (이름 번호 학교)");
		
		//친구 배열
		Friend[] friendArray = new Friend[3];
		
		//친구 입력
		for(int i=0; i<friendArray.length; i++) {
			String[] person = sc.nextLine().split(" ");
			
			friendArray[i] = new Friend(person[0], person[1], person[2]);
		}
		
		//친구 정보 출력
		for(int i=0; i<3; i++) {
			friendArray[i].showFriend();
		}
		
		
		sc.close();
	}

}

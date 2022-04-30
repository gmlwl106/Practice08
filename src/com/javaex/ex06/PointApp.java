package com.javaex.ex06;

public class PointApp {

	public static void main(String[] args) {
		
		Point p1 = new Point(2, 3);
		Point p2 = new Point(2, 3);
		Point p3 = new Point(5, 3);
		Point p4 = p1;
		
		System.out.println(p1 == p2); //false
		System.out.println(p2 == p3); //false
		System.out.println(p3 == p4); //false
		System.out.println(p4 == p1); //true
		System.out.println(p1.equals(p2)); //false
		System.out.println(p4.equals(p1)); //true
	}

}

/* equals() 메소드가 없는데 실행되는 이유
 * Object 클래스가 최상위 부모 클래스로 존재하고 있고,
 * Object 안에 있는 equals 메소드가 실행 되기 때문이다.
 * Object의 equals는 객체를 비교하기 때문에 x, y값이 같아도 다른 객체이면 false를 출력한다.
 */



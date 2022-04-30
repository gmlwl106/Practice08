package com.javaex.ex05;

import java.util.Scanner;

public class CalcApp {

    public static void main(String[] args) {

    	Scanner sc = new Scanner(System.in);
    	
    	while(true) {
    		
    		System.out.print(">> ");
    		String formula = sc.nextLine();
    	
    	
	    	if(formula.equals("/q")) {
	    		System.out.println("종료합니다.");
	    		break;
	    	} else {
		    	String[] formulaArray = formula.split(" ");
		    	
		    	int a, b;
		    	
		    	switch(formulaArray[1]) {
		    	
					case "+":
						a = Integer.parseInt(formulaArray[0]);
						b = Integer.parseInt(formulaArray[2]);
						Add add = new Add();
						add.setValue(a, b);
						System.out.println(add.calculate());
					    break;
					    
					case "-":
						a = Integer.parseInt(formulaArray[0]);
						b = Integer.parseInt(formulaArray[2]);
						Sub sub = new Sub();
						sub.setValue(a, b);
						System.out.println(sub.calculate());
						break;
						
					case "*":
						a = Integer.parseInt(formulaArray[0]);
						b = Integer.parseInt(formulaArray[2]);
						Mul mul = new Mul();
						mul.setValue(a, b);
						System.out.println(mul.calculate());
						break;
						
					case "/":
						a = Integer.parseInt(formulaArray[0]);
						b = Integer.parseInt(formulaArray[2]);
						Div div = new Div();
						div.setValue(a, b);
						System.out.println(div.calculate());
						break;
						
					default:
						System.out.println("알 수 없는 연산입니다.");
						break;
						
		    	}
	    	}
    	}
    	sc.close();
    }
}

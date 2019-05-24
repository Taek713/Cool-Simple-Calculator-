package calculator;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		int num;
		int num2;
		String operation;
		
		Scanner scnr = new Scanner(System.in);
		
		System.out.println("Enter first number");
       num= scnr.nextInt();
       
       System.out.println("Enter second number");
       num2= scnr.nextInt();
       
       Scanner op = new Scanner(System.in);
       System.out.println("Operation: ");
       operation= op.next();
       
       if (operation.equals("+")){
           System.out.println("Answer: " + (num + num2));
       }
        
       if (operation.equals("-")){
           System.out.println("Answer: " + (num - num2));
       }
       
         if (operation.equals("*")){
           System.out.println("Answer: " + (num * num2));
       }
       
         if (operation.equals("/")){
           System.out.println("Answer: " +(num / num2));
       }
	}
	}


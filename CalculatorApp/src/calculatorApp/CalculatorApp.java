package calculatorApp;

import java.util.Scanner;

public class CalculatorApp {

	public static void main(String[] args) {
		
		double firstnumber;
		double secondNumber;
		
		System.out.println("Enter first number");
		Scanner scan = new Scanner(System.in);
		firstnumber = scan.nextDouble();
		
		System.out.println("Enter second number");
		Scanner sc = new Scanner(System.in);
		secondNumber = sc.nextDouble();
		
		short operation;
		System.out.println("choose an operator");
		System.out.println("1 is for addition");
		System.out.println("2 is for subtruction");
		System.out.println("3 is for division");
		System.out.println(" is for multiplicaton");
		Scanner s = new Scanner(System.in);
		operation = s.nextShort();
		

		if (operation == 1) {
			
			
			double result = firstnumber + secondNumber;
			System.out.println(firstnumber + " + " + secondNumber + " = " + result);
		}
		else 
			if (operation == 2) {
				
				double result = firstnumber - secondNumber;
				System.out.println(firstnumber + " - " + secondNumber + " = " + result);
		}
		else 
			if (operation == 3) {
				
				double result = firstnumber / secondNumber;
				System.out.println(firstnumber + " / " + secondNumber + " = " + result);
		}
		else 
			if (operation == 4) {
					
				double result = firstnumber * secondNumber;
				System.out.println(firstnumber + " * " + secondNumber + " = " + result);
		}
			else {
				System.out.println("Invalid Input");
			}
		

	}

}

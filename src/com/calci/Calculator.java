package com.calci;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double num1, num2;

		System.out.println("Enter First Number : ");
		num1 = sc.nextDouble();
		System.out.println("Enter Second Number : ");
		num2 = sc.nextDouble();
		System.out.println("Enter Your Option : + , - , *,  /, ");
		String option = sc.next();

		double answer;
		switch (option) {

		case "+":
			answer = num1 + num2;
			System.out.println("First Number  is  : " + num1);
			System.out.println("Second Number is  : " + num2);
			System.out.println("---------------------------");
			System.out.println("Your Answer   is  : " + answer);
			System.out.println("---------------------------");
			break;

		case "-":
			answer = num1 - num2;
			System.out.println("First Number  is  : " + num1);
			System.out.println("Second Number is  : " + num2);
			System.out.println("---------------------------");
			System.out.println("Your Answer   is  : " + answer);
			System.out.println("---------------------------");
			break;

		case "*":
			answer = num1 * num2;
			System.out.println("First Number  is  : " + num1);
			System.out.println("Second Number is  : " + num2);
			System.out.println("---------------------------");
			System.out.println("Your Answer   is  : " + answer);
			System.out.println("---------------------------");
			break;

		case "/":
			if (num2 != 0) {
				answer = num1 / num2;
				System.out.println("First Number  is  : " + num1);
				System.out.println("Second Number is  : " + num2);
				System.out.println("---------------------------");
				System.out.println("Your Answer   is  : " + answer);
				System.out.println("---------------------------");
				break;
			} else {
				System.out.println("First Number  is  : " + num1);
				System.out.println("Second Number is  : " + num2);
				System.out.println("---------------------------");
				System.out.println("Your Answer   is  : 0.0");
				System.out.println("---------------------------");
				System.out.println("Anything Divided By Zero = 0");
				break;
			}
		default:
			System.out.println("Invalid Operator\n"+"Please Enter Correct Operator");

		}
		sc.close();

	}

}

/*. Написать функцию isPrime, принимающую на вход целое число и 
возвращающую true, если заданное значение является простым числом, либо false,
если число составное.
*/
package org.itstep.ShagCore;

import java.util.Scanner;

public class Main0236 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner enter = new Scanner(System.in);
		System.out.print("Введите число ");
		int number = enter.nextInt();

		boolean E;
		E = isPrime(number);
		if (E)
			System.out.println("простое число");
		else
			System.out.println("число не является простым");
	}

	public static boolean isPrime(int number1) {
		boolean E1;
		if (number1 == 1 || number1 == 2 || number1 == 3 || number1 == 5 || number1 == 7)
			E1 = true; 
		else if (number1 % 2 == 0 || number1 % 3 == 0 || number1 % 5 == 0 || number1 % 7 == 0)
			E1 = false;
		else
			E1 = true;
		return E1;

	}
}
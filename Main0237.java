/*Написать функцию sumDigits, которая на вход принимает целое положительное 
число и возвращает сумму цифр этого числа
*/
package org.itstep.ShagCore;

import java.util.Scanner;

public class Main0237 {
	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner enter = new Scanner(System.in);
		System.out.print("Введите число ");
		double number = enter.nextInt();

		double N;
		N = sumDigits(number);
		System.out.println("сумма цифр числа " + number + " = " + N);
	}

	public static double sumDigits(double a) {
		// a - исследуемое число number
		double n = 100; // максимально-возможное число разрядов
		double N1 = 0;// сумма цифр числа
		double i;// степень кот.используем при поиске числа разрядов числа
		double i1 = 0;// число разрядов
		double k = 0;// остаток от числа number

		for (i = 1; i <= n; i++) {
			k = a * (Math.pow(10, -i));
			if (k > 0 & k < 1)
				n = i;// так останавливаем счет
		}
		i1 = i - 1;
		System.out.println("число разрядов = " + i1);

		double i2;
		double k1, k3;
		System.out.println("разряд      значение");

		i2 = i1 - 1;
		k1 = a * (Math.pow(10, -i2));
		int k2 = (int) k1;// обратным преобразованием отсекам дробную часть

		a = a - k2 * (Math.pow(10, i2));
		System.out.println(" [" + i1 + "]      " + k2); // старший разряд

		for (i2 = i1 - 1; i2 >= 1; i2--) {
			k3 = a * (Math.pow(10, -(i2 - 1)));
			int k4 = (int) k3;
			a = a - k4 * (Math.pow(10, (i2 - 1)));
			N1 = N1 + k4;// сумма цифр без первого разряда
			System.out.println(" [" + i2 + "]      " + k4);

		}
		N1 = N1 + k2;
		return N1;
	}
}
/* Написать функцию sqRoots, которая должна вывести на экран корни 
квадратного уравнения. В качестве входных аргументов функция должна 
принимать 3 вещественных значения a, b и c, которые являются коэффициентами 
квадратного трехчлена вида a*x^2+b*x+c
Если корни для заданных аргументов определить невозможно, то вывести на экран
сообщение корней нет”.
P.S. Для вычисления квадратного корня числа вам может понадобиться 
соответствующая функция, которую вы можете найти в пакете Math. Пример 
вызова функции просчета квадратного корня:
double r = Math.sqrt(16.0); // r = 4.
 */
package org.itstep.ShagCore;

import java.util.Random;
import java.util.Scanner;

public class Main02310 {
	public static void main(String args[]) {
		System.out.println("calculation of a function of the form a*x^2+b*x+c");
		sqRoots(args);

	}

	public static double[] enter(String args[]) {
		@SuppressWarnings("resource")
		Scanner enter = new Scanner(System.in);

		System.out.print("enter a= ");
		double a1 = enter.nextFloat();
		System.out.print("enter b= ");
		double b1 = enter.nextFloat();
		System.out.print("enter c= ");
		double c1 = enter.nextFloat();
		double[] mas = new double[3];
		mas[0] = a1;
		mas[1] = b1;
		mas[2] = c1;

		return mas;
	}

	public static void sqRoots(String args[]) {
		double[] mas = new double[3];
		mas = enter(args);
		double a = mas[0];
		double b = mas[1];
		double c = mas[2];

		double D1 = Math.pow(b, 2);
		double D = D1 - 4 * a * c;
		if (D < 0)
			System.out.println("Imposible to find the roots");
		else {
			double r1 = 0.5 * a * (-b + Math.sqrt(D));
			System.out.println("root1 = " + r1);
			double r2 = 0.5 * a * (-b - Math.sqrt(D));
			System.out.println("root2 =" + r2);
		}

	}
}
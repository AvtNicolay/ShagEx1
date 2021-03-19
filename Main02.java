/*1. Написать программу, определяющую високосность года.
Для этого создайте в программе переменную целого типа, в которую запишите значение от 1 до
3000.
Программа должна вывести на экран сообщение “год високосный”, если заданный год является
високосным, либо “невисокосный” - в обратном случае.
Алгоритм определения високосности должен работать при любом заданном значении
переменной ([1..3000]).
*/

package org.itstep.ShagCore;
import java.util.Scanner;
public class Main02 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter year   ");
		
		int year;
		
		while (!sc.hasNextInt()) {
			sc.next();
			System.out.println("error enter");
			System.out.print("Enter year   ");

		}
		year = sc.nextInt();
		
		while (year < 1 || year > 3000) {
		
			System.out.println("error enter");
			System.out.println("Enter year   ");
			year = sc.nextInt();
		}
		
		System.out.println("Correct number");
		
		if (!(year%4==0) || year%100==0) {
			System.out.println(year+" - not a high-grade year");
		}
		else System.out.println(year+" - high-grade year");;
		
	}

}

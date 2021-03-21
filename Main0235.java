/*Написать функцию isSorted, которая принимает на вход массив элементов 
целого типа. Функция должна возвратить значение true, если заданный массив 
является отсортированным по возрастанию, либо false – в противном случае.
*/
package org.itstep.ShagCore;

import java.util.Arrays;
import java.util.Scanner;

public class Main0235 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner enter = new Scanner(System.in);
		System.out.print("Введите число элементов   ");
		int i = enter.nextInt();

		int[] mas = new int[i];

		for (i = 0; i < mas.length; i++) {
			System.out.print("Введите элемент №" + i + " - ");
			mas[i] = enter.nextInt();
		}
		System.out.println(Arrays.toString(mas));

		boolean D;
		D = isSorted(mas);
		if (D)
			System.out.println("массив отсортирован");
		else
			System.out.println("массив неотсортирован");
	}

	public static boolean isSorted(int[] mas1) {
		boolean D1;
		int sumQ = 0;
		for (int j = 1; j < mas1.length; j++) {
			if (mas1[j - 1] < mas1[j])
				sumQ = sumQ + 1;
		}
		if (sumQ == mas1.length - 1)
			D1 = true;
		else
			D1 = false;
		return D1;

	}
}
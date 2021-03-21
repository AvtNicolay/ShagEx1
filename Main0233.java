/*. Написать функцию firstEven, которая на вход принимает переменное число 
параметров целого типа и возвращает первый найденный элемент из заданной 
последовательности, который является четным числом.
even - odd - чет/нечет!
*/
package org.itstep.ShagCore;

import java.util.Arrays;
import java.util.Scanner;

public class Main0233 {
	public static void main(String args[]) {

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

		int C;// первое число
		C = firstEven(mas);
		if (C == -1) {
			System.out.println("четные числа в массиве отсутствуют");
			return;
		}
		System.out.println("первое четное число массива = " + C);
	}

	public static int firstEven(int[] mas1) {

		int even = -1;
		for (int j = 0; j < mas1.length; j++) { 
			if (mas1[j] % 2 == 0) {
				even = mas1[j];
				break;
			}
		}
		return even;
	}
}

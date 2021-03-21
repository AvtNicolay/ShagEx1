/*Написать функцию min, которая принимает на вход массив вещественных чисел
и возвращает минимальный элемент массива.
*/
package org.itstep.ShagCore;

import java.util.Arrays;
import java.util.Scanner;

public class Main0232 {
	public static void main(String args[]) {
		
		@SuppressWarnings("resource")
		Scanner	enter = new Scanner(System.in);
		System.out.print ("Введите число элементов   ");
		int i= enter.nextInt();
			
		int[] mas = new int[i];
		
		for (i=0; i<mas.length; i++) {
			System.out.print ("Введите элемент №"+i+" - ");
			mas[i]= enter.nextInt();
			}
		System.out.println(Arrays.toString(mas));
			
		int B;//мин
		B=Min(mas);	
		System.out.println("Минимальное значение элементов массива = "+B);
	}
		
	public static int Min(int[] mas1) {
	
		int min = mas1[0];
		for (int j=1; j<mas1.length; j++) {
			if (mas1[j]<min) min=mas1[j];
		}
		return min;
		}
	}

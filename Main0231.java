/*Написать функцию average, которая в качестве входного параметра принимает 
массив целых чисел и возвращает их среднеее значение.*/

package org.itstep.ShagCore;

import java.util.Arrays;
import java.util.Scanner;

public class Main0231 {
	public static void main(String args[]) {
		
		@SuppressWarnings("resource")
		Scanner	enter = new Scanner(System.in);
		System.out.print ("Введите число элементов   ");
		int i= enter.nextInt();
	//	System.out.println (i);
		
		int[] mas = new int[i];
		
		for (i=0; i<mas.length; i++) {
			System.out.print ("Введите элемент №"+i+" - ");
			mas[i]= enter.nextInt();
	//		System.out.println (mas[i]);
		}
		System.out.println(Arrays.toString(mas));
			
		int A;//среднее значение
		A=Average(mas);	
		System.out.println("Cреднее арифметическое массива = " +A);
	}
		
	public static int Average(int[] mas1) {
	
		int sum =0;
		for (int j=0; j<mas1.length; j++) {
		sum =sum+ mas1[j];
		}
		int A1=sum/mas1.length;
		return A1;
		}
	}

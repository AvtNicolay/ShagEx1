/*
 Написать функцию replaceNegatives, которая принимает в качестве аргумента 
двумерный массив(матрицу) размером nxm, состоящий из целых чисел. Функция 
должна заменить все отрицательные значения в этой матрице на 0 и 
вернуть измененную матрицу. Примечание: кол-во строк и столбцов в матрице может быть 
любым и варьироваться в диапазоне от 1 до 20.
 * */
package org.itstep.ShagCore;

import java.util.Random;
import java.util.Scanner;

public class Main0239 {
	public static void main(String args[]) {
		int[][] mas = new int[0][0];
		int[][] mas2 = new int[0][0];
		mas = entermas(args);
		mas2 = replaceNegatives(mas);
		for (int i = 0; i < mas2.length; i++) {
			for (int j = 0; j < mas2[i].length; j++) {
			System.out.print(mas2[i][j] + "\t");
			}
			System.out.println();
		}
	}
	// row and column
	public static int[][] entermas(String args[]) {
		@SuppressWarnings("resource")
		Scanner enter = new Scanner(System.in);
		int n;
		int m;

		System.out.print("enter the matrix row n = ");
		
		while (!enter.hasNextInt())// пока в потоке не int - запрос на ввод!
		{
			System.out.print("enter the matrix row n = ");
			enter.next();// смотрим значение в потоке
		}
		n = enter.nextInt();

		System.out.print("enter the matrix column m = ");
		
		while (!enter.hasNextInt())// пока в потоке не int - запрос на ввод!
		{
			System.out.print("enter the matrix column m = ");
		}
		m = enter.nextInt();
		
		System.out.println("n*m = "+n+"*"+m);
		
		int[][] mas = new int[n][m];
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				Random rand = new Random();
				mas[i][j] = rand.nextInt(100);
				if ((i+j)%2==0) { mas[i][j]=(-1)*mas[i][j];} 

			System.out.print(mas[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println();
		return mas;
	}

	public static int[][] replaceNegatives(int[][] mas1) {
		for (int i = 0; i < mas1.length; i++) {
			for (int j = 0; j < mas1[i].length; j++) {
				if (mas1[i][j]<0) {mas1[i][j]=0;} 
	}
}
		return mas1;
	}
}
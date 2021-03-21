/*Ќаписать функцию byteConverter, принимающую на вход 2 аргумента. 
Ќазначение функции Ц перевести мегабайты в байты или килобайты. ѕервый 
аргумент Ц целое число в диапазоне от 0 до 106
, представл€ющее количество 
мегабайт. ¬торой аргумент Ц строка, в которую может быть записано одно из 2-х 
значений: УbФ bФ или УbФ kbФ. ¬ зависимости от значени€ второго аргумента, функци€ 
должна возвращать количествово байт, либо килобайт, согласно значению первого 
аргумента.
*/
package org.itstep.ShagCore;

import java.util.Scanner;

public class Main0234 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number/Mb   ");

		double number;

		while (!sc.hasNextDouble()) {
			sc.next();
			System.out.println("error enter");
			System.out.print("Enter number/Mb   ");

		}
		number = sc.nextDouble();

		while (number < 0 || number > 106) {

			System.out.println("error enter");
			System.out.println("Enter number/Mb   ");
			number = sc.nextDouble();
		}

		System.out.print("Enter range - b/kb   ");

		String range = sc.next();

		double FinishNum = byteConverter(number, range);
		System.out.println(number + " Mb = " + FinishNum + " " + range);
	}

	public static double byteConverter(double number1, String range1) {
		double FN = 1;

		if (range1.equals("kb"))
			FN = 1024 * number1;

		else if (range1.equals("b"))
			FN = 1048576 * number1;
		else
			System.out.println("error range");

		return FN;
	}
}

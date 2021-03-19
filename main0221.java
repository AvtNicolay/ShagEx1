/*
 2. Написать программу, выводящую гороскоп для знака зодиака.
Для этого создайте в программе переменную строкового типа, в которую поместите название
знака.
Гороскоп должен выводиться для каждого из 12 знаков путем изменения значения заданной
переменной.
Текст гороскопа вы можете придумать сами, либо скачать готовый из сети.
В случае, если знака зодиака, который записан в переменной, не существует, необходимо
вывести сообщение “Неверно указан знак зодиака”.
При построении алгоритма использовать конструкцию “switch-case”.”.
horoscope sign
*/
package org.itstep.ShagCore;

import java.util.Scanner;

public class main0221 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		/*
		 * System.out.println("Овен      Aries");
		 * System.out.println("Телец     Taurus");
		 * System.out.println("Близнецы  Twins");
		 * System.out.println("Рак       Cancer"); System.out.println("Лев       Leo");
		 * System.out.println("Дева      Maid"); System.out.println("Весы      Scales");
		 * System.out.println("Скорпион  Scorpio");
		 * System.out.println("Стрелец   Sagittarius");
		 * System.out.println("Козерог   Capricorn");
		 * System.out.println("Водолей   Aquarius");
		 * System.out.println("Рыбы      Pisces");
		 */
		String sign = null;
		System.out.print("Введите знак гороскопа   ");
		Scanner sc = new Scanner(System.in);
		sign = sc.next();
		int i = 0;
		if (sign.equals("овен"))         i = 1;
		else if (sign.equals("телец"))   i = 2;
		else if (sign.equals("близнецы"))i = 3;
		else if (sign.equals("рак"))   	 i = 4;
		else if (sign.equals("лев"))     i = 5;
		else if (sign.equals("дева"))  	 i = 6;
		else if (sign.equals("весы"))    i = 7;
		else if (sign.equals("скорпион"))i = 8;
		else if (sign.equals("стрелец")) i = 9;
		else if (sign.equals("козерог")) i = 10;
		else if (sign.equals("водолей")) i = 11;
		else  {  sign.equals("рыбы");
			     i = 12;
				}

		for (int j = 1; j < 13; j++) {
			j = i;
			switch (j) {
			case 1:
				System.out.println("Овны – упертость");
				break;
			case 2:
				System.out.println("Тельцы – преданность");
				break;
			case 3:
				System.out.println("Близнецы – разговорчивость");
				break;
			case 4:
				System.out.println("Раки – сочувствие");
				break;
			case 5:
				System.out.println("Львы – самовлюбленность");
				break;
			case 6:
				System.out.println("Девы – организованность");
				break;
			case 7:
				System.out.println("Весы – ветреность");
				break;
			case 8:
				System.out.println("Скорпионы – злопамятность");
				break;
			case 9:
				System.out.println("Стрельцы – своевольность");
				break;
			case 10:
				System.out.println("Козероги – твердость");
				break;
			case 11:
				System.out.println("Водолеи – своеобразность");
				break;
			case 12:
				System.out.println("Рыбы – мечтательность");
				break;
			default:
				System.out.println("Неверно указан знак зодиака");
				break;
			}
			return;
		}
	}
}
/*Ќаписать функцию showTime, котора€ принимает на вход количество секунд 
(целое положительное число). ‘ункци€ должна перевести врем€ из секунд в часы, 
минуты и секунды, и вывести значение в формате УHH:MM:SSФ на экран.HH:MM:SSФ на экран.
Ќапример, при вызове функции showTime(765), на экран должна вывестить 
надпись УHH:MM:SSФ на экран.00:12:45Ф, т.к. аргумент 765 соответствует 12 минутам и 45 секундам.
ќбратитите внимание, что если один из параметров времени меньше 10, то перед 
ним необходимо вывести лидирующий 0, чтобы в каждой позиции было записано 
минимум 2 цифры. ‘ункци€ не должна возвращать значени€, а лишь выводить 
полученный результат на экран.
 */
package org.itstep.ShagCore;

import java.util.Scanner;

public class Main0238 {
	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner enter = new Scanner(System.in);
		System.out.print("¬ведите число ");
		int time = enter.nextInt();

		showTime(time);
	}

	public static void showTime(int t) {
		int sec;
		int min;
		int hour; 

hour = t/60/60;

min = (t-hour*3600)/60;
sec = t-hour*3600-min*60;
/*System.out.println("hour= "+hour);			
System.out.println("min= "+min);
System.out.println("sec= "+sec);
*/
if (hour<10 || min<10 || sec<10) {
	if (hour<10) System.out.print(t+"сек. соответствует  0"+hour+":");
	else System.out.print(t+"сек. соответствует  "+hour+":");
	//проверка услови€	9580 02:39:40
	
	if (min<10) System.out.print("0"+min+":");
	else System.out.print(min+":");
	//проверка услови€	79549 22:05:49
	
	if (sec<10) System.out.print("0"+sec);
	else System.out.print(sec);
	//проверка услови€	79805 22:10:05

	//проверка услови€ 7205
}
else 
System.out.println(t+"сек. соответствует  "+hour+":"+min+":"+sec);
//проверка услови€ 79856

		}
}
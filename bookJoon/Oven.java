package bookJoon;

import java.util.Scanner;

public class Oven {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int m = sc.nextInt();
		int c = sc.nextInt();
		h += c / 60;	//시간과 분을 같은값(분)으로 바꿈
		m += c % 60; 
		if (m >= 60) {	//분이 60보다 크거나 같으
			h += 1;		//+1시간
			m -= 60;	//분은 다시 0으로 초기화(?)
		}
		if (h >= 24) {	//24시간이상일경우
			h -= 24;	//시간을 0으로 초기화
		}

		System.out.println(h + " " + m);
	}

}

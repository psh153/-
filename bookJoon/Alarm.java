package bookJoon;

import java.util.Scanner;

public class Alarm {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int m = sc.nextInt();
		
		m -= 45; // 분 - 45
		
		if (m < 0) { //0분 이하일경
			m += 60; // 60분으로 변경하고
			h -= 1;	 // -1시간
			if (h < 0) { // 0시간보다 작을 경
				h = 23;  // 23시간으로 변경
			}
		}
		System.out.println(h+" "+m);
	}

}

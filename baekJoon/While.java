package baekJoon;

import java.util.Scanner;

public class While {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			if (a == 0) { 	//문제에서 제시한 값이 0 < a여서 그냥 0이면 프로그램 종료하도록 함
				break;
			}
			System.out.println(a + b);
		}
	}
}

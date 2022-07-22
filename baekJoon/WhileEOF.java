package baekJoon;

import java.util.Scanner;

public class WhileEOF {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//EOF는 알고리즘에서 입력 갯수를 정하지않았을때 사용
		while(sc.hasNext()) { //EOF를 사용하기 위해 Scanner의 메소드인 hasNext()사용
			int a = sc.nextInt();
			int b = sc.nextInt();
			System.out.println(a+b);
		}
	}

}

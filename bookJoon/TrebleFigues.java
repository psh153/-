package bookJoon;

import java.util.Scanner;

public class TrebleFigues {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		String b=sc.next();
		
		//문자열로 입력한 b를 charAt로 하나씩 꺼내서 곱한 
		//-'0으로 문자열 인덱스값을 10진수로 변환
		System.out.println(a*(b.charAt(2)-'0'));
		System.out.println(a*(b.charAt(1)-'0'));
		System.out.println(a*(b.charAt(0)-'0'));
		//Integer.parseInt로 문자열을 정수형으로 변환후 a와 곱한 값 출력
		System.out.println(a*Integer.parseInt(b));
	}

}

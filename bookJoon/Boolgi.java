package bookJoon;

import java.util.Scanner;

public class Boolgi {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final int seoGi = 543;
		int boolGi = sc.nextInt();
		boolGi = boolGi - seoGi;
	//불기연도를 몰라서검색해보니 544년이라는데 예제 출력보니 543을 뺀 값이라 예제와 같게함
		System.out.println(boolGi);
		//또는 System.out.pritln(boolGi-543);
	}

}

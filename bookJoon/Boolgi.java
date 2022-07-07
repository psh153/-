package bookJoon;

import java.util.Scanner;

public class Boolgi {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int boolGi = sc.nextInt();
		int seoGi = boolGi-543;
	//불기연도를 몰라서검색해보니 544년이라는데 예제 출력보니 543을 뺀 값이라 예제와 같게함
		System.out.println(seoGi);
	}

}

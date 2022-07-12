package bookJoon;

import java.util.Scanner;

public class Dice {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int fd = sc.nextInt();
		int sd = sc.nextInt();
		int td = sc.nextInt();
		if (fd == sd && fd == td) {		//같은 눈이 3개 나올경우
			System.out.println(10000 + fd * 1000);
		}
		else if (fd == sd) {			//1,2번째 주사위의 눈이 같을 경우
			System.out.println(1000 + fd * 100);
		}
		else if (sd == td) {			//2,3번째 주사위의 눈이 같을 경우
			System.out.println(1000 + sd * 100);
		}
		else if (td == fd) {			//3,1번째 주사위의 눈이 같을 경우
			System.out.println(1000 + td * 100);
		}
		else {
			if (fd > sd && fd > td) {	//첫 번째 주사위의 눈이 가장 높을 경우
				System.out.println(fd *100);
			}else if (sd > td) {		//두 번째 주사위의 눈이 가장 높을 경우
				System.out.println(sd * 100);
			}else {						
				System.out.println(td*100);
			}
		}
	}

}

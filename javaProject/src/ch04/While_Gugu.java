package ch04;

import java.util.Scanner;

public class While_Gugu {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int gugu=1;
		System.out.println("구구단 중에서 출력하고자 하는 단을 입력하세요 : ");
		int dan = scan.nextInt();
		
		while(gugu<=9) {
			System.out.println(dan+"*"+gugu+"="+gugu*dan);
			gugu++;
		}
	}

}

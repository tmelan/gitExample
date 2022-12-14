package ch04;

import java.util.Scanner;

public class Do_While_Ex4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int month;
		do {
			System.out.println("올바른 월을 입력하세요 [1~12] : ");
			month = input.nextInt();
		} while(month < 1 || month > 12);
		input.close();
		System.out.println("사용자가 입력한 월은 "+month);

	}

}//이상한 값 13같은 걸 입력하면 제대로 입력할때까지 계속 입력하라고 뜸

package ch04;

import java.util.Random;
import java.util.Scanner;


public class RandomNumber {

	public static void main(String[] args) {
		Random generator = new Random();//난수를 발생시키는 랜덤객체
		Scanner scan = new Scanner(System.in);
		System.out.print("난수의 갯수 : ");
		int count = scan.nextInt();
		int sum = 0;
		scan.close();
		
		for(int i = 0; i<count; i++ ) {
			int number = generator.nextInt(100);//0~99 사이 난수 발생
			System.out.println("생성된 난수 : " + number);
			sum += number; // 
			
		}
		System.out.print("난수" + count + "개의 합은 " + sum);
	}
//결과값은 실행할때마다 다름
}

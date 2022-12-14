package ch02;

import java.util.Scanner;


public class RectangleTest {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("직사각형의 가로 길이를 입력하세요 : " ); 
		double x = scan.nextDouble(); 
		System.out.println("직사각형의 세로 길이를 입력하세요 : ");
		double y = scan.nextDouble();
		System.out.println("직사각형의 넓이는 " + x*y + "입니다.");
		scan.close();
		


	}

}

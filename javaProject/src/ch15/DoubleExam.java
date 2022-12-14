package ch15;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DoubleExam {
	//2개 이상의 예외가 동시에 발생할 경우(세부적 예외부터 처리) 
	public static void main(String[] args) {
		int num=50;
		Scanner scan = null;
		
		try {
			System.out.println("숫자를 입력하세요 : ");
			scan=new Scanner(System.in);
			int value = scan.nextInt();
			System.out.println(num / value);
		} catch (NullPointerException e) {
			System.out.println("널 포인터 예외");
		} catch (ArithmeticException e) { //catch 문 추가 
			System.out.println("0으로 나눌 수 없습니다.");
		} catch (InputMismatchException e) {
			System.out.println("정수만 입력할 수 있습니다.");
		} catch (Exception e) {
			System.out.println("기타 예외");
		} finally { //예외 상관없이 항상 실행 , 생략 가능 
			if(scan != null) {
				scan.close(); 
				//그냥 scan close 핤 수 있지만 조건을 달아서 널일 경우에 닫는게 좋음 
				//if문으로 걸러주지 않으면 finally에서 또 예외 발생 가능성  
			}
		}
		System.out.println("프로그램 종료");
	}

}

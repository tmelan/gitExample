package ch18;

import java.io.IOException;
import java.io.InputStream;

public class InputStreamEx1 {
	//stream (스트림) : 데이터의 논리적인 통로
	//~Stream 계열 객체들은 1byte 단위로 스트림 처리, 영문 대소문자, 숫자, 특수문자만 처리할 수 있다(한글안됨)
	//inputstream (입력 스트림)
	//outputstream (출력 스트림)
	
	public static void main(String[] args) {
		//프로그램 기준 <= 키보드 
		InputStream is = System.in;//대표적으로 System.in은 inputstream 이다
		System.out.println("문자를 입력하세요 : ");
		try {//파일 입출력, 네트워크, db는 예외처리가 필수
			int code = is.read();//read는 키보드로부터 1byte를 읽음 (한글은 2바이트라 안됨)
			System.out.println(code);
			char ch = (char)code;//모든 문자에는 고유 숫자코드가 있음 
			//따라서 int형 code를 char형으로 형변환해서 코드값을 문자값으로 볼 수도 있다
			System.out.println("char : " +ch);			
		} catch (IOException e) {//입출력 관련 예외처리 (그냥 익셉션도 상관없음)
			e.printStackTrace();
		}
	}

}

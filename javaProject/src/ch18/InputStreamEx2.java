package ch18;

import java.io.IOException;

public class InputStreamEx2 {

	public static void main(String[] args) {
		int var=0;//입력받는 문자를 숫자로 받아서 처리
		System.out.println("내용을 입력하세요 : ");
		try {
			var = System.in.read();
			while(var != 13) {//13코드는 키보드 엔터값, 엔터키를 입력할 때 까지 반복
				System.out.println(var+"==>"+(char)var);
				var=System.in.read();
			}
		} catch (IOException e) {
			e.printStackTrace();
		} //try  catch 문 없으면 에러남 

	}

}

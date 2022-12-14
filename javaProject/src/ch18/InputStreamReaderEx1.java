package ch18;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class InputStreamReaderEx1 {
	//inputstream : 1바이트 단위로 읽음
	//inputstreamreader : 문자 단위(2바이트) 한글 처리할때 쓰임 
	
	public static void main(String[] args) {
		InputStream is = System.in;//1바이트
		//new ~Reader(Stream)
		InputStreamReader isr = new InputStreamReader(is);//2바이트 
		System.out.println("한글자를 입력하세요 : ");
		try {
			int code = isr.read();
			System.out.println("code : " +code);
			char ch = (char)code;
			System.out.println("char : "+ch);
		} catch (IOException e) {
			e.printStackTrace();
		}//글자의 코드값
		
	}

}

package ch18;

import java.io.OutputStream;
import java.io.PrintStream;

public class OutputStreamEx {
	
	public static void main(String[] args) {
		PrintStream ps=System.out;
		OutputStream os=ps;//printstream 객체를 부모타입인 outputstream으로 받아 처리
		//outputStream 1byte처리 시스템(한글안됨)
		try {
			os.write(97);//a
			os.write(98);//b
			os.write(99);//c
			os.flush();//flush()메소드를 사용해야 출력이 됨
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
package ch18;

import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;

public class OutputStreamWriterEx {

	public static void main(String[] args) {
		PrintStream ps=System.out;
		OutputStream os=ps;//다형성
		OutputStreamWriter osw=new OutputStreamWriter(os);//2바이트처리(한글가능)
		
		try {
			osw.write(44032);//가
			osw.write("나다라");
			osw.flush();
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}

}

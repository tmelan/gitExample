package ch18;

import java.io.BufferedWriter;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;

public class BufferedWriterEx {

	public static void main(String[] args) {
		PrintStream ps=System.out;
		OutputStream os=ps;
		OutputStreamWriter osw=new OutputStreamWriter(os);
		BufferedWriter bw = new BufferedWriter(osw);
		//BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 로 한줄도 가능 
		try {
			bw.write("환영합니다.\n");
			bw.write("Java");
			bw.newLine();//개행(줄바꿈)메소드
			bw.write("world!");
			bw.flush();//버퍼에 남아있는 모든 바이트 출력
			bw.close();//스캐처러머 종료해주는 것도 좋음 
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
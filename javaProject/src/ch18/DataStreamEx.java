package ch18;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class DataStreamEx {

	public static void main(String[] args) {
		try {
			//텍스트파일이 아닌 binary file(이진파일)로 저장
			DataOutputStream dataout=new DataOutputStream(new FileOutputStream("C:\\test\\test.dat"));
			dataout.writeInt(123);//숫자형식의 자료를 파일에 저장
			dataout.writeChar('A');//문자형식의 자료를 파일에 저장
			dataout.writeDouble(3.5);//실수형식 자료를 파일에 저장
			dataout.close();//파일은 스트림 클로즈 반드시 해줘야 생성됨
			System.out.println("저장되었습니다.");
			
			//이진파일 읽기
			DataInputStream datain=new DataInputStream(new FileInputStream("C:\\test\\test.dat"));
			System.out.println(datain.readInt());
			System.out.println(datain.readChar());
			System.out.println(datain.readDouble());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
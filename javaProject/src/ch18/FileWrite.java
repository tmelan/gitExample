package ch18;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class FileWrite {
	//프로그램 ==> 파일(출력스트림 필요)
	
	public static void main(String[] args) {
		OutputStream os=null;
		try {
			os = new FileOutputStream("C:\\test\\aa.txt");//파일생성
			System.out.println("입력하세요 : ");
			while (true) {
				int ch = System.in.read();//1바이트 읽음
				if(ch==13) break;
				os.write(ch);//파일에 1바이트 저장
			}
			System.out.println("저장되었습니다.");
		} catch (Exception e) {
			System.out.println("오류발생");
			e.printStackTrace();
		}

	}

}

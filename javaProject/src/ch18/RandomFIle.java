package ch18;

import java.io.RandomAccessFile;

public class RandomFIle {

	public static void main(String[] args) {
		String str=null;
		try { //r:읽기 전용 , w:쓰기 전용 , rw:읽쓰 둘다 
			RandomAccessFile file=new RandomAccessFile("C:\\test\\rand.txt", "rw");
			//getfilepointer : 파일포인터(파일을 어디까지 읽었는지 가리킴)
			System.out.println(file.getFilePointer());//0
			file.seek(8);//8번째 인덱스부터 (파일의 J부터)
			System.out.println(file.getFilePointer());//8
			file.write("HTML".getBytes());//인덱스 8번째부터 기존내용을 덮어쓰게 된다 
			System.out.println(file.length());//문자길이 확인(한글은 3바이트 길이값을 가짐)
			System.out.println(file.getFilePointer());
			while (file.getFilePointer() < file.length()) {
				//파일의 내용보다 파일포인터의 위치값이 적으면 반복
				str=file.readLine();
				//new String(문자열, 캐릭터셋) 인코딩식 변환
				//한글처리
				//스트링.getbytes() - 스트링을 바이트배열로 변환
				//8859_1, iso-8859-1 : 서유럽언어 인코딩 방식 
				//ms949 : 2바이트 (과거 많이 사용)
				//utf-8 : 3바이트 - 초성(1바이트) 중성(1바이트) 종성(1바이트) 
				str = new String(str.getBytes("8859_1"), "utf-8");
			}
			System.out.println(file.length());
			System.out.println(file.getFilePointer());
			file.close();//파일 저장 시점
			System.out.println("파일이 저장되었습니다.");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}

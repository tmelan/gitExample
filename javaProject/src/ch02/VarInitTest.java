package ch02;

public class VarInitTest {

	public static void main(String[] args) {
		// 지역변수는 반드시 명시적 초기화를 해야한다 
		int index = 1;
		
		index = index + 1; // 변수 초기화 오류 
		System.out.println("index : " + index);

	}

}

package ch15;

public class ThrowExam {
	//throw : 예외를 직접 발생시킴, 테스트용외에는 거의 쓸 일 없음 
	static void test(int n) {
		if(n ==0) {
			//throw new 예외처리클래스 => 특정조건에 인위적으로 예외를 발생시킴
			throw new NullPointerException();
		}
	}
	public static void main(String[] args) {
		test(0);

	}

}

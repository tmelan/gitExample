package ch15;

public class ThrowsExam {
	//예외처리방법
	//1)try ~ catch 직접 처리
	//2)throws 클래스에 예외처리를 위임
	
	
	public static void main(String[] args) throws InterruptedException {
		for(int i=1; i<10; i++) {
			System.out.println(i);
			Thread.sleep(1000); //interrupt(cpu 간섭) =>오류 마우스 올려서 add throws
		}
		//데이터들이 1초 정도 쉬었다가 출력됨 ->cpu간섭때문에 
	}

}

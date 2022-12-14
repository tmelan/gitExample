package ch02;

public class RealTypeEx {

	public static void main(String[] args) {
		double d = 0.1234D;//d 생략가능
		double e = 1234E-4; // 1234*10-4이므로 0.1234와 동일
		float f = 0.1234f; //float형은 f를 꼭 써줘야함 
		double w = .1234;
		

		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(w);
		
		//같은 결과값이지만 여러방법으로 표현 가능 

	}

}

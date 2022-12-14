package ch13;

import java.util.Random;

public class Rand {
	public static void main(String[] args) {
		Random r=new Random();
		System.out.println(r.nextDouble());//소수 난수
		System.out.println(r.nextInt());//정수 난수 
		System.out.println(r.nextInt(100));//0~99 범위의 난수
		System.out.println(r.nextInt(101)+100);//100~200
		System.out.println(Math.random());//0.0~1.0 미만 실수
		int num=(int)(Math.random()*100); //0~99 정수화 형변환 안하면 소수기 때문에 에러남
		System.out.println(num);
		
		String[] prize= {"1등","2등","3등","다음 기회에"};
		System.out.println();
	}

}

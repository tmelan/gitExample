package ch03;

public class CastEx3 {

	public static void main(String[] args) {
		int x = 8;
		int y = 5;
		System.out.println("x/y=" + x/y);
		//System.out.printf("x/y=%.1f", x/y);//나누기할때 실수형으로 만드는게 좋음
		System.out.printf("x/y=%.1f", (double)x/y); //printf에서는 결과값에 따른 실수형 포맷을 잘 써야한다 
	}

}

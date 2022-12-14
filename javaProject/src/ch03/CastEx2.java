package ch03;

public class CastEx2 {

	public static void main(String[] args) {
		int a = 500;
		float b = 200.2f;
		int c = 127;
		double d = a; //자동형변환 (실수값이 정수값보다 더 큼)
		System.out.println("int a => double : " + d);
		
		int e = (int)b; //큰것에서 작은것으로 갈수 없어서 (강제)명시적 형변환을 해줘야함
		System.out.println("float b => int : " + e);

		byte f = (byte)c; //강제형변환
		System.out.println("int c => byte : " + f);
		
		
	}

}

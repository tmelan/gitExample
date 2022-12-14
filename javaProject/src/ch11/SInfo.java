package ch11;

public class SInfo implements Student {

	@Override
	public void address() {
		System.out.println("이름\t주소\t\t이메일");
	}

	@Override
	public void point() {
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
	}

}

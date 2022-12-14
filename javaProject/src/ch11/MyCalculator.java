package ch11;

public class MyCalculator implements Calculator {
//미구현 된것만 override돼 나옴
	@Override
	public int plus(int i, int j) {
		return i+j;
	}

	@Override
	public int multiple(int i, int j) {
		return i*j;
	}

}

package ch09;

public class SportsCar extends Car { //상속, 자식클래스
	boolean turbo;
	public void setTurbo(boolean flag) {
		turbo = flag;
		System.out.println(turbo);
	}
}

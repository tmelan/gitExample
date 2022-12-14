package ch09;

public class Car { //부모클래스
	//멤버변수
	int speed;
	//멤버메소드
	public void setSpeed(int speed) {
		this.speed=speed; //둘 이름이 같을때 this.
		System.out.println(speed);
	}

}

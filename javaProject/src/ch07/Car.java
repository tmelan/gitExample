package ch07;

public class Car {
	//멤버변수는 기본적으로 int를 0으로 , string은 null값으로 초기화함 0=>10
	//지역변수는 따로 초기화 시켜줘야함 안그러면 에러남 
	String color;
	int speed; 
	int gear;
	@Override
	//toString = 개발자용 코드 
	public String toString() { //오른쪽 + source +  generate toString 
		return "Car [color=" + color + ", speed=" + speed + ", gear=" + gear + "]";
	}
	void changeGear(int g) { //g=1 
		gear = g;
		
	}
	void speedUp() {
		speed = speed + 10;
	}
	void speedDown() {
		speed = speed - 10;
	}
	
	
}

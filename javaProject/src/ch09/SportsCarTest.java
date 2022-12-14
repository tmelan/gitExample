package ch09;

public class SportsCarTest {

	public static void main(String[] args) {
		SportsCar obj=new SportsCar(); //자식클래스만 인스턴스화(메모리에 올림)했는데 부모클래스 speed 사용 가능
		obj.speed = 10; //부모클래스 멤버
		//SportsCar는 car를 상속받아 부모 멤버들을 모두 사용할 수 있다
		//부모클래스는 자식클래스꺼
		obj.setSpeed(60);
		obj.setTurbo(true);
		

	}

}

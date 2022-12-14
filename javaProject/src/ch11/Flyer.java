package ch11;

public interface Flyer { //인터페이스는 반드시 추상메소드({}있는건 일반메소드), 상수만 써야한다 추상메소드는 자식에서 구현
	public void takeOff();
	public void fly();
	public void land();
}

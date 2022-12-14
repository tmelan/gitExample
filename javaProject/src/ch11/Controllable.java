package ch11;

public interface Controllable {
	//인터페이스에서 명시적 default메소드의 구현은 jdk8부터 가능하다 
	default void repair() {
		System.out.println("장비를 수리한다.");
	}
	static void reset() {//static 메소드도 default처럼 구현 가능 
		System.out.println("장비를 초기화 한다.");		
	}
	
	void turnOn();
	void turnOff();
	
	
				
}

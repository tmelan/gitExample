package ch11;

public class ControllableDemo {
	public static void main(String[] args) {
		TV tv = new TV();
		tv.turnOn();
		tv.turnOff();
		tv.remoteOn();
		tv.remoteOff();
		tv.repair();
		Controllable.reset(); //static 멤버일땐 클래스명.메소드로 접근해야함.
		
		Computer com=new Computer();
		com.turnOn();
		com.turnOff();
		com.repair();
		
		

	}

}

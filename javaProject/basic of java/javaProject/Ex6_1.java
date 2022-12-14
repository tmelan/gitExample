package javaProject;

public class Ex6_1 {

	public static void main(String[] args) {
		Tv t;
		t = new Tv();
		//Tv t = new Tv(); 이것도 가능함 
		t.channel = 7;
		t.channelDown();
		System.out.println("현재 채널은 "+t.channel + "입니다.");

	}
}

class Tv{
	String color;
	boolean power;
	int channel;
	
	void power() {
		power =! power;
	}
	void channelUp() {
		++channel;
	}
	void channelDown() {
		--channel;
	}
}

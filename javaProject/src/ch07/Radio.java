package ch07;
public class Radio {		
	double channel;
	int volume;
	boolean onOff;
	
	void power() {	
		if(onOff==true) {
			System.out.println("라디오가 켜져있습니다.");
		} else {
			System.out.println("라디오가 꺼져있습니다.");
		}
	}
	
	void print() {	
		System.out.println("현재 채널은 " + channel + " 입니다.");
		System.out.println("볼륨은 " + volume + " 입니다.");
	
	}
}

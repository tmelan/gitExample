package ch07;

public class Television {
	//멤버변수(전역변수, 필드변수)
	int channel; // 채널7 | yourTv 다른 메모리에 9
	int volume; // 볼륨0  | 다른 메모리에 12
	boolean onOff; //전원상태	true | false // 대체 아님 각각 나올 수 있음 
	
	void print ( ) {//메소드 추가
		System.out.println("채널은 " + channel + "이고 볼륨은 " + volume + "입니다.");
		
	}
	
	int getChannel() {
		return channel;
	}
	
	void setChannel(int ch) {//set은 뭔가 하나 받아야 함
		channel = ch; //ch는 지역변수 channel은 전역변수 둘 이름이 같을땐 this.을 씀
	}
}

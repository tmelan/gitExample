package ch07;

public class TelevisionTest4 {
	public static void main(String[] args) {
		Television myTv = new Television(); //객체생성
		myTv.channel = 11;
		myTv.volume = 9;
		myTv.onOff = true;
		int ch = myTv.getChannel(); //Television 클래스에서 return channel
		System.out.println("현재 채널은 " + ch + "입니다.");
		

	}

}

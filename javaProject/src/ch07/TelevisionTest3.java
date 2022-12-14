package ch07;
//클래스가 달라도 불러와서 쓸수있음
public class TelevisionTest3 {

	public static void main(String[] args) {
		Television myTv = new Television(); //객체생성
		myTv.channel = 7;
		myTv.volume = 9;
		myTv.onOff = true;
		myTv.print(); //Television 의 메소드 호출(출력기능)
		
		Television yourTv = new Television(); //다른 메모리 번지수에 객체생성
		yourTv.channel = 9;
		yourTv.volume = 12;
		yourTv.onOff = false;
		yourTv.print();
		
	}

}

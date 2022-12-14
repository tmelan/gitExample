package ch07;
public class RadioTest {

	public static void main(String[] args) {
		System.out.println("[브리츠 라디오]");
		Radio britz = new Radio();
		britz.onOff = true;
		britz.power();
		
		britz.channel = 89.1;
		britz.volume = 12;
		britz.print(); 

		System.out.println();
		
		System.out.println("[아이리버 라디오]");
		Radio iriver = new Radio();
		iriver.onOff = false;
		iriver.power();
		iriver.channel = 95.1;
		iriver.volume = 9;
		iriver.print(); 
		
	}
}

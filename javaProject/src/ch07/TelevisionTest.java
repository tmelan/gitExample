package ch07;

public class TelevisionTest {
	public static void main(String[] args) {
		Television tv = new Television();//객체생성(인스턴스화)
		//System.out.println(tv); 주소값 알수있음
		tv.channel = 7; //tv. => 인스턴스화된 애들
		tv.volume = 9; 
		tv.onOff = true;
		System.out.println("텔레비전의 채널은 "+tv.channel +"이고 볼륨은 "+tv.volume + "입니다.");
		
		}
	

	}
	


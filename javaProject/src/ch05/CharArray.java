package ch05;

public class CharArray {

	public static void main(String[] args) {
		char[] ch= {'J','a','v','a'};
		//정식문법으로 표현해보세요~
		
		
		//배열참조변수.length=>배열의 사이즈
		for(int i=0; i<ch.length; i++) {
			System.out.println(i + "번째 문자 : " + ch[i]);
		}
	}
}

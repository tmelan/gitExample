package ch02;

public class CharEx {

	public static void main(String[] args) {
		char aValue= '\u0041'; //유니코드 0041은 대문자 A이다.
		System.out.println("char형('\u0041') : " + aValue);
		
		char bValue = '\u0041';
		System.out.println("char형(\'\\u0041\') : " + bValue);
		// \'= single quote를 표현
		// \\ = 역슬래쉬를 표현 
		
	}

}

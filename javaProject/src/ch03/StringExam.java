package ch03;

public class StringExam {

	public static void main(String[] args) {
		String str = "Hello " + "java"; //문자열 연결(연결연산자+)
		System.out.println(str);
		str = 123 + "c"; //숫자 + 문자열 -> 숫자가 문자열로 변환 
		System.out.println(str);
		
		str += "Programmer";//str = str + "Programmer" 
		System.out.println(str);
		

	}

}

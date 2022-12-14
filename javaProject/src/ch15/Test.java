package ch15;

public class Test {

	public static void main(String[] args) {
		//try catch 문으로 예외처리 
		try {
			int num=Integer.parseInt("ABC");
			System.out.println(num);			
		} catch (NumberFormatException e) {
			System.out.println("numberformat exception 발생");
		}
	}

}

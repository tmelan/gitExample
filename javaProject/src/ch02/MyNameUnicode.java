package ch02;

public class MyNameUnicode {

	public static void main(String[] args) {
		char a = '\uACE0';
		char b = '\uC11C';
		char c = '\uC740';
		
		
		System.out.println(a + " " + b + " " + c);
		System.out.println("char형" + "(" + "'\\uACE0'" +") : " + a);
		System.out.println("char형" + "(" + "'\\uC11C'" +") : " + b);
		System.out.println("char형" + "(" + "'\\uC740'" +") : " + c);
		
	
		
	}

}

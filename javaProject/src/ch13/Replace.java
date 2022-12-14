package ch13;

public class Replace {

	public static void main(String[] args) {
		//String a =new String("dfasdf"); 원래 정석방법
		String a="java program"; //간단하게 이렇게 해도 됨
		System.out.println(a.replace("a", "A"));
		System.out.println(a);
		a = a.replace("a", "A");
		System.out.println(a);
	}

}

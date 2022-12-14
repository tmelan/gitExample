package ch13;

//import java.lang.*; 도 생략돼 있음

public class Exam {//extends Object 생략돼 있음 
	public static void main(String[] args) {
		String a="hello";//String pool이라는 메모리 영역에 값이 저장됨.
		System.out.println(System.identityHashCode(a));
		//identityHashCode : string의 전용 객체주소 확인용 메서드
		String b="hello";
		System.out.println(System.identityHashCode(b));//주소값이 a랑 같이 나옴 같은 hello니까
		System.out.println(a==b); //a b 주소값이 같은지 물어봄 == 주소값 물어볼때 같으니 true
		
		String c=new String("hello");//위랑 다르게 new로 객체생성
		System.out.println(System.identityHashCode(c));
		String d=new String("hello");
		System.out.println(System.identityHashCode(d));
		//new 로 개체생성을 하면 각각 다른 주소값을 가진다
		System.out.println(c==d); //주소값이 다르니 false
		System.out.println(c.equals(d)); //equals 는 내용을 비교하는 것, 같으니 true
	}

}

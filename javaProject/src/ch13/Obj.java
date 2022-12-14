package ch13;

public class Obj { //(extends Object)가 생략되어 있음 
	public static void main(String[] args) {
		Obj e1=new Obj();//인스턴스화(메모리올림)
		System.out.println(e1.getClass());//클래스의 정보를 알려줌
		System.out.println(e1);
		System.out.println(e1.toString());//object를 문자열로 변환
	
	}	
}

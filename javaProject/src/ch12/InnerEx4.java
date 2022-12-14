package ch12;

class Outer {
	class InstanceInner {//내부클래스 
		int a = 100;//non static 
	}
	static class StaticInner {//static 내부클래스
		int a=200;//non static
		static int b=300;//static
	}
	void myMethod() {//Outer의 멤버메소드
		class LocalInner{ //지역중첩클래스
			int a=400;//non static이라 사용x
		}//end inner class
		LocalInner i = new LocalInner();
		System.out.println("i.a : " + i.a);
	}//end method
}

public class InnerEx4 {
	public static void main(String[] args) {
		Outer oc=new Outer();
		Outer.InstanceInner i=oc.new InstanceInner(); 
		
		System.out.println("i.a : " + i.a);
		System.out.println("Outer.StaticInner.b : " + Outer.StaticInner.b);
		
		//a를 사용하고 싶은 경우 : non static멤버는 static클래스 안에 있어도 new를 통해서 생성
		Outer.StaticInner si=new Outer.StaticInner();
		System.out.println("si.a : " + si.a);
		oc.myMethod();
	}
}

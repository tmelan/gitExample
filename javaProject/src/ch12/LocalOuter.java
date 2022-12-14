package ch12;

public class LocalOuter {
	private int data=30;
	void display() {//LocalOuter의 멤버 메소드
		class LocalInner { //지역내부 클래스(메소드 안에서 선언)
			void msg() { //LocalInner의 멤버 메소드 
				System.out.println(data);
			}
		}//end inner class 
		LocalInner li = new LocalInner();//내부객체 생성
		li.msg();		
	}//end method
	
	public static void main(String[] args) {
		LocalOuter lo = new LocalOuter();
		lo.display(); //메소드 호출
	}
}

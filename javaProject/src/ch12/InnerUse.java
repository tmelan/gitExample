package ch12;

import ch11.Flyer;

public class InnerUse {
	public static void main(String[] args) {
		//인터페이스는 new해서 객체생성 할수없다 하지만 무명클래스 형태로 생성할수있다 
		Flyer f=new Flyer() { //new 생성자() { }; => 무명내부클래스 
			
			@Override
			public void takeOff() {
				System.out.println("take off");
			}
			
			@Override
			public void land() {
				System.out.println("land");
			}
			
			@Override
			public void fly() {
				System.out.println("fly");
				
			}
		};//무명내부클래스
		f.takeOff();
		f.land();
		f.fly();
	}

}

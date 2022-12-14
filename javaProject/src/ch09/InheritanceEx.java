package ch09;

public class InheritanceEx {
	public static void main(String[] args) {
		Circle c1 = new Circle();
		Ball c2 = new Ball("빨강색");//객체생성과 동시에 매개변수가 있는 생성자 호출()기본생성자로 호출안함 이러면 문제없음
		System.out.println("원 : ");
		c1.findRadius();
		c1.findArea();
		
		System.out.println("공 : ");
		c2.findRadius(); ////circle멤버
		c2.findColor(); //ball멤버
		c2.findArea();//circle멤버
		c2.findVolume(); //ball멤버
		
		Circle c3 = new Circle(4); //생성자는 상속대상이 아니라 고유개체로서 사용되어진다 
		Ball c4 = new Ball();
	}
}

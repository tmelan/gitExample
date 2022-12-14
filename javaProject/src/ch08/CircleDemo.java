package ch08;

class Circle {//default(public, private아님)
	//멤버변수
	double radius;
	String color;
	//생성자
	public Circle(double r, String c) { // c1
		radius = r; //변수 이름이 다를땐 this안써도 됨
		color = c;
	}
	public Circle(double r) { // c2
		radius = r; 
		color = "파랑";
	}
	public Circle(String c) { // c3
		radius = 21.0; 
		color = c;
	}
	public Circle() { //기본 생성자 c4
		radius = 3.5;
		color = "빨강";
	}
	//출력(생성자는 정의용도, void 쓰면 안됨)
	public void print() {
		System.out.println("반지름 : " + radius);
		System.out.println("색 깔 : " + color);
	}
	
}

//메인메소드(실행은 여기서)
public class CircleDemo {
	public static void main(String[] args) {
		Circle c1=new Circle(10.0, "빨강");
		c1.print();
		
		Circle c2=new Circle(5.0);
		c2.print();
		
		Circle c3=new Circle("노랑");
		c3.print();
		
		Circle c4=new Circle();
		c4.print();
	}

}

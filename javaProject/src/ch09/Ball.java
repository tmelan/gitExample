package ch09;

public class Ball extends Circle {
	private String color; //ball클래스 멤버
	public Ball(String color) { //매개변수가 있는생성자 
		this.color=color;
	}
	public Ball() {
	}
	public void findColor() {
		System.out.println(color + "공이다.");
	}
	public void findVolume() {
		System.out.println("부피구하기");
	}
	
}

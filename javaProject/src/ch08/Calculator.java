package ch08;

public class Calculator {
	//멤버변수 선언
	private int left;
	private int right;
	//기본생성자
	public Calculator() {
		System.out.println("기본생성자 호출...");
	}
	public Calculator(int left, int right) {
		System.out.println("매개변수가 있는 생성자 호출...");
		this.left = left;
		this.right = right;
	} 		
	//getter, setter
	public int getLeft() {
		return left;
	}
	public void setLeft(int left) {
		this.left = left;
	}
	public int getRight() {
		return right;
	}
	public void setRight(int right) {
		this.right = right;
	} 
	public void sum() {
		System.out.println(left + right);
	}
	public void avg() {
		System.out.println((left+right)/2);
	}
	
}

package ch09;
//부모클래스 
public class Area {
	//멤버변수(초기화 안해줘도 됨), int는 기본 0으로 초기화 돼있음
	private int width;
	private int length;
	//생성자
	public Area() {
	}
	
	public Area(int width, int length) {
		this.width = width;
		this.length = length;
	}
	//getter, setter

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}
	//일반메소드
	public int getArea() {
		return width*length;
	}
	
	
	
}

package ch07;

public class BoxTest {
	public static void main(String[] args) {
		Box b;
		b = new Box();
		b.width = 20;
		b.length = 20;
		b.height = 30;
		System.out.println("상자의 가로세로높이는 " + b.width + " , " + b.length + " , " + b.height + "입니다.");

	}

}

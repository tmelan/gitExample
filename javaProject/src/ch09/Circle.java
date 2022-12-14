package ch09;

public class Circle {
	//멤버 메소드
	public void secret() { //private는 상속x
		System.out.println("비밀이다");
	}	
	protected void findRadius() { 
		System.out.println("반지름 구하기");
	}
	public void findArea() { 
			System.out.println("넓이 구하기");
	}
	public Circle() { //기본생성자도 안써도 코딩하는게 좋음	
	}
	
	public Circle(int r) {//생성자는 상속대상 아님
		System.out.println("반지름 : " +r);
	}
}


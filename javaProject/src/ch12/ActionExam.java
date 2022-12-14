package ch12;

abstract class Action { //추상클래스
	public abstract void exec(); //추상메소드
}


public class ActionExam extends Action { //에러뜨면 눌러서 구현해줘야함

	@Override
	public void exec() {
		System.out.println("I am Child");
	}
	
	public static void main(String[] args) {
		Action a = new ActionExam() { //추상클래스 좌변 자식클래스 우변(다형성) , 익명내부클래스 
			String name = "kim";
			@Override //익명내부클래스도 오버라이딩 가능 , ctrl + space bar
			public void exec() {
				System.out.println("나는 "+name+ "이다.");
			}
			
		}; //익명내부클래스의 마지막 중괄호 다음은 세미콜론;이 명시되어야 한다 
		a.exec();
	}
}

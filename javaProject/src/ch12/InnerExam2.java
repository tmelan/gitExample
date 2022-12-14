package ch12;

public class InnerExam2 {
	static class Cal{ //내부 static 클래스 
		int value = 0;
		public void plus() {
			value++;
		}
	}
	public static void main(String[] args) {
		//내부 static 클래스를 접근할땐 //외부클래스명.내부클래스명 참조변수 = new 외부클래스명.내부클래스명(생성자명)();// 
		InnerExam2.Cal cal = new InnerExam2.Cal();
		cal.plus();
		System.out.println(cal.value);
	}
}

package ch12;

public class InnerExam1 {
	class Cal{
		int value = 0;
		public void plus() {
			value++;
		}
	}//inner class 끝
	
	public static void main(String[] args) {
		InnerExam1 t = new InnerExam1(); //1.외부객체 생성
		//외부클래스명.내부클래스명 참조변수=외보참조변수.new 내부클래스생성자();
		InnerExam1.Cal cal = t.new Cal(); //2. 내부객체 생성
		cal.plus();
		System.out.println(cal.value);
	}
}

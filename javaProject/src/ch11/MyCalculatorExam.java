package ch11;
//구현하는 메인메소드 클래스 
public class MyCalculatorExam {
	public static void main(String[] args) {
		Calculator cal = new MyCalculator(); //다형성기법
		int value1 = cal.multiple(5, 10);
		int value2 = cal.plus(5, 10);
		int value3 = cal.exec(5, 10);
		
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
	}

}

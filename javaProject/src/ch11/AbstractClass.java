package ch11;

public abstract class AbstractClass {

	abstract void method1(); //에러뜬후 오른쪽 버튼으로 추상클래스로 만들어줘야함(abstract가 있으면 클래스도 abstract로 만들어야)
	abstract void method2(); {//멤버메소드
	System.out.println("완성된 method");	
	}
}

 package ch11;

public class AbstractExtends extends AbstractClass {

	//오버라이딩은 부모쪽에 있는 미완성된 메소드를 구현
	@Override
	void method1() {
		System.out.println("추상 method를 완성한 method");		
	}
	public static void main(String[] args) {
		//abstractclass의 non static을 메모리에 올려줘야함
		AbstractExtends ex=new AbstractExtends();
		ex.method1();
		ex.method2();
	}

}

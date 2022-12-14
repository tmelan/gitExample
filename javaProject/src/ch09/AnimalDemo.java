package ch09;
//한 클래스에 소스 다 넣기(권장사항 아님)

class Animal {
	public Animal(String s) { //ctrl + space
		System.out.println("동물 : " + s);
	}
}

class Mammal extends Animal {
	public Mammal() { //기본생성자
		super("원숭이"); //super 클래스는 부모 클래스 생성자 호출하는 것
		System.out.println("포유류 : 원숭이");
	}
	//overloading
	public Mammal(String s) { //매개변수가 있는 생성자
		super(s); //부모 클래스 생성자 호출
		System.out.println("포유류 : " + s);
	}
}

public class AnimalDemo {

	public static void main(String[] args) { //메인메소드
		Mammal ape = new Mammal();//객체생성 겸 기본생성자 호출
		Mammal lion = new Mammal("사자"); //객체생성 겸 매개변수 생성자 호출

	}

}

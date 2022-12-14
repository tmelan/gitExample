package ch11;

public class FlyUse {
	//실행클래스에서 메모리에 올려줌 
	//일반적 기법
	public static void main(String[] args) {
		Bird bird = new Bird();
		bird.takeOff();
		bird.fly();
		bird.land();
		
		Airplane air = new Airplane();
		air.takeOff();
		air.fly();
		air.land();
		
		System.out.println("===================");
		//실무에서 쓰는 다형성 기법
		Flyer f = new Bird(); //좌변은 부모 우변은 자식(다형성기법)
		f.takeOff();
		f.fly();
		f.land();
		
		f = new Airplane();
		f.takeOff();
		f.fly();
		f.land();
	}

}

package ch09;

class Bank {
	//멤버 메소드
	double getInterestRate() {
		return 0.0;
	}
}

class BadBank extends Bank { 
	@Override // ctrl + space 메소드 오버라이딩 (덮어쓰다, 재정의 목적) 부모멤버변수를 그대로 카피함 
	double getInterestRate() {
		return 10.0;
	}
}

class NormalBank extends Bank {
	@Override
	double getInterestRate() { //메소드 오버라이딩
		return 5.0;
	}
}

class GoodBank extends Bank {
	@Override
	double getInterestRate() { //메소드 오버라이딩
		return 3.0;
	}
}

//자식 클래스 3개 부모클래스에 올림(원랜 각 클래스로 해야됨)
public class BankTest {
	public static void main(String[] args) {
		BadBank b1 = new BadBank(); //객체생성
		NormalBank b2 = new NormalBank();
		GoodBank b3 = new GoodBank();
		System.out.println("BadBank의 이자율 : " + b1.getInterestRate()); //.get~ 번지수
		System.out.println("NormalBank의 이자율 : " + b2.getInterestRate()); //.get~ 번지수
		System.out.println("GoodBank의 이자율 : " + b3.getInterestRate()); //.get~ 번지수
	}

}

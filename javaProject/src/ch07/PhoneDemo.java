package ch07;
//클래스를 추가할때 같은 public 안됨 추가한 클래스는 default가 기본으로 됨
//한개의 파일에 2개 이상의 클래스를 작성시에는 public class의 클래스 이름으로 저장,
//나머지 클래스는 default로 처리
class Phone {
	String model;
	int value;
	void print() {
		System.out.println(value + "만원 짜리 " + model + " 스마트폰");
	}
}


public class PhoneDemo {
	public static void main(String[] args) {
		Phone myPhone = new Phone(); // 객체생성
		myPhone.model = "갤럭시 22";
		myPhone.value = 100;
		myPhone.print();
		
		Phone yourPhone = new Phone();
		yourPhone.model = "iPhone";
		yourPhone.value = 150;
		yourPhone.print();

	}

}

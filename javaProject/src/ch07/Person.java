package ch07;

public class Person {
	//멤버변수(전역, 필드변수) 의 데이터는 중요하기 때문에 캡슐화를 해야한다 (private)
	//실무에선 private 많이 씀 안쓰면 default private하면 다른 클래스 접근 불가 (personUse에러뜸)
	private String name;
	private int age;
	private double height;
	//public으로 처리된 메소르 활용 private처리된 멤버변수 접근 가능
	//getter, setter (오른쪽 버튼-소스)
	public String getName() { //데이터를 get
		return name;
	}
	public void setName(String name) {//데이터를 set(저장)
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age < 0 || age > 150) {
			System.out.println("입력값이 정확하지 않습니다.");
		} else { // 정상값이면 처리
			this.age=age;
		}
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	
	public void print() {
		System.out.println("이름:"+name+", 나이 : "+age+", 키:"+height);
	}
}
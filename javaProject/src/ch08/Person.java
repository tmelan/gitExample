package ch08;

public class Person {
	//처음엔 멤버변수(지역변수)
	private String name; //"홍길동", "추신수", "박찬호"
	private int height; //170, 190, 185
	private int weight; //60, 100, 70
	//this() 다른 생성자 호출
	public Person() { //괄호 들어가면 메소드 , 기본 생성자()
		this("홍길동", 170, 60);	//(String, int, int)
	} 
	public Person(String name) { //오버로딩 // name="추신수"
		this(name, 190, 100);
	}
	public Person(String name, int height) { //매개변수 2개짜리 생성자 // name = "박찬호"
		this(name, height, 70);
	}
	public Person(String name, int height, int weight) { //3개짜리만드니까 에러사라짐 , 매개변수 3개짜리 생성자였기 때문에 
		this.name=name; //들어온 지역변수의 값을 멤버변수의 자리로//name="추신수" 
		this.height=height;
		this.weight=weight;
	} 
	//출력용도
	public void showInfo() {
		System.out.println("===신상 정보===");
		System.out.println("이름 : " + name);
		System.out.println("신장 : " + height);
		System.out.println("체중 : " + weight);
	}
}

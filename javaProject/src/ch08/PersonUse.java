package ch08;

public class PersonUse {

	public static void main(String[] args) { //p1,p2는 참조변수 ()안 매개변수 개수 각각 다르게
		Person p1 = new Person(); //person 클래스의 기본 생성자 호출, 객체 생성 겸 기본 생성자 호출 
		p1.showInfo();
		
		Person p2 = new Person("추신수");//Person(String)형태의 생성자 호출
		p2.showInfo();

		Person p3 = new Person("박찬호", 185); //person(string, int)
		p3.showInfo();
		
		Person p4=new Person("구자욱", 175, 72);
		p4.showInfo();
	}

}

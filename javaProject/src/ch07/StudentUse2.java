package ch07;

public class StudentUse2 {

	public static void main(String[] args) {
		Student2 s2 = new Student2();
		s2.input("이순신", "컴공", 1, "202202", 3.8, 500);//데이터입력
		s2.print();
		System.out.println(s2); //tostring : 출력해서 값 확인 가능
	}

}

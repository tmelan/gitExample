package ch09;
public class ManagerTest {
	public static void main(String[] args) {
		Manager a1=new Manager();
		a1.input(20220101, 3000, "123456-1234567");
		a1.setName("홍길동");
		a1.setAddress("서울 강남구");
		a1.setEmail("hong@gmail.com");
		a1.print();

	}
}

package ch12;

public class MemberAnony {
	static int customer = 2;
	static String name = "김길동";
	static String email = "kim@gmail.com";
	
	public static void main(String[] args) {
		Member m = new Member() {

			@Override
			public void customer() {
				System.out.println("------------------------");
				System.out.println("고객번호 : "+customer);
				
			}

			@Override
			public void name() {
				System.out.println("이  름 : " +name);
				
			}

			@Override
			public void email() { 
				System.out.println("이 메 일 : "+email);
				System.out.println("------------------------");
			}
			
		};
		m.customer();
		m.name();
		m.email();
	}

}

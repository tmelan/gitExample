package ch12;

public class MemberOuter {
		private int customer = 1;
		private String name = "홍길동";
		private String email = "hong@gmail.com";
		
		class MemberInner {
			void Member() {
				System.out.println("------------------------");
				System.out.println("고객번호 : "+customer);
				System.out.println("이   름 : "+name);
				System.out.println("이 메 일 : "+email);
				System.out.println("------------------------");
			}
		}
		public static void main(String[] args) {
			MemberOuter aa = new MemberOuter();
			MemberOuter.MemberInner bb = aa.new MemberInner();  
			bb.Member();
		}
	}
package ch11;

public class StudentUse {

	public static void main(String[] args) {
		Student s = new SInfo();
		System.out.println("======================================");
		s.address();
		System.out.println(s.NAME+"\t"+s.ADDRESS+"\t"+s.EMAIL);
		
		System.out.println("--------------------------------------");
		s.point();
		System.out.println(s.NAME+"\t"+s.KOR+"\t"+s.ENG+"\t"+s.MAT+"\t"+s.TOT+"\t"+String.format("%.2f", s.AVG));
		System.out.println("======================================");
		
	
	}

}

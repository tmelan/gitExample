package ch13;

public class StrBuilder {
	public static void main(String[] args) {
		StringBuilder str1 = new StringBuilder(); //StringBuffer는 옛날에 많이 썼음 builder랑 똑같이 써도 됨
		str1.append("java");//문자열 내용 추가, 메모리 절약		
		System.out.println(str1.toString());
		
		str1.append(" programming");
		System.out.println(str1);
		
		//cf)replace 메소드는 주로 String객체에 많이 쓰이는 편이다 
		str1.replace(0, 4, "jsp");
		System.out.println(str1);//0~3 인덱스 내용을 변경(java->jsp)
		
		String str2=str1.substring(3); //인덱스 3부터 끝까지
		System.out.println(str1);
		System.out.println(str2);
		
		//Stringbuilder를 String으로 바꿀땐 toString을 써줘야함 
		//string str3=str1;만 하면 에러남
		String str3=str1.toString();
		System.out.println("StringBuilder(str1) -> String(str3)에 저장 : " +str3);
		//str1 = str3; 에러남
		//String을 StringBuilder에 저장할 때
		str1 = new StringBuilder(str3);
		System.out.println("StringBuilder -> String에 저장 :"+str1);
	}

}

package ch13;

public class StrEx {

	public static void main(String[] args) {
		String str="Java Programming";
		System.out.println(str);
		//대문자로 변경
		System.out.println(str.toUpperCase());
		//소문자로 변경
		System.out.println(str.toLowerCase());
		System.out.println(str);//원본은 바뀌지 않음(불변성)
		str = str.toLowerCase();//원본이 바뀌게 됨
		System.out.println(str); 
		
		str="";//(널) 빈 문자열, '\0'처리
		System.out.println("내용 : "+str);
		str=null;//참조 내용이 없음
		System.out.println("내용 : " + str);//주소값 자체가 없음
		
		char ch='\0';//널문자
		System.out.println("내용 : "+ch+", code : "+(int)ch);
		ch = ' ';//단문자 초기화
		System.out.println("내용 : "+ch+", code : "+(int)ch);

	}

}

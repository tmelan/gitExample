package ch13;

public class StrBuildEx {
	
	public static void main(String[] args) {
		StringBuilder str1 = new StringBuilder();
		str1.append("\"I am a ");
		StringBuilder str2 = new StringBuilder();
		str2.append("Java Programmer\"");
		
		String str3=str1.toString();
		String str4=str2.toString();
		System.out.println("--------------------------------------------");
		System.out.println("append() 메소드를 활용 : "+ str3+str4);
		
		System.out.println("replace() 메소드를 활용 : "+ str1 + str2.replace(0, 4, "JSP"));
		System.out.println("substring() 을 활용 : \"" + str2.substring(0,3)+" Programmer\"");
		System.out.println("--------------------------------------------");
	}

}

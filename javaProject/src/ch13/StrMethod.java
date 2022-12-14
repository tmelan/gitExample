package ch13;

public class StrMethod {

	public static void main(String[] args) {
		String str1= "java";
		str1 += " programming";//str1=str1+" programming", 
		//문자열 연결이지만 실제론 새로운 문자열을 만들고 str1은 새로운 문자열의 주소값을 가리키게 된다
		System.out.println(str1);
		System.out.println(str1.length());//문자열의 길이
		String str2=str1.concat(" programming"); //concat()으로도 문자열 연결
		System.out.println(str2);
		System.out.println(str1);
		System.out.println(str1.charAt(2));
		System.out.println(str2.indexOf("program")); //"program"의 시작문자열인 p문자의 위치
		System.out.println(str2.indexOf("z"));//z가 없으면 -1을 리턴
		System.out.println(str2.substring(0, 4)); //시작값과 끝값, 끝값은 -1 / 0,4 이면 실제론 0부터 3
		System.out.println(str2.substring(5)); //5번부터 끝까지 출력 
		System.out.println(str2.replace("java", "jsp")); //java=>jsp로 replace
		System.out.println(str2); //불변성, 원본은 바뀌지 않음 초기화하지 않았으니까 
		
		String str3 = "3578945698712"; //0부터 시작함
		System.out.println(str3.substring(5, 9)); //
		System.out.println(str3.replace(str3.substring(5, 9), "****"));
	}

}

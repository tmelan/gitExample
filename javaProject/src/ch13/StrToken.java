package ch13;

import java.util.StringTokenizer;

public class StrToken {
	public static void main(String[] args) {
		String str="kim,20,180,55,서울,학생";//그냥 한개의 문자열임
		String[] items=str.split(","); //,를 기준으로 데이터를 분리해줌 / ,는 /등 기호 아무거나 사용가능
		for(String s : items) { //향상된 for문
			System.out.println(s);
		}
		
		StringTokenizer st=new StringTokenizer(str, ",");
		int cnt=st.countTokens();//토근의 개수를 리턴해줌(str의 개수)
		System.out.println("토큰의 갯수 : " + cnt);//배열.length와 비슷
		while(st.hasMoreElements()) { // 다음 토큰이 있을때까지 반복 (글자끝나면 빠져나옴 그 전까지 반복)
			System.out.println(st.nextToken()); //토큰하나를 가져와 리턴
		}
	}

}

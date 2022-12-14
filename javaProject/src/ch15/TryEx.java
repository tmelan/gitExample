package ch15;

public class TryEx {

	public static void main(String[] args) {
		int[] num= {10,20,30,40,50};
		
		try {
			for(int i=0; i<=num.length; i++) { //<=일부러 잘못씀, 오류코드 나옴 ->try catch 활용
				System.out.println(num[i]); 
			}
		} catch (ArrayIndexOutOfBoundsException e) { //밑에 오류코드 복붙
			e.printStackTrace(); //제대로 출력되더라도 이걸로 문제점 파악 
		}
	
	}

}
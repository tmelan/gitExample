package ch02;

public class interpret {

	public static void main(String[] args) {
		// 로컬변수(지역변수) : 반드시 초기화 되어야 한다.
		int a;
		int b;
		int tot;
		// tot = a + b; // 변수에 값이 할당되지 않은 상태에서 연산을 하면 에러가 난다. 
		//(순차적 인터프리터 방식이기 때문에)
		
		a=1;
		b=2;
		tot = a + b;
		System.out.println(tot);
		
	}

}

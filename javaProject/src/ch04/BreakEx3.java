package ch04;

public class BreakEx3 {

	public static void main(String[] args) {
		int sum = 0;
		int i = 0;
		while(true) { //무한루프
			if(sum > 100) // 문장 하나일땐 {} 생략가능
				break;
			i++;
			sum += i;
		}
		System.out.println("i=" + i);
		System.out.println("sum=" + sum);
	}

}

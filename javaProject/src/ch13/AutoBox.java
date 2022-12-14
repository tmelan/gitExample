package ch13;

public class AutoBox {

	public static void main(String[] args) {
		//기본 자료형
		int num1=10;
		int num2;
		
		//참조자료형
		Integer i1;//선언만 했을땐 i1의 값은 null상태
		Integer i2=new Integer(20);
		//auto boxing(기본자료형 리터럴을 객체로 박스처리)
		
		i1=num1; //좌변 우변 자료형이 다른데 에러가 안남 => int와 wrapper class인 Integer는 서로 호환되기 때문
		num2=i2; //auto unboxing(객체안에 들어있는 값을 풀어서 저장)
		
		System.out.println(num1+","+i1);
		System.out.println(num2+","+i2); 
	}

}

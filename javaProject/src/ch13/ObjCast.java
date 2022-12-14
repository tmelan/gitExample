package ch13;

public class ObjCast {

	public static void main(String[] args) {
		int a=10; //int 기본자료형 (8개)
		Object obj=20; //object 참조자료형 , 좌:부 =우:자 (다형성)
		
		a=(Integer)obj; //(정상적 형변환, 객체자료형에 맞게 integer를 써줘야) , 형변환 해주기 전에 에러남
		//a=(int)obj; //최신버전이라 에러는 안나는데 원랜 틀린거임
		//원래는 obj가 객체형이기 때문에 기본자료형(int)로 하면 안됨. 최신버전은 허용
		
		System.out.println(a);
		//object배열 : 다양한 자료형 사용 가능
		Object[] obj2= {100, 100.5, true, "hello", 'A'};
		//각 데이터가 Object 객체(Integer,Double,Boolean등)가 되어버린다 = auto boxing
		//그래서 메모리 낭비가 심하다 이렇게 실무에서 쓰지 않음 대신 컬렉션처리(arraylist)를 사용하면 단점을 보완할수 있다
		for(Object o : obj2) { // 객체형은 확장for문 향상된 for문을 써줘야함
			System.out.println(o);//auto unboxing
		}
		
	}

}
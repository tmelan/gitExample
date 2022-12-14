package ch14;

import java.util.Vector;

//컬렉션 : 배열의 단점을 보완한 클래스들
//배열의 단점 : 사이즈 조절이 안되고 삽입 삭제가 어려움, 타입이 고정돼 있고 같은 타입만 들어와야 함
//map 계열 : 순서는 제공되지 않지만 키가 제공됨(인덱스가 없고 키로 조회)
//list 계열 : 순서대로 저장, 키가 없음(인덱스로 조회)
//vector대신 arraylist를 많이 쓴다.

public class VectorExam {
	public static void main(String[] args) {
		Vector<Object> v=new Vector();
		//모든 자료형 처리 가능, 사이즈가 자동으로 늘어남
		//vector v=new vector(); 에러는 아니지만 위처럼 처리하는게 좋음
		System.out.println("초기 사이즈 " + v.capacity()); //10개의 사이즈값을 기본으로 갖는다
		v.add("first"); //add("추가할 자료")
		v.add(2);
		v.add(3.5);
		v.add(true);
		v.add(100);
		v.add(101);
		v.add(103);
		v.add(104);
		v.add(105);
		v.add(106); //10개
		v.add(107); //10개를 넘어가면 10개씩 늘림 
		
		System.out.println("중간 사이즈 : " + v.capacity());
		System.out.println("데이터의 개수 : "+ v.size()); //배열은 .length 를 쓴다
		
		System.out.println("초기 데이터");
		for(int i=0; i<v.size(); i++) {
			System.out.print(v.get(i)+"\t");//주의점 : get메소드에 배열[i] 이렇게 쓰면 안됨 
		}
		
		System.out.println();
		v.add(6, 102);//벡터의 인덱스 번호 6번 자리에 데이터 추가
		for(int i=0; i<v.size(); i++) {
			System.out.print(v.get(i)+"\t");
		}
		
		System.out.println();
		v.remove(0);//벡터의 인덱스 번호 0번 자리에 데이터 삭제
		for(int i=0; i<v.size(); i++) {
			System.out.print(v.get(i)+"\t");
		}
	}

}

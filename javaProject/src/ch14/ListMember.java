package ch14;

import java.util.ArrayList;
import java.util.List;

public class ListMember {
	public static void main(String[] args) {
		//ArrayList<클래스객체> - <Object>대신 만들어 놓은 member 객체를 제너릭하면
		//member에서만 쓰이는 모든 자료형 받을 수 있음 
		List<Member> list=new ArrayList<Member>();
		
		//<방법1> member 인스턴스 생성 후 setter를 활용 지금까지 해온 방법
		Member m1=new Member();
		m1.setName("김철수");
		m1.setUserid("kim");
		m1.setPasswd("1234");
		m1.setTel("02-1234-5678");
		m1.setEmail("kim@naver.com");
		
		//List에 member인스턴스를 추가
		list.add(m1);//arraylist에 member객체 1개 추가 
		System.out.println(list.size());
		
		//<방법2> setter를 안쓰고 생성자(매개변수)를 활용
		Member m2=new Member("hong", "1234", "홍길동", "02-222-3333", "hong@nate.com");
		list.add(m2);//arraylist에 member객체 1개 또 추가
		System.out.println(list.size());
		
		//<방법3> 참조변수를 재사용 안하고 한번만 데이터를 사용하는 경우, 안에 바로 넣어버림
		list.add(new Member("choi", "1234", "최철수", "02-111-3333", "choi@gmail.com"));
		System.out.println(list.size());
		
		System.out.println("이름\t아이디\t비번\t전화\t\t이메일");
		for(int i=0; i<list.size(); i++) {
			Member m=list.get(i); //m은 arraylist의 각 데이터를 가리킨 임시 참조변수로 활용
			System.out.println(m.getName()+"\t"+m.getUserid()+"\t"+m.getPasswd()+"\t"+
			m.getTel()+"\t"+m.getEmail());
		}
		
	}

}

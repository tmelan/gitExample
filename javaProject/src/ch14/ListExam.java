package ch14;

import java.util.ArrayList;
import java.util.List;

//arraylist : vector와 사용법이 비슷함 벡터가 더 무겁고 arraylist는 빠르고 가볍다 
public class ListExam {
	public static void main(String[] args) {
		List<Object> list = new ArrayList<>(); //다형성 기법 좌 부object 우 자arraylist
		list.add("하나"); //.add 추가할 값 
		list.add(2);
		list.add(5.5);
		list.add(false);
		list.add(2, 4);
		list.remove(3);//삭제할 인덱스 번호 
		
		for(int i=0; i<list.size(); i++) {
			System.out.print(list.get(i)+"\t");
		}
	}

}

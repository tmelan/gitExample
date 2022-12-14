package ch14;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapList {
	static void print(Map<String, Object> map) {
		ArrayList<Student> list2 = (ArrayList<Student>)map.get("list");
		for(Student s : list2) {
			System.out.println(s.getNum()+"\t"+s.getName()+"\t"+s.getMajor()
			+"\t"+s.getYear()+"\t"+s.getProfessor());
		}

	}
	public static void main(String[] args) {
		Map<String, Object> map=new HashMap<>();//맵 인스턴스 생성
		List<Student> list=new ArrayList<>();//리스트 인스턴스 생성
		list.add(new Student("201801", "kim", "전산", 1, "park"));//리스트에 student추가
		list.add(new Student("201902", "choi", "영문", 1, "hong"));
		list.add(new Student("202003", "lee", "경제", 1, "min"));
		map.put("list", list); //앱에 리스트 추가
		
		print(map);//압축파일처럼 list안의 3개 객체가 map에 담겨져 print쪽 매개변수화돼 넘김
	}

}

package ch07;

public class PointUse {

	public static void main(String[] args) {
		Point p1=new Point();
		//데이터입력
		p1.setName("김철수");
		p1.setKor(90);
		p1.setEng(80);
		p1.setMat(89);
		//p1.setTot("김철수");
		//p1.setAvg("김철수");
		//p1.setGrade("김철수");
		//출력 
		//계산용도는 set활용하지 않아도 됨 (tot, avg)
		p1.print();
	}

}

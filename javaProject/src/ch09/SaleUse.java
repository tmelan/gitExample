package ch09;

public class SaleUse {

	public static void main(String[] args) {
		Sale s1=new Sale();
		//데이터입력
		s1.input(1, "냉장고", "LG", "202203", 2000, 5);
		s1.calc();
		s1.print();

	}

}

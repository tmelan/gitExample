package ch14;

import java.util.ArrayList;
import java.util.List;

public class ProductUse {
	public static void main(String[] args) {
		List<Product> pro= new ArrayList<>();
		System.out.println("2건의 제품정보를 입력하세요.");
		Product p1 = new Product(0, null, null, 0, 0, 0);
		p1.print();
		Product p2 = new Product(0, null, null, 0, 0, 0);
		p2.print();
		pro.add(p1);
		pro.add(p2);
		
		System.out.println("(단위:천원)");
		System.out.println("----------------------------------------------");
		System.out.println("제품번호\t제품명\t제조사\t단가\t수량\t금액");
		System.out.println("----------------------------------------------");
		for(int i=0; i<pro.size(); i++) {
			Product p=pro.get(i);
			System.out.println(p.getIndex()+"\t"+p.getName()+"\t"+p.getMfr()+"\t"+
			p.getCost()+"\t"+p.getVolume()+"\t"+p.getPrice());
		}
		System.out.println("----------------------------------------------");


	}

}

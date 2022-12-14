package ch14;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EcUse {
	public static void main(String[] args) {
		Map<String, Object> map = new HashMap<>();
		List<EC> list = new ArrayList<>();
		list.add(new EC(1234, "2022-08-24", "하이트", "삼성", "37918000068", 55900));
		list.add(new EC(2345, "2022-09-11", "꼬깔콘", "롯데",  "35691000045", 23600));
		list.add(new EC(3456, "2022-10-29", "노트북", "현대",  "36160000082", 2600000));
		
		map.put("list", list);
		print(map);	
	}
	static void print(Map<String, Object> map) {
		ArrayList<EC> list2=(ArrayList<EC>)map.get("list");
		DecimalFormat decFormat = new DecimalFormat("###,###");
		System.out.println("----------------------------------------------------");
		System.out.println("주문번호\t주문일자\t\t주문상품\t카드명\t카드번호\t\t결제금액");
		System.out.println("----------------------------------------------------");
		for(EC s : list2) {
			System.out.println(s.getNo()+"\t"+s.getOrderDate()+"\t"+s.getProduct()+"\t"+
			s.getCardName()+"\t"+s.getCardNo()+"\t"+decFormat.format(s.getPay()));	
		}
		System.out.println("----------------------------------------------------");
	}
	
	//s.getCardNo().replace(s.getCardNo().substring(5, 9), "****") 마스킹처리 

}

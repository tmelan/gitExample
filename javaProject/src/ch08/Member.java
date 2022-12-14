package ch08;

public class Member {
	String name;
	String id;
	int price;
	String grade;
	
	public Member() { 
		this("홍길동", "hong", 120000);	
	} 
	public Member(String name) { 
		this(name, "hong", 120000);
	}
	public Member(String name, String id) { 
		this(name, id, 120000);
	}
	public Member(String name, String id, int price) { 
		this(name, id, price, "gold");
	}
	public Member(String name, String id, int price, String grade) {
		this.name=name; 
		this.id=id;
		this.price=price;
		if (this.price >= 100000) {
			this.grade = "gold";
		} else this.grade = "silver";
	}	 
	
	public void show() {
		System.out.println("--------------------------------");
		System.out.println("이름\t아이디\t구매금액\t등급");
		System.out.println("--------------------------------");
		System.out.println(name+"\t"+id+"\t"+price+"\t"+grade);
	}
}
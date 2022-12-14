package ch07;

public class Auction {
	String name;
	String ID;
	int price;
	String grade;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getGrade() {
		
		return grade;
	}
	public void setGrade(String grade) {
		if(getPrice()>=100000) {
			grade = "gold";
		} else {
			grade = "silver";
		}
		this.grade = grade;
	}
	public void print() {
		System.out.println("이름\t아이디\t구매금액\t등급");
		System.out.println(name+"\t"+ID+"\t"+price+"\t"+grade);
	}
	
}

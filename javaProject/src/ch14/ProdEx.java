package ch14;

public class ProdEx {
	private String name;
	private String num;
	private String company;
	private int price;
	private int amount;
	private int money; 
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}

	public ProdEx(String name, String num, String company, int price, int amount, int money) {
		super();
		this.name = name;
		this.num = num;
		this.company = company;
		this.price = price;
		this.amount = amount;
		this.money = money;
	}
	
}

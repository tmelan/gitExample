package ch14;

import java.util.Scanner;

public class Product {
	private int index;
	private String name;
	private String mfr;
	private int cost;
	private int volume;
	private int price;
	
	public void print() {
		Scanner scan = new Scanner(System.in);
		System.out.println("제품번호 :");
		index=scan.nextInt();
		System.out.println("제품명 :");
		name=scan.next();
		System.out.println("제조사 :");
		mfr=scan.next();
		System.out.println("단가 :");
		cost=scan.nextInt();
		System.out.println("수량 :");
		volume=scan.nextInt();
		price=cost*volume;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMfr() {
		return mfr;
	}

	public void setMfr(String mfr) {
		this.mfr = mfr;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Product(int index, String name, String mfr, int cost, int volume, int price) {
		super();
		this.index = index;
		this.name = name;
		this.mfr = mfr;
		this.cost = cost;
		this.volume = volume;
		this.price = price;
	}

	
}

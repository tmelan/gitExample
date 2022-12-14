package ch09;

public class Manager extends Employee {
	private int num;
	protected int salary;
	private String rrn;
	
	public void input(int num, int salary, String rrn) {
		this.num=num;
		this.salary = salary;
		this.rrn = rrn;
	}
	
	public void print() {
		System.out.println("------------------------");
		System.out.println("사원번호 : " + num);
		System.out.println("이   름 : " + getName());
		System.out.println("주   소 : " + getAddress());
		System.out.println("이메일주소 : " + getEmail());
		System.out.println("연   봉 : " + salary);
		System.out.println("주민번호 : " + rrn);
		System.out.println("------------------------");
	}

}

package ch07;

public class Employee2 {
	private String name;
	private String part;
	private String position;
	private int basic;
	private int bonus;//기본급의 300%
	private int total;//총액(기본급+보너스)
	private int tax;//세액(총액의 3.3%
	private int salary;//실수령액(총액-세액)
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPart() {
		return part;
	}
	public void setPart(String part) {
		this.part = part;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public int getBasic() {
		return basic;
	}
	public void setBasic(int basic) {
		this.basic = basic;
	}
	public int getBonus() {
		return bonus;
	}
	public void setBonus(int bonus) {
		bonus=basic*3;
		this.bonus = bonus;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		total=basic+bonus;
		this.total = total;
	}
	public int getTax() {
		return tax;
	}
	public void setTax(int tax) {
		tax=(int)(total*0.033);
		this.tax = tax;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		salary=total-tax;
		this.salary = salary;
	}

	public void print() {
		System.out.println("이름\t부서\t직위\t기본급\t보너스\t총액\t세액\t실수령액");
		System.out.println(name+"\t"+part+"\t"+position+"\t"+basic+"\t"+getBonus()+"\t"+getTotal()+"\t"+getTax()+"\t"+getSalary());
	}
}

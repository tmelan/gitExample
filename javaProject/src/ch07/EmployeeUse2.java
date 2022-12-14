package ch07;

public class EmployeeUse2 {

	public static void main(String[] args) {
		Employee2 e2 = new Employee2();
		e2.setName("김철수");
		e2.setPart("관리부");
		e2.setPosition("과장");
		e2.setBasic(300);
		e2.setBonus(0);
		e2.setTotal(0);
		e2.setTax(0);
		e2.setSalary(0);
		e2.print();

	}

}

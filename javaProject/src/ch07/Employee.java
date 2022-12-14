package ch07;
//get set 안만들고 
public class Employee {
	private String name;
	private String part;
	private String position;
	private int basic;
	private int bonus;//기본급의 300%
	private int total;//총액(기본급+보너스)
	private int tax;//세액(총액의 3.3%
	private int salary;//실수령액(총액-세액)
	//일반메소드처리(오른쪽버튼-소스-using fields
	public void input(String name, String part, String position, int basic) {
		this.name = name;
		this.part = part;
		this.position = position;
		this.basic = basic;
	}
	//계산
	public void calc() {
		bonus=basic*3;
		total=basic+bonus;
		tax=(int)(total*0.033); //큰거를 작은거로 변환할때 강제형변환 double이 int보다 큼
		salary=total-tax;
		
	}
	//출력용도
	public void print() {
		System.out.println("이름\t부서\t직위\t기본급\t보너스\t총액\t세액\t실수령액");
		System.out.println(name+"\t"+part+"\t"+position+"\t"+basic+"\t"+bonus+"\t"+total+"\t"+tax+"\t"+salary);
	}
	
}

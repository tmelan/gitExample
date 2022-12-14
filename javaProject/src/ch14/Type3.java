package ch14;

public class Type3<T> {//자료형이 미정인 상태 <> 안에 아무 문자나 들어와도 됨 
	T t; //변수도 자료형 미정
	public void setT(T t) { //메소드도 자료형 미정
		this.t = t;
	}
	public T getT() {
		return t;
	}
	
	public static void main(String[] args) {
		Type3<String> t=new Type3<String>();
		t.setT("Hello");
		System.out.println(t.getT());
		
		Type3<Integer> t2=new Type3<Integer>();
		t2.setT(100);
		System.out.println(t2.getT());
		
		Type3<Double> t3=new Type3<Double>();
		t3.setT(100.1);
		System.out.println(t3.getT());
	}
}

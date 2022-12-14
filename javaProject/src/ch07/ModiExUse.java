package ch07;

import ch06.ModiEx;  //protected로 바꾸니까 에러남 안나게 하려면 extends 써줘야 (상속)

public class ModiExUse extends ModiEx {
	//상속관계를 자세히 다룰 예정 
	//상속관계에 있어서 부모클래스가 아닌 자식클래스를 인스턴스화 해야함
	
	public static void main(String[] args) {
		ModiExUse me=new ModiExUse();
		System.out.println(me.name); 

	}

}

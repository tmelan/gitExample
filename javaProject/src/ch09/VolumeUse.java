package ch09;

public class VolumeUse {

	public static void main(String[] args) {
		Volume vol = new Volume();//객체생성
		System.out.println("부피 : " + vol.getVolume()); // 0*0
		Volume vol2 = new Volume(10, 20, 30);
		System.out.println("부피 : " + vol2.getVolume()); // 600*10
		
	}

}

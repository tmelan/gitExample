package ch08;

public class MyManagerUse {
	public static void main(String[] args) {
		//MyManager mgrobj=new MyManager(10); // private라 안됨 
		MyManager mgrobj=MyManager.getInstance(); //=>이걸로 해야함 class명.메소드명으로 접근가능
		System.out.println(mgrobj); //주소값이 생성 = 객체가 생성됨
		System.out.println("mgrobj.getScore() : " + mgrobj.getScore());
		mgrobj.setScore(100);
		System.out.println("mgrobj.getScore() : " + mgrobj.getScore());
		
		//2)두번째 생성 및 호출
		MyManager newobj=MyManager.getInstance();
		System.out.println(newobj); //주소값이 같음 싱글톤!
		System.out.println("newobj.getScore() : " +newobj.getScore()); 
	}

}

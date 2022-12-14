package ch16;

public class MyBank {
	public synchronized void hong() {
		for(int i=1; i<=5; i++) { 
			System.out.println("홍길동님의 통장잔고는 "+i*10+"만원입니다.");
			try {
				Thread.sleep((int)(Math.random()*1000));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}	
	}
	
	public synchronized void sa() {
		for(int i=2; i<=6; i++) { 
			System.out.println("사임당님의 통장잔고는 "+i*10+"만원입니다.");
			try {
				Thread.sleep((int)(Math.random()*1000));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public synchronized void lee() {
		for(int i=3; i<=7; i++) {
			System.out.println("이몽룡님의 통장잔고는 "+i*10+"만원입니다.");
			try {
				Thread.sleep((int)(Math.random()*1000));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}	
	} 
}

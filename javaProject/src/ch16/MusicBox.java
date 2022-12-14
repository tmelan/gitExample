package ch16;

public class MusicBox {//공유 객체
	//가요음악
	//메소드 이름 앞에  synchronized를 붙이면 해당메소드는 객체 사용권(모니터링 락)을 얻는다 
	public synchronized void playMusicA() {
		for(int i=0; i<10; i++) { //1초 이하로 쉬면서 10번 반복
			System.out.println("가요 음악!!!");
			try {
				Thread.sleep((int)(Math.random()*1000));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}//for		
	}//playMusiA()
	
	//팝송 음악
	public synchronized void playMusicB() {
		for(int i=0; i<10; i++) { //1초 이하로 쉬면서 10번 반복
			System.out.println("팝송 음악!!!");
			try {
				Thread.sleep((int)(Math.random()*1000));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	//클래식 음악
	//synchronized를 붙히지 않는 메소드는 다른 스레드들이 모니터링락을 획득했어도 그것과 상관없이 실행된다 
	//제대로 실행되게 하려면 모든 메소드에 synchronized를 붙여야 한다
	public void playMusicC() {
		for(int i=0; i<10; i++) { //1초 이하로 쉬면서 10번 반복
			//전체 메소드에 적용하지 않고 특정 부분만 synchronized블럭처리를 할 수 있다 
			synchronized (this) { //this는 music box객체 자신 자체를 가리킴
				System.out.println("클래식 음악!!!");
			}
			
			//System.out.println("클래식 음악!!!");
			try {
				Thread.sleep((int)(Math.random()*1000));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}	
	} 
}

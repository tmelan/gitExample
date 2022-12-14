package ch16;

//데몬 스레드는 보통 유닉스(리눅스) 운영체제에서 백그라운드로 동작하는 프로글램을 말한다
//데몬 스레드는 스레드에 데몬설정을 해서 사용한다. 윈도우에서는 서비스라고 한다 
//데몬 스레드는 일반 스레드가 모두 종료되면 강제적으로 종료되는 특징을 가진다 
public class DaemonThread implements Runnable {
	
	@Override
	public void run() {
		while(true) { //무한반복 
			System.out.println("데몬 스레드가 실행 중 입니다. ");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
				break; //예외가 발생할 때 while문 빠져나감 
			}
		}		
	}//run()
	
	public static void main(String[] args) {
		Thread th=new Thread(new DaemonThread());
		th.setDaemon(true);//데몬스레드로 설정 
		th.start();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("메인 스레드가 종료됩니다.");
	}	
}
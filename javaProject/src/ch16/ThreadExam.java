package ch16;

//멀티스레드 : 작업단위가 2개 이상
//멀티스레드 구현 방법
//1) Thread를 상속
//2) Runnable 을 구현 

public class ThreadExam extends Thread { 
	public ThreadExam(String name) {
		super(name);//부모생성자(Thread) 호출, 타이틀 처리  
	}
	//스레드 실행 메소드 
	@Override
	public void run() { //Thread 의 추상메소드, 반드시 오버라이딩
		for(int i=1; i<=5; i++) {
			System.out.println(Thread.currentThread().getName());//현재 실행중인 스레드이름 출력
		}
		try {
			Thread.sleep(1000);//cpu의 실행 시간을 1초간  멈춤 (1000밀리세컨즈) 
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}//지금까지 전부 non static 이므로 메인메소드에서 생성
	
	public static void main(String[] args) {
		ThreadExam e1=new ThreadExam("thread1");
		ThreadExam e2=new ThreadExam("thread2");
		ThreadExam e3=new ThreadExam("thread3");
		
		e1.start();//스레드.start() ==> 자동으로 run메소드 자동 호출해줌
		e2.start();//위와 동시에 호출 
		e3.start();//위와 동시에 호출, 즉 3개가 동시에 run()호출함
		//e1.run();은 메인스레드가 실행되기 때문에 주의해야 한다 
	}

}

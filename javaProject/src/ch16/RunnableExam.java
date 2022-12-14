package ch16;

public class RunnableExam implements Runnable {

	@Override
	public void run() {
		for(int i=1; i<=100; i++) {
			System.out.println(Thread.currentThread().getName()+"==>"+i);
		}		
	}
	
	public static void main(String[] args) {
		RunnableExam e1=new RunnableExam();
		//runnable 쓸 떄 thread 별도로 생성해서 써야한다 
		
		//implements를 받을땐 new Thread(스레드구현객체, "스레드이름")을 해줘야함 
		Thread t1=new Thread(e1, "thread1");
		Thread t2=new Thread(e1, "thread2");
		
		t1.start();//run()이 호출됨
		t2.start();		
	}

}

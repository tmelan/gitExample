package ch16;

//single thread 작업단위가 1개(main 스레드만 존재)
public class SingleThread {
	void print() {
		//현재 실행중인 스레드(currentThread)의 이름(getname)
		System.out.println(Thread.currentThread().getName());
		for(int i=0; i<=5; i++) {
			System.out.println(i);
		}
	}

	public static void main(String[] args) { //main메솓도 스데르였다 (싱글 스레드) , 메인 스레드
		SingleThread t = new SingleThread();
		t.print(); //스레드의 이름이 나옴 
		t.print();

	}

}

package ch16;

public class ThreadExam1 {
	public static void main(String[] args) {
		MyThread1 t1=new MyThread1("*");
		MyThread1 t2=new MyThread1("-");
		t1.start();
		t2.start();
	}
//실행할때마다 결과가 달라짐 math random때문에 
}

package ch16;

public class MusicBoxExam1 {

	public static void main(String[] args) {
		MusicBox box = new MusicBox(); //MusicBox 인스턴스 생성
		
		MusicPlayer kim = new MusicPlayer(1, box); //music player 인스턴스 생성(매개변수가 있는 생성자 사용)
		MusicPlayer lee = new MusicPlayer(2, box);
		MusicPlayer park = new MusicPlayer(3, box);
		
		//music player 스레드 실행 -> 실행할 때 마다 결과가 다름(우선순위를 마음대로 정함)
		kim.start();
		lee.start();
		park.start();
	}//MusicBox 에 synchronized 빼고하는 것과 결과가 다르게 나옴

}

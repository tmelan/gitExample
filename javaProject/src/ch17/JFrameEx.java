package ch17;

import javax.swing.JFrame;

public class JFrameEx extends JFrame {
	//main 메소드에서 gui코드를 작성해도 되지만 가급적 frame extends 받아 기본생성자에서 gui코드처리 하는것을 권장한다. 
	
	public JFrameEx() {
		super("JFrame 예제"); //제목처리, 부모생성자 호출 
		setSize(400, 300);
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		new JFrameEx();//객체생성겸 기본생성자 호출
	}

}

package ch17;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GridEx2 extends JFrame {
	public GridEx2() {
		super("GridLayout 예제2");
		setLayout(new GridLayout(3, 3));//3행 3열
		for(int i=1; i<=9; i++) {//button번호 for문으로 자동추가
			JButton button=new JButton("button"+i); 
			add(button);
		}
		setSize(500, 500);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new GridEx2();
	}

}

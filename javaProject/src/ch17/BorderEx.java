package ch17;

import java.awt.Button;

import javax.swing.JFrame;

public class BorderEx extends JFrame {
	
	public BorderEx() {//기본 생성자 
		setTitle("BorderLayout 예제");
		setSize(500, 400);
		setVisible(true);
		
		//버튼 생성
		Button b1=new Button("east");
		Button b2=new Button("west");
		Button b3=new Button("south");
		Button b4=new Button("north");
		Button b5=new Button("center");
		
		//보더레이아웃은 frame 기본 레이아웃이기 때문에 생략가능
		//setLayout(new BorderLayout());
		add(b1, "East"); //east영역에 배치
		add(b2, "West");
		add(b3, "South");
		add(b4, "North");
		add(b5, "Center"); // 또는 add(b5)
		
		addWindowListener(null);
	}
	

	public static void main(String[] args) {
		new BorderEx();
	}

}

package ch17;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
//이벤트 처리를 외부파일에서 구현
public class EventEx2 extends JFrame {
	private JButton button1,button2,button3,button4,button5,button6;
	public EventEx2() {
		//플로우 레이아웃으로 변경
		setLayout(new FlowLayout());
		button1 = new JButton("Red"); //버튼 생성
		button2 = new JButton("Green");
		button3 = new JButton("Blue");
		button4 = new JButton("White");
		button5 = new JButton("Yellow");
		button6 = new JButton("Cyan");
		
		//프레임에 버튼 붙이기 한줄로도 가능
		add(button1); add(button2); add(button3);
		add(button4); add(button5); add(button6);
		
		//버튼을 누르면 MycolorAction에서 구현한 actionPerformed()가 자동 호출됨
		//버튼에 이벤트 기능 추가, 아까 만든 매개변수 2개 생성자에 추가
		button1.addActionListener(new MyColorAction(this, Color.red));
		//이벤트 핸들러를 외부클래스에서 생성 및 호출해서 구현함, this eventex2 자신의 객체를 가리키는 것 
		//또한 데이터 타입으로 JFrame 이 된다(JFrame을 상속받았기 때문)
		button2.addActionListener(new MyColorAction(this, Color.green));
		button3.addActionListener(new MyColorAction(this, Color.blue));
		button4.addActionListener(new MyColorAction(this, Color.white));
		button5.addActionListener(new MyColorAction(this, Color.yellow));
		button6.addActionListener(new MyColorAction(this, Color.cyan));
		
		setSize(500, 400);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE); //현재 창만 닫음
	}
	
	public static void main(String[] args) {
		new EventEx2();
	}
}
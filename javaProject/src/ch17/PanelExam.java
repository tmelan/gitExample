package ch17;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class PanelExam extends JFrame {
	public PanelExam() { //기본생성자에서 gui코드 작성을 권장함 
		//패널에는 2개 이상의 컴포넌트를 배치할 수 있기 떄문에 버튼을 패널에 추가 후
		//패널을 프레임에 붙여 여러 개의 컴포넌트 처리를 할 수 있다 
		JPanel p=new JPanel();//패널 생성
		p.setBackground(Color.red);//패널의 배경색상 설정
		//버튼 생성(swing은 한글처리가 잘된다)
		JButton button1=new JButton("버튼1");
		JButton button2=new JButton("버튼2");
		JButton button3=new JButton("버튼3");
		JButton button4=new JButton("버튼4");
		JButton button5=new JButton("버튼5");
		JButton button6=new JButton("버튼6");
		
		//패널에 버튼 추가
		p.add(button1); 
		p.add(button6);
		
		//보더레이아웃에 버튼 및 패널을 추가
		add(p, BorderLayout.NORTH);//패널에 버튼 추가한 것을 north영역에 배치
		add(button2);//보더레이아웃의 위치를 생략하면 자동으로 center에 배치됨 
		add(button3, "South");
		add(button4, "West");
		add(button5, "East");
		
		setSize(300, 300);//화면사이즈 설정
		setVisible(true); //이거 안하면 프레임 안보임
		
		//윈도우 닫기 버튼을 누르면 프로그램 완전 종료
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) { //메인메소드
		new PanelExam(); //기본생성자에서 호출만하면 됨
	}
}

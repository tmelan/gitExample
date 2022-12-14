package ch17;


import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class FlowLayoutEx2 extends JFrame {
	//멤버변수
	JPanel jp;//JPanel 변수 선언
	JButton jb1,jb2,jb3,jb4,jb5,jb6;//버튼 변수 선언
	
	public FlowLayoutEx2() {
		super("FlowLayout 예제2");
		jp=new JPanel();//패널생성
		
		jb1=new JButton("버튼1");//버튼생성
		jb1=new JButton("버튼2");
		jb1=new JButton("버튼3");
		jb1=new JButton("버튼4");
		jb1=new JButton("버튼5");
		jb1=new JButton("버튼6");	
		
		jp.add(jb1);//패널에 버튼 추가
		jp.add(jb2);
		jp.add(jb3);
		jp.add(jb4);
		jp.add(jb5);
		jp.add(jb6);
		
		//패널을 flowLayout으로 설정
		jp.setLayout(new FlowLayout()); //패널의 기본 레이아웃은 FlowLayout이라 생략 가능함 
		
		add(jp, "South");//JFrame의 south영역에 패널 배치
		setSize(600, 500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
	}
	
	public static void main(String[] args) {
		new FlowLayoutEx2();
	}
	
}

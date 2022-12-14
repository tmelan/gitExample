package ch17;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FlowLayoutEx1 extends JFrame {
	public FlowLayoutEx1() { //기본 생성자 생성 후 코딩
		setTitle("FlowLayout 기본 예제");//setTitle 프레임 제목 설정
		setSize(300, 200);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//위 사항들은 위치가 어디 있어도 상관없음
		
		//원래 JFrame, Frame의 기본 레이아웃은 BorderLayout이다
		//FlowLayout으로 레이아웃 변경 시 setLayout 사용
		//setLayout(new FlowLayout); 1. 이 방법도 있지만
		setLayout(new FlowLayout(FlowLayout.LEFT, 30, 40));
		//2. 왼쪽정렬, 컴포넌트 간 좌우간격 30픽셀, 상하간격 40픽셀로 옵션 설정
		
		//레이아웃에 버튼 생성 및 추가 
		add(new JButton("1"));
		add(new JButton("2"));
		add(new JButton("3"));
		add(new JButton("4"));
		add(new JButton("5"));		
	}
	public static void main(String[] args) {
		new FlowLayoutEx1(); //생성만 해 주면 됨
	}
}
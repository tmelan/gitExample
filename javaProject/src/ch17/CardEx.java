package ch17;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class CardEx extends JFrame{
	CardLayout card; // 카드레이아웃 멤버변수 선언
	Container con;
	public CardEx() {// 기본생성자
		super("CardLayout 예제");
		card = new CardLayout(); // 카드 레이아웃 생성 
		con = getContentPane();// 프레임의 컨텐츠 영역을 만들어 처리
		setLayout(card);//기본 레이아웃을 카드레이아웃으로 변경
		JPanel[] pan=new JPanel[5]; //패널 배열 5개 생성
		Color[] color= {Color.red, Color.yellow, Color.green, Color.blue, Color.cyan};
		for(int i=0; i<pan.length;i++) {
			pan[i]=new JPanel();//패널 생성
			pan[i].setBackground(color[i]);//패널의 배경색 설정
			add("card"+i, pan[i]);//add("이름", 컴포넌트)
			
			//패널에 마우스 이벤트 추가 
			pan[i].addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent e) {
					card.next(con);//다음 화면으로 이동				
				}	
			});
			setSize(500, 500);
			setVisible(true);
			setDefaultCloseOperation(EXIT_ON_CLOSE);
		}
	}//생성자
	
	public static void main(String[] args) {
		new CardEx(); //생성자 호출
	}

}

package ch17;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JApplet;

// JApplet applet의 확장판 1995년 처음 소개됨 
// 애플릿뷰어나 웹브라우저와 함께 쓰였고 게임 및 다양한 그래픽 구사가능 
// 현재는 html5 등 웹이 진화되면서 거의 활용되진 않는다 
// 라이프 사이클을 가지고 있다 init()-start()-stop()-destroy()
// init()은 필수처리 나머지는 자동으로 처리된다 

public class StringLine extends JApplet {
	@Override
	public void init() {//applet 초기화
		getContentPane().setBackground(new Color(255,255,255));
		setSize(500, 500);//applet 화면 사이즈
	}
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		g.setColor(Color.blue);
		//선그리기(x1, y1, x2,y2)
		g.drawLine(250, 5, 30, 160);
		
		g.setColor(Color.red);
		g.drawString("Red string", 10, 50);
		
		g.setColor(Color.green);
		g.drawString("Green string", 10, 80);//좌표는 겹치면 안됨
		
		g.setColor(Color.blue);
		g.drawString("Blue string", 10, 110);
	}
}

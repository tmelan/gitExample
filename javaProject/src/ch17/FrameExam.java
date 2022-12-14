package ch17;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.WindowConstants;

//AWT : java c 개발 점차 없어지는 추세
//swing : AWT 향상 버전 java로만 개발 

public class FrameExam {

	public static void main(String[] args) {
		Frame f = new Frame("프레임 테스트");//frame(창) 생성
		f.setSize(300, 400);//프레임 사이즈 설정
		f.setVisible(true); //꼭 해줘야 함 기본이 false인데 false하면 숨김상태가 됨
//		f.addWindowListener(new WindowListener() { //익명클래스로 이벤트 핸들러 처리 / ctrl space 하니 밑에 생성 
//			
//			@Override
//			public void windowOpened(WindowEvent e) {
//				// TODO Auto-generated method stub
//				
//			}
//			
//			@Override
//			public void windowIconified(WindowEvent e) {
//				// TODO Auto-generated method stub
//				
//			}
//			
//			@Override
//			public void windowDeiconified(WindowEvent e) {
//				// TODO Auto-generated method stub
//				
//			}
//			
//			@Override
//			public void windowDeactivated(WindowEvent e) {
//				// TODO Auto-generated method stub
//				
//			}
//			
//			@Override
//			public void windowClosing(WindowEvent e) {
//				//프로그램 종료 처리, 정상 종료 : 0, 비정상 종료 : -1
//				//이 처리를 안하면 안 꺼짐
//				System.exit(0);
//			}
//			
//			@Override
//			public void windowClosed(WindowEvent e) {
//				// TODO Auto-generated method stub
//				
//			}
//			
//			@Override
//			public void windowActivated(WindowEvent e) {
//				// TODO Auto-generated method stub
//				
//			}
//		}); //익명클래스 
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
					
}

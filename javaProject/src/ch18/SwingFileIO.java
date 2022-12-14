package ch18;

import java.awt.Container;
import java.awt.FileDialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class SwingFileIO extends JFrame implements ActionListener {
	Container cp;
	JButton btnSave, btnLoad;
	JTextArea ta;
	
	public SwingFileIO(String title) {
		super(title);
		cp=this.getContentPane();//프레임 위 기본 패널
		this.setBounds(100, 100, 400, 400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setDesign();//메소드 생성
		this.setVisible(true);
		
	}
	
	public void setDesign() { //메소드는 항상 퍼블릭이어야 함
		JPanel pTop=new  JPanel();
		btnSave=new JButton("save file");
		btnLoad=new JButton("load file");
		pTop.add(btnSave);
		pTop.add(btnLoad);
		this.add("North", pTop);//보더레이아웃의 north 영역에 패널 배치
		
		ta=new JTextArea();
		JScrollPane sp=new JScrollPane(ta);
		this.add("Center", sp);//센터 영역에 textarea 관련 패널 배치
		
		btnSave.addActionListener(this);
		btnLoad.addActionListener(this);		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object ob=e.getSource();
		if(ob==btnSave) { //파일 저장 기능
			FileDialog fd = new FileDialog(this, "savig file", FileDialog.SAVE);
			fd.setVisible(true);
			String filename=fd.getDirectory()+fd.getFile();
			if(fd.getFile()==null) {
				return;//그냥 리턴하면 종료임
			}
			
			FileWriter fw=null;
			try {
				fw=new FileWriter(filename);
				fw.write(ta.getText());
				ta.setText("saved");
				fw.close();
			} catch (Exception e2) {
				e2.printStackTrace();		
			}
		} else if(ob==btnLoad) {//파일불러오기 기능
			FileDialog dlg=new FileDialog(this, "open file", FileDialog.LOAD);
			dlg.setVisible(true);
			String filename=dlg.getDirectory()+dlg.getFile();
			if(dlg.getFile()==null) 
				return;
			FileReader fr=null;
			try {
				fr=new FileReader(filename);
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			
			BufferedReader br=null;
			br=new BufferedReader(fr);
			ta.setText("");//이전 글을 모두 삭제한다 
			while (true) {
				String line="";
				try {
					line=br.readLine();
				} catch (Exception e2) {
					e2.printStackTrace();
				}
				if(line==null)
					break;
				ta.append(line+"\n");
			}
			try {
				br.close();
				fr.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
	}//actionperformed() 끝
	
	public static void main(String[] args) {
		new SwingFileIO("파일 입출력");
	}

}

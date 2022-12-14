package ch19;

import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;

//서버용 프로그램(먼저 실행)
public class DataServer {
	public static void main(String[] args) throws Exception {
		//try~with문 
		try(ServerSocket ss = new ServerSocket(5040)) {
			System.out.println("서비스가 시작되었습니다.");
			while (true) {
				//client socket 
				//클라이언트 쪽에서 접속하면 소켓으로 연결(논리적 회선 연결)
				Socket socket=ss.accept();
				PrintWriter out=new PrintWriter(socket.getOutputStream(), true);
				SimpleDateFormat sdf=new SimpleDateFormat("yyyy년 mm월 dd일 hh시 mm분 ss초");
				String str=sdf.format(new Date());//시스템 날짜 
				out.println(true);//클라이언트에게 데이터 전송
				socket.close();//연결종료
			}
		}

	}

}
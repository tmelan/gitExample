package ch19;

import java.net.DatagramSocket;

//tcp 방식 - 연결성(서버와 클라이언트가 연결된 상태에서 데이터 송수신)
//udp 방식 - 비연결성(단방향 전송)
public class UDPEchoServer {
	public UDPEchoServer(int port) {
		try {
			DatagramSocket ds=new DatagramSocket(port);
			while (true) {
				
			}
		} catch (Exception e) {
			
		}
	}
}

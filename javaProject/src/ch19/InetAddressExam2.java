package ch19;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressExam2 {

	public static void main(String[] args) {
		//getAllByName(url) 여러개의 ip주소를 배열로 저장 try catch  써줘야함
		try {
			InetAddress[] address = InetAddress.getAllByName("daum.net");
			for(int i=0; i<address.length; i++) {
				System.out.println(address[i]);
			}
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}

	}

}

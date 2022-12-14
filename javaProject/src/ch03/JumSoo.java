package ch03;

import java.util.Scanner;

public class JumSoo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String name; 
		int Java, DB, HTML, JSP, tot;
		double avg;
		
		System.out.print("이름 : ");
		name = scan.next(); 
		System.out.print("Java 점수 : ");
		Java = scan.nextInt();
		System.out.print("DB 점수 : ");
		DB = scan.nextInt();
		System.out.print("HTML 점수 : ");
		HTML = scan.nextInt();
		System.out.print("JSP 점수 : ");
		JSP = scan.nextInt();
		scan.close();
		
		tot = Java + DB + HTML + JSP;
		avg = tot / 4.0;
		
		System.out.println("===================================");
		System.out.println("이름\tJava\tDB\tHTML\tJSP\t총점\t평균");
		System.out.println("-----------------------------------------------------");
		System.out.println(name+"\t"+Java+"\t"+DB+"\t"+HTML+"\t"+JSP+"\t"+tot+"\t"+avg);
		System.out.println("===================================");

	}

}

package ch13;

public class WrapperEx3 {
	public static void main(String[] args) {
		char[] chr = {'H','e','l','l','o','1','2','3','4'};
		for(int i=0; i<chr.length; i++) {		
			if(Character.isUpperCase(chr[i])) {
				System.out.println(chr[i] + "는 대문자입니다.");
			}else if(Character.isLowerCase(chr[i])) {
				System.out.println(chr[i] + "는 소문자입니다.");
			}else {
				System.out.println(chr[i]+"는 숫자입니다.");
			}

		  }
		
		String num = "1234";
		Integer i=new Integer(1234);
		System.out.println();
		
		System.out.println("문자 " +Integer.toString(i) + " 입니다.");
		System.out.println("숫자 " +Integer.parseInt(num)+ " 입니다.");
		System.out.println("숫자 " +Integer.parseInt(num)+" + 2 = "+(Integer.parseInt(num)+2)+ " 입니다.");
	}

}

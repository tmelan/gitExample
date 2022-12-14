package ch16;

public class BankUse {

	public static void main(String[] args) {
		MyBank ba = new MyBank();
		
		BankPlayer a1 = new BankPlayer(1, ba); 
		BankPlayer a2 = new BankPlayer(2, ba);
		BankPlayer a3 = new BankPlayer(3, ba);
		
		a1.start();
		a2.start();
		a3.start();
	}

}


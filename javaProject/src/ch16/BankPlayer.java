package ch16;

public class BankPlayer extends Thread {
	int bank;
	MyBank bank2;
	
	public BankPlayer(int bank, MyBank ba) {
		this.bank = bank;
		this.bank2 = ba;
	}

	@Override
	public void run() {
		switch (bank) {
		case 1: bank2.hong(); break;
		case 2: bank2.sa(); break;
		case 3: bank2.lee(); break;
		}
	}
	
}
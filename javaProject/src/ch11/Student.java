package ch11;

public interface Student {
	String NAME = "홍길동";
	String ADDRESS = "서울 강남구";
	String EMAIL = "hong@gmail.com";
	int KOR = 90;
	int ENG = 85;
	int MAT = 79;
	int TOT = (KOR+ENG+MAT);
	double AVG = (TOT/3.0);
	
	void address();
	void point();
}

package javaProject;

public class Ex5_2 {
	public static void main(String[] args) {
		int sum=0;
		float avg=0f;
		
		int[] score = {100, 8, 100, 100, 90};
		
		for(int i=0; i<score.length; i++) {
			sum+= score[i];
		}
		
		avg= sum/(float)score.length;
		
		System.out.println("총합 : " + sum);
		System.out.println("평균 : " + avg);

	}

}

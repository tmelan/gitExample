package ch13;

import java.util.Arrays;

public class SortEx {

	public static void main(String[] args) {
		Integer arr[]= {3,29,46,15,89,-20};
		System.out.println("배열 데이터 : ");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+"\t");
		}
		System.out.println();
		
		//오름차순
		System.out.println("오름차순 정렬 : ");
		Arrays.sort(arr);
		for(int i : arr) {
			System.out.print(i+"\t");
		}
		System.out.println();
		
		//내림차순
	}
	

}

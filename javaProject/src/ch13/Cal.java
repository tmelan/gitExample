package ch13;

import java.util.Calendar;
import java.util.Date;

public class Cal {

	public static void main(String[] args) {
		//calendar 인스턴스 생성은 new로 하지않는다 
		Calendar cal=Calendar.getInstance();
		System.out.println(cal.get(Calendar.YEAR));//시스템의 날짜연도 값이 나옴
		System.out.println(cal.get(Calendar.MONTH)+1);//0~11이라 month는 +1을 해줘야 
		System.out.println(cal.get(Calendar.DATE));
		System.out.println(cal.get(Calendar.HOUR));//12시간제 
		System.out.println(cal.get(Calendar.HOUR_OF_DAY));//24시간제
		
		System.out.println(cal.get(Calendar.MINUTE));//분
		System.out.println(cal.get(Calendar.SECOND));//초
		System.out.println(cal.get(Calendar.AM_PM));//오전 0 오후 1
		if(cal.get(Calendar.AM_PM)==0) {
				System.out.println("오전");
		} else
				System.out.println("오후");
		
		System.out.println(cal.get(Calendar.DAY_OF_YEAR));//1년 중 몇번째 날
		System.out.println(cal.get(Calendar.WEEK_OF_YEAR)); //1년 중 몇번째 주
		System.out.println(cal.get(Calendar.DAY_OF_MONTH));//월의 몇번째 날
		System.out.println(cal.get(Calendar.DAY_OF_WEEK)); //요일(1부터 일요일)
		String yoil="";
		switch (cal.get(Calendar.DAY_OF_WEEK)) {		
		case 1: yoil="일요일"; break;
		case 2: yoil="월요일"; break;		
		case 3: yoil="화요일"; break;
		case 4: yoil="수요일"; break;
		case 5: yoil="목요일"; break;
		case 6: yoil="금요일"; break;
		case 7: yoil="토요일"; break;
		}
		System.out.println("오늘은 " +yoil+"입니다.");
		
		Date date = cal.getTime();//ctrl shift O
		System.out.println(date.getYear()+1900); //취소줄은 에러는 아님 더이상 쓰지말라는 조언
		System.out.println(date.getMonth()+1);
		System.out.println(date.getDate());
		}	
}	


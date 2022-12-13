package com.kh.day11.javaapi;

import java.util.Calendar;

public class Exam_Calendar {

	public static void main(String[] args) {
		
		Calendar today = Calendar.getInstance();
		printCalendar("현재", today);
		
		System.out.println();
		
		Calendar someDate = Calendar.getInstance();
		someDate.clear();
		someDate.set(2022, 10, 23);
		someDate.set(Calendar.HOUR_OF_DAY, 9);
		someDate.set(Calendar.MINUTE, 0);
		printCalendar("개강일", someDate);
		
		System.out.println();
		
		Calendar someDate2 = Calendar.getInstance();
		someDate2.clear();
		someDate2.set(2023, 4, 2);
		someDate2.set(Calendar.HOUR_OF_DAY, 17);
		someDate2.set(Calendar.MINUTE, 50);
		printCalendar("종강일", someDate2);
	}
	
	public static void printCalendar(String msg, Calendar cal) {
		
		//호출 당시의 시간을 가져오게 됨 따라서 매개변수 넣음
//		Calendar today = Calendar.getInstance();  // 추상클래스라서 객체 못 만듦
		
		int year      = cal.get(Calendar.YEAR);
		int month     = cal.get(Calendar.MONTH)+1;
		int day       = cal.get(Calendar.DAY_OF_MONTH);
		int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
		
		int ampm      = cal.get(Calendar.AM_PM);
		int hour      = cal.get(Calendar.HOUR);
		int hourOfDay = cal.get(Calendar.HOUR_OF_DAY);
		int minute    = cal.get(Calendar.MINUTE);
		int second    = cal.get(Calendar.SECOND);
		int millisec  = cal.get(Calendar.MILLISECOND);
		
		String dayOfWeekString = "";
		switch (dayOfWeek) {
		case Calendar.SUNDAY    : dayOfWeekString = "일요일"; break;
		case Calendar.MONDAY    : dayOfWeekString = "월요일"; break;
		case Calendar.TUESDAY   : dayOfWeekString = "화요일"; break;
		case Calendar.WEDNESDAY : dayOfWeekString = "수요일"; break;
		case Calendar.THURSDAY  : dayOfWeekString = "목요일"; break;
		case Calendar.FRIDAY    : dayOfWeekString = "금요일"; break;
		case Calendar.SATURDAY  : dayOfWeekString = "토요일"; break;
		}
		
		String ampmString = "";
		if(ampm == Calendar.AM) ampmString = "오전";
		else ampmString = "오후";
		
		// 현재 2022/12/7/수요일(11시) 오전 11시 42분 33초
		System.out.printf("%s %d/%d/%d/%s(%d시) %s %d시 %d분 %d초 %d밀리초%n",
				          msg, year, month, day, dayOfWeekString, hourOfDay,
				          ampmString, hour, minute, second, millisec);
		
	}

}

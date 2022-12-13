package com.kh.day11.javaapi;

import java.util.Calendar;

public class Exam_Calendar {

	public static void main(String[] args) {
		
		Calendar today = Calendar.getInstance();
		printCalendar("����", today);
		
		System.out.println();
		
		Calendar someDate = Calendar.getInstance();
		someDate.clear();
		someDate.set(2022, 10, 23);
		someDate.set(Calendar.HOUR_OF_DAY, 9);
		someDate.set(Calendar.MINUTE, 0);
		printCalendar("������", someDate);
		
		System.out.println();
		
		Calendar someDate2 = Calendar.getInstance();
		someDate2.clear();
		someDate2.set(2023, 4, 2);
		someDate2.set(Calendar.HOUR_OF_DAY, 17);
		someDate2.set(Calendar.MINUTE, 50);
		printCalendar("������", someDate2);
	}
	
	public static void printCalendar(String msg, Calendar cal) {
		
		//ȣ�� ����� �ð��� �������� �� ���� �Ű����� ����
//		Calendar today = Calendar.getInstance();  // �߻�Ŭ������ ��ü �� ����
		
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
		case Calendar.SUNDAY    : dayOfWeekString = "�Ͽ���"; break;
		case Calendar.MONDAY    : dayOfWeekString = "������"; break;
		case Calendar.TUESDAY   : dayOfWeekString = "ȭ����"; break;
		case Calendar.WEDNESDAY : dayOfWeekString = "������"; break;
		case Calendar.THURSDAY  : dayOfWeekString = "�����"; break;
		case Calendar.FRIDAY    : dayOfWeekString = "�ݿ���"; break;
		case Calendar.SATURDAY  : dayOfWeekString = "�����"; break;
		}
		
		String ampmString = "";
		if(ampm == Calendar.AM) ampmString = "����";
		else ampmString = "����";
		
		// ���� 2022/12/7/������(11��) ���� 11�� 42�� 33��
		System.out.printf("%s %d/%d/%d/%s(%d��) %s %d�� %d�� %d�� %d�и���%n",
				          msg, year, month, day, dayOfWeekString, hourOfDay,
				          ampmString, hour, minute, second, millisec);
		
	}

}

package com.kh.day11.javaapi;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Exam_date {

	public static void main(String[] args) {
		
		Date date = new Date();
		System.out.println(date);
		
		SimpleDateFormat trans = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		String transDate1 = trans.format(date);
		System.out.println(transDate1);
		
		// �빮��S�� �и���!
		SimpleDateFormat trans2 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss:SS");
		String transDate2 = trans2.format(date);
		System.out.println(transDate2);
		
		
		////////////////
		//�׷����� Ķ���� -> ������~!~!~!
		Calendar calendar = new GregorianCalendar();
		System.out.println(calendar.getTime());
		
		String changed = trans2.format(calendar.getTime());
		System.out.println("changed : " + changed);
	
	}

}

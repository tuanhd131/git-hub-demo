package com.JavaCoBan.domain;

import java.util.Calendar;
import java.util.Date;

public class NgayGio {
	public static void main(String[] args) {
		Date now = new Date();
		System.out.println(now);
		Date now2 =new Date();
		
		if ( now.equals(now2)) {
			System.out.println("bang nhau");
			
		}
		if (now.before(now2)) {
			
		}
		if (now.after(now2)) {
			
		}
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.getTime());
		cal.add(Calendar.HOUR, -1);
		System.out.println(cal.getTime());
		
	}
		
}

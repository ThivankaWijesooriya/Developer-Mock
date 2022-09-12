package com.combank.ips.outward.producer;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import com.combank.ips.outward.producer.constant.IsoDirection;

public class Runner {

	public static void main(String[] args) {
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyyMMdd HHmmss");  
		LocalDateTime now = LocalDateTime.now();  
		System.out.println(dtf.format(now));  
		
		String[] datetime = dtf.format(now).toString().split(" ");
		
		String date = datetime[0];
		String time = datetime[1];
		
		System.out.println(date);
		System.out.println(time);
		
		System.out.println(IsoDirection.RECEIVED.getFlag());
		System.out.println(Timestamp.valueOf(now).toString());

	}

}

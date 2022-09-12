package com.combank.ips.outward.producer.util;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.stereotype.Component;

import com.combank.ips.outward.producer.model.DateDetail;

@Component
public class DateUtil {

	public DateDetail getCurrentTimestamp() {

		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyyMMdd HHmmss");
		LocalDateTime now = LocalDateTime.now();

		String[] datetime = dtf.format(now).toString().split(" ");

		DateDetail dateDetail = new DateDetail();

		dateDetail.setDate(Integer.parseInt(datetime[0]));
		dateDetail.setTime(Integer.parseInt(datetime[1]));
		dateDetail.setTimeStamp(Timestamp.valueOf(now).toString());

		return dateDetail;
	}

}

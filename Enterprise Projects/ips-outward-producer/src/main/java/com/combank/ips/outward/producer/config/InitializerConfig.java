package com.combank.ips.outward.producer.config;

import java.sql.Connection;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InitializerConfig {

	@Autowired
	private DataSource dataSource;

	// @PostConstruct
	public void startup() {

		try (Connection con = dataSource.getConnection()) {

			System.out.println("DB connection successful");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}

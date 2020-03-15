package com.onezero.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.data.transaction.ChainedTransactionManager;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@PropertySource("classpath:database.properties")
@EnableTransactionManagement
public class DBUtil {

	@Autowired
	private Environment env;

	@Primary
	@Bean(name = "datasource1")
	DataSource as400dataSource() {
		DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();
		driverManagerDataSource.setUrl(env.getProperty("url"));
		driverManagerDataSource.setUsername(env.getProperty("dbuser"));
		driverManagerDataSource.setPassword(env.getProperty("dbpassword"));
		driverManagerDataSource.setDriverClassName(env.getProperty("driver"));
		return driverManagerDataSource;
	}

	@Bean(name = "jdbcTemplate1")
	public JdbcTemplate As400jdbcTemplate() {
		JdbcTemplate jdbcTemplate = new JdbcTemplate();
		jdbcTemplate.setDataSource(as400dataSource());
		return jdbcTemplate;
	}

	@Bean(name = "transactionManager")
	public PlatformTransactionManager transactionManager(@Qualifier("datasource1") DataSource dataSource) {
		DataSourceTransactionManager txManager = new DataSourceTransactionManager(dataSource);
		return txManager;
	}

	@Bean(name = "datasource2")
	DataSource sqlserverdataSource() {
		DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();
		driverManagerDataSource.setUrl(env.getProperty("url2"));
		driverManagerDataSource.setUsername(env.getProperty("dbuser2"));
		driverManagerDataSource.setPassword(env.getProperty("dbpassword2"));
		driverManagerDataSource.setDriverClassName(env.getProperty("driver2"));
		return driverManagerDataSource;
	}

	@Bean(name = "jdbcTemplate2")
	public JdbcTemplate sqlserverjdbcTemplate() {
		JdbcTemplate jdbcTemplate = new JdbcTemplate();
		jdbcTemplate.setDataSource(sqlserverdataSource());
		return jdbcTemplate;
	}

	
	@Bean(name = "secondTransactionManager")
	public PlatformTransactionManager transactionManager2(@Qualifier("datasource2") DataSource dataSource) {
		DataSourceTransactionManager txManager = new DataSourceTransactionManager(dataSource);
		return txManager;
	}
	

	@Bean(name = "globalTransactionManager")
	public ChainedTransactionManager build(
			@Qualifier("transactionManager") PlatformTransactionManager first,
			@Qualifier("secondTransactionManager") PlatformTransactionManager second)
			{
		ChainedTransactionManager ctm = new ChainedTransactionManager(first, second);
		return ctm;
	}

}

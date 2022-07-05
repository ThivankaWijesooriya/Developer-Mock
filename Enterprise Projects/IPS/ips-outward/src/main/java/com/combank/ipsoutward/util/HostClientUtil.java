package com.combank.ipsoutward.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.ObjectMapper;

@Component
@PropertySource("classpath:host-service.properties")
public class HostClientUtil {

	@Autowired
	private RestTemplate restTemplate;

	@Autowired
	private Environment env;

	public Object postToHost(Object dataSet) {

		try {

			final String baseUrl = "" + env.getProperty("ips-url") + "";

			restTemplate.getMessageConverters().add(new MappingJackson2HttpMessageConverter());

			HttpHeaders headers = new HttpHeaders();
			headers.setContentType(MediaType.APPLICATION_JSON);

			HttpEntity<Object> entity = new HttpEntity<>(dataSet, headers);

			ObjectMapper mapper = new ObjectMapper();

			ResponseEntity<String> resultSet = restTemplate.exchange(baseUrl, HttpMethod.POST, entity, String.class);

			System.out.println(resultSet.getStatusCodeValue());
			System.out.println(resultSet.getBody());

			Object response = mapper.readValue(resultSet.getBody(), Object.class);

			return response;

		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

	}

}

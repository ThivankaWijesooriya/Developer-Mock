package com.synapsys.util;

import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

@Component
@PropertySource("classpath:express-service.properties")
public class FastUploadClientUtil {

	private static final Logger LOGGER = Logger.getLogger(FastUploadClientUtil.class);

	@Autowired
	private RestTemplate restTemplate;

	@Autowired
	private Environment env;

	public Object uploadFilePost(String referenceNo) {

		try {

			final String baseUrl = "" + env.getProperty("fast-upload") + "";

			restTemplate.getMessageConverters().add(new MappingJackson2HttpMessageConverter());

			HttpHeaders headers = new HttpHeaders();
			headers.setContentType(MediaType.APPLICATION_JSON);

			HttpEntity<String> entity = new HttpEntity<String>(headers);

			LOGGER.info("******* Host Response - START ***********");

			Map<String, String> uriVariables = new HashMap<>();
			uriVariables.put("referenceNo", referenceNo);

			ObjectMapper mapper = new ObjectMapper();

			ResponseEntity<String> result = restTemplate.exchange(baseUrl, HttpMethod.GET, entity, String.class,
					                        uriVariables);

			LOGGER.info(result.getBody());
			
			JsonObject jsonObject = new JsonParser().parse(result.getBody()).getAsJsonObject();
			String resultSet = jsonObject.get("data").toString();
			
			Object response = mapper.readValue(resultSet, Object.class);

			LOGGER.info("******* Host Response - END ***********");

			LOGGER.info(response.toString());

			return response;

		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

	}
	
	public Object runmodelFilePost(String referenceNo) {

		try {

			final String baseUrl = "" + env.getProperty("fast-runmodel") + "";

			restTemplate.getMessageConverters().add(new MappingJackson2HttpMessageConverter());

			HttpHeaders headers = new HttpHeaders();
			headers.setContentType(MediaType.APPLICATION_JSON);

			HttpEntity<String> entity = new HttpEntity<String>(headers);

			LOGGER.info("******* Host Response - START ***********");

			Map<String, String> uriVariables = new HashMap<>();
			uriVariables.put("referenceNo", referenceNo);

			ObjectMapper mapper = new ObjectMapper();

			ResponseEntity<String> result = restTemplate.exchange(baseUrl, HttpMethod.GET, entity, String.class,
					                        uriVariables);

			LOGGER.info(result.getBody());
			
			JsonObject jsonObject = new JsonParser().parse(result.getBody()).getAsJsonObject();
			String resultSet = jsonObject.get("data").toString();
			
			LOGGER.info(resultSet);
			
			Object response = mapper.readValue(resultSet, Object.class);

			LOGGER.info("******* Host Response - END ***********");

			LOGGER.info(response.toString());

			return response;

		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

	}
	
	public Object generateFilePost(String referenceNo) {

		try {

			final String baseUrl = "" + env.getProperty("fast-generate") + "";

			restTemplate.getMessageConverters().add(new MappingJackson2HttpMessageConverter());

			HttpHeaders headers = new HttpHeaders();
			headers.setContentType(MediaType.APPLICATION_JSON);

			HttpEntity<String> entity = new HttpEntity<String>(headers);

			LOGGER.info("******* Host Response - START ***********");

			Map<String, String> uriVariables = new HashMap<>();
			uriVariables.put("referenceNo", referenceNo);

			ObjectMapper mapper = new ObjectMapper();

			ResponseEntity<String> result = restTemplate.exchange(baseUrl, HttpMethod.GET, entity, String.class,
					                        uriVariables);
		
			JsonObject jsonObject = new JsonParser().parse(result.getBody()).getAsJsonObject();
			String resultSet = jsonObject.get("data").toString();
			
			LOGGER.info(resultSet);
			
			Object response = mapper.readValue(resultSet, Object.class);

			LOGGER.info("******* Host Response - END ***********");

			LOGGER.info(response.toString());

			return response;

		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

	}

}

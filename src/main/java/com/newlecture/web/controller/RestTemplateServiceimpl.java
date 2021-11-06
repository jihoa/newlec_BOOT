package com.newlecture.web.controller;

import java.net.URI;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;


@Service
public class RestTemplateServiceimpl implements RestTemplateService {

    private final Logger LOGGER = LoggerFactory.getLogger(RestTemplateServiceimpl.class);
	@Override
	public String getAroundHub() {


//		URI uri = UriComponentsBuilder
//				.fromUriString("http://localhost:8081")
//				.path("/index")
//				.encode()
//				.build()
//				//.expand("Flature") // 복수 값의 경우 , 를 추가하여 구분.
//				.toUri();
		
		String baseUrl = "http://localhost:8081/index";
				
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<String> responseEntity = restTemplate.getForEntity(baseUrl, String.class);
		
		
		LOGGER.info("status code : {}", responseEntity.getStatusCode());
		LOGGER.info("body : {}", responseEntity.getBody());
		
		return responseEntity.getBody();
	}

	@Override
	public String getName() {

		URI uri = UriComponentsBuilder
				.fromUriString("http://localhost:8083")
				.path("/api/server/name")
				.queryParam("name", "Flature")
				.encode()
				.build()
				.expand("Flature") // 복수 값의 경우 , 를 추가하여 구분.
				.toUri();
				
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<String> responseEntity = restTemplate.getForEntity(uri, String.class);
		
		
		LOGGER.info("status code : {}", responseEntity.getStatusCode());
		LOGGER.info("body : {}", responseEntity.getBody());
		
		return responseEntity.getBody();
	}

	@Override
	public String getName2() {

		URI uri = UriComponentsBuilder
				.fromUriString("http://localhost:8083")
				.path("/tttttttttttttttt/{variable}")
				.encode()
				.build()
				.expand("Flature") // 복수 값의 경우 , 를 추가하여 구분.
				.toUri();
				
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<String> responseEntity = restTemplate.getForEntity(uri, String.class);
		
		
		LOGGER.info("status code : {}", responseEntity.getStatusCode());
		LOGGER.info("body : {}", responseEntity.getBody());
		
		return responseEntity.getBody();
	}

	@Override
	public ResponseEntity<MemberDTO> postDto() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<MemberDTO> addHeader() {
		// TODO Auto-generated method stub
		return null;
	}

}

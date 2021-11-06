package com.newlecture.web.controller;

import org.springframework.http.ResponseEntity;

public interface RestTemplateService {

	String getAroundHub();

	String getName();

	String getName2();

	ResponseEntity<MemberDTO> postDto();

	ResponseEntity<MemberDTO> addHeader();

}

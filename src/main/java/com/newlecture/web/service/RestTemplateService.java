package com.newlecture.web.service;

import com.newlecture.web.dto.MemberDTO;
import org.springframework.http.ResponseEntity;

public interface RestTemplateService {

	String getAroundHub();

	String getName();

	String getName2();

	ResponseEntity<MemberDTO> postDto();

	ResponseEntity<MemberDTO> addHeader();

}

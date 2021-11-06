package com.newlecture.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.newlecture.web.common.Constants.ExceptionClass;
import com.newlecture.web.common.exception.AroundHubException;


@RestController
public class HelloController {
	
	private final Logger LOGGER = LoggerFactory.getLogger(HelloController.class);
	
	@PostMapping("/exception")
	public void exceptionTest() throws Exception {
		throw new Exception();
	}
	
    @PostMapping(value = "/product/exception")
    public void customExceptionTest() throws AroundHubException {
    	throw new AroundHubException(ExceptionClass.PRODUCT, HttpStatus.FORBIDDEN, "접근이 금지되었습니다.");
    }
    
    


	
//    @ExceptionHandler(value = Exception.class)
//    public ResponseEntity<Map<String, String>> ExceptionHandler(Exception e) {
//        HttpHeaders responseHeaders = new HttpHeaders();
//        //responseHeaders.add(HttpHeaders.CONTENT_TYPE, "application/json");
//        HttpStatus httpStatus = HttpStatus.BAD_REQUEST;
//
//        LOGGER.error(e.getMessage());
//        LOGGER.error("Controller 내 ExceptionHandler 호출, {}, {}", e.getCause(), e.getMessage());
//
//        Map<String, String> map = new HashMap<>();
//        map.put("error type", httpStatus.getReasonPhrase());
//        map.put("code", "400");
//        map.put("message", "에러 발생");
//
//        return new ResponseEntity<>(map, responseHeaders, httpStatus);
//    }

}

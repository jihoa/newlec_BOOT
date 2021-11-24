package com.newlecture.web.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import com.newlecture.web.service.impl.RestTemplateServiceimpl;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;


@WebMvcTest(RestTemplateController.class)
class RestTemplateControllerTest {

	  @Autowired
	  private MockMvc mockMvc;

	  // ProductController에서 잡고 있는 Bean 객체에 대해 Mock 형태의 객체를 생성해줌
	  @MockBean
      RestTemplateServiceimpl restTemplateService;

	  // http://localhost:8080/api/v1/product-api/product/{productId}
	  @Test
	  @DisplayName("RestTemplate 데이터 가져오기 테스트")
	  void getAroundHub() throws Exception {

	    // given : Mock 객체가 특정 상황에서 해야하는 행위를 정의하는 메소드
	    //given(restTemplateService.postDto()).willReturn( new MemberDTO("Flature", "11@11","IDT") );


	    // andExpect : 기대하는 값이 나왔는지 체크해볼 수 있는 메소드
	    mockMvc.perform(
	            get("/api/rest-template/around-hub"))
		        .andExpect(status().isOk())
		        .andDo(print());

	    // verify : 해당 객체의 메소드가 실행되었는지 체크해줌
	    //verify(productService).getProduct("12315");
	  }
	  
	  @Test
	  @DisplayName("RestTemplate DTO 데이터 가져오기 테스트")
	  void postDTO() throws Exception {

		    // given : Mock 객체가 특정 상황에서 해야하는 행위를 정의하는 메소드
		    //given(restTemplateService.postDto()).willReturn( new MemberDTO("Flature", "11@11","IDT") );


		    // andExpect : 기대하는 값이 나왔는지 체크해볼 수 있는 메소드
		    mockMvc.perform(
		            post("/api/rest-template/dto")
			        .contentType(MediaType.APPLICATION_JSON))
			        .andExpect(status().isOk())
			        .andExpect(jsonPath("$.name").exists())
			        .andExpect(jsonPath("$.email").exists())
			        .andExpect(jsonPath("$.organization").exists());
			        //.andDo(print());

		    // verify : 해당 객체의 메소드가 실행되었는지 체크해줌
		    //verify(productService).getProduct("12315");
		  }
}

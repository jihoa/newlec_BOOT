package com.newlecture.web.controller.customer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.newlecture.web.entity.Notice;
import com.newlecture.web.entity.NoticeView;
import com.newlecture.web.service.NoticeService;

@Controller
@RequestMapping("/customer/notice")
public class NoticeController {
	
	@Autowired
	private NoticeService service;

	@RequestMapping("/list")
	public String list(Model model, @RequestParam(value="p", defaultValue="1") int page,
			@RequestParam(value="f", defaultValue="title") String field,
			@RequestParam(value="q", defaultValue = "") String query) {
	
		//model.addAttribute("test","Hello~");
		List<NoticeView> list = service.getViewList(page, field, query, true);
		
				

		model.addAttribute("list",list);
		
		return "customer/notice/list";
	}
	
	
	@RequestMapping("/detail")
	public String detail() {
		return "customer/notice/detail";
	}
	
}

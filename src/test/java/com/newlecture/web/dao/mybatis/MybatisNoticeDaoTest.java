package com.newlecture.web.dao.mybatis;


import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.newlecture.web.dao.NoticeDao;
import com.newlecture.web.entity.NoticeView;

@SpringBootTest
class MybatisNoticeDaoTest {

	@Autowired
	private NoticeDao noticeDao;
	
	@Test
	void test() {
		
		//		select * from noticeview
		//		where ${field} like '%${query}%'
		//		order by regdate desc
		//		limit #{offset}, #{size}
		//(int offset, int size, String field, String query)
		List<NoticeView> list = noticeDao.getViewList(0, 1, "title", null, false);
		System.out.println(list.get(0));
	}

}

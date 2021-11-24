package com.newlecture.web.dao.mybatis;


import com.newlecture.web.entity.NoticeView;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
//@SpringBootTest(classes={MybatisNoticeDao.class, SqlSession.class})
//@ExtendWith(SpringExtension.class)
//@Import({MybatisNoticeDao.class, SqlSession.class})
class MybatisNoticeDaoTest {

//	@MockBean
//	private SqlSession sqlsession;
//
//	@Autowired
//	private MybatisNoticeDao noticeDao;

	@Autowired
	private MybatisNoticeDao noticeDao;
	
	@Test
	@DisplayName("Test Case 2!!!")
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

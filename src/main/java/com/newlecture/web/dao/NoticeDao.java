package com.newlecture.web.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.newlecture.web.entity.Notice;
import com.newlecture.web.entity.NoticeView;
//@Mapper //==> sqlSession으로 대체..
public interface NoticeDao {
	//@Select("select * from notice")
	List<NoticeView> getViewList(int offset, int size, String field, String query, boolean pub);
	List<NoticeView> getPubViewList(int offset, int size, String field, String query);
	
	int getCount(String field, String query);

	int deleteAll(int[] ids);

	int updatePubAll(int[] pubIds, boolean pub);

	int updatePubAll(int[] pubIds, int[] closeIds);
	
	int insert(Notice notice);
	
	
	List<NoticeView> getPubViewListDetail(int id);


	//int deleteAll(int[] ids);

}

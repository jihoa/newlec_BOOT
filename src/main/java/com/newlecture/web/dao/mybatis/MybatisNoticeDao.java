package com.newlecture.web.dao.mybatis;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.newlecture.web.dao.NoticeDao;
import com.newlecture.web.entity.Notice;
import com.newlecture.web.entity.NoticeView;

@Repository
public class MybatisNoticeDao implements NoticeDao{
	
	
	private NoticeDao mapper;
	
	@Autowired
	public MybatisNoticeDao(SqlSession sqlSession) {
		mapper = sqlSession.getMapper(NoticeDao.class);
	}
	

	@Override
	public List<NoticeView> getViewList(int offset, int size, String field, String query, boolean pub) {
		return mapper.getViewList(offset, size, field, query, pub);
	}
	
	@Override
	public List<NoticeView> getPubViewList(int offset, int size, String field, String query) {
		// TODO Auto-generated method stub
		return mapper.getPubViewList(offset, size, field, query);
	}


	@Override
	public int getCount(String field, String query) {
		return mapper.getCount(field, query);
	}


	@Override
	public int deleteAll(int[] ids) {
		return mapper.deleteAll(ids);

	}


	@Override
	public int updatePubAll(int[] pubIds, boolean pub) {
		return mapper.updatePubAll(pubIds, pub);
	}


	@Override
	public int updatePubAll(int[] pubIds, int[] closeIds) {
		return mapper.updatePubAll(pubIds, closeIds);
	}


	@Override
	public int insert(Notice notice) {
		// TODO Auto-generated method stub
		return mapper.insert(notice);
	}


	@Override
	public List<NoticeView> getPubViewListDetail(int id) {
		return mapper.getPubViewListDetail(id);
	}




}

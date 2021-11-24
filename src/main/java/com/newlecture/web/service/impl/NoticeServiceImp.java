package com.newlecture.web.service.impl;

import com.newlecture.web.service.NoticeService;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.newlecture.web.dao.NoticeDao;
import com.newlecture.web.entity.Notice;
import com.newlecture.web.entity.NoticeView;

@Service
public class NoticeServiceImp implements NoticeService {

	@Autowired
	private NoticeDao noticeDao;
	
	@Override
	public List<NoticeView> getViewList(boolean pub) {

		return getViewList(1, "title", "", pub);
	}	
	


	@Override
	public List<NoticeView> getViewList(String field, String query, boolean pub) {

		return getViewList(1, field, query, pub);
	}
	
	

	
	@Override
	public List<NoticeView> getViewList(int page, String field, String query, boolean pub) {

		int size = 10;
		int offset = 0 +(page-1)* size;
		System.out.println("jihoTEST:::::"+pub);
		List<NoticeView> list = noticeDao.getViewList(offset, size, field, query, pub);
		
		return list;
	}
	
	

	@Override
	public List<NoticeView> getPubViewList(int page, String field, String query) {
		int size = 10;
		int offset = 0 +(page-1)* size;
		List<NoticeView> list = noticeDao.getPubViewList(offset, size, field, query);
		
		return list;
	}

	
	public int getCount() {
		
		return getCount("title", "");
	}

	private int getCount(String field, String query) {
		return noticeDao.getCount(field, query);
	}
	
	
	
	//구현해야할 목록

	@Override
	public NoticeView get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Notice getNext(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Notice getPrev(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
	
	@Override
	public int update(Notice notice) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}



	@Override
	public int deleteAll(int[] ids) {
		// TODO Auto-generated method stub
		return noticeDao.deleteAll(ids);
	}

	//공개
	@Override
	public int updatePubAll(int[] pubIds, boolean pub) {
		return noticeDao.updatePubAll(pubIds, pub);
	}
	
	public int updatePubAll(int[] pubIds, int[] closeIds) {
	
		int result = 0;
		result += noticeDao.updatePubAll(closeIds, false);
		result += noticeDao.updatePubAll(pubIds, true);
		
		return result;
	}


	@Override
	public int insert(Notice notice) {
		// TODO Auto-generated method stub
		return noticeDao.insert(notice);
	}



	@Override
	public List<NoticeView> getPubViewListDetail(int id) {
		// TODO Auto-generated method stub
		return noticeDao.getPubViewListDetail(id);
	}






	
	

}

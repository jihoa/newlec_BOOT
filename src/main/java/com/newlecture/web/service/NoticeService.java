package com.newlecture.web.service;

import java.util.List;

import com.newlecture.web.entity.Notice;
import com.newlecture.web.entity.NoticeView;

public interface NoticeService {

	// 페이지를 요청할 때
	List<NoticeView> getViewList(boolean pub);
	
	//검색을 요청할 때
	List<NoticeView> getViewList(String field, String query, boolean pub);

	// 페이지를 요청할 때
	List<NoticeView> getViewList(int page, String field, String query, boolean pub);

	//자세한 페이지를 요청할 떄
	NoticeView get(int id);
	Notice getNext(int id);
	Notice getPrev(int id);

//	int updatePubAll(int[] pubIds, int[] closeIds);
	//일괄공개를 요청할 때
	int updatePubAll(int[] pubIds, boolean pub);
	//일괄삭제
	int deleteAll(int[] ids);
	
	//수정페이지를 요청할 떄
	int update(Notice notice);
	int delete(int id);
	int insert(Notice notice);

	int updatePubAll(int[] openids1, int[] closeids1);

	List<NoticeView> getPubViewList(int page, String field, String query);

	List<NoticeView> getPubViewListDetail(int id);

}

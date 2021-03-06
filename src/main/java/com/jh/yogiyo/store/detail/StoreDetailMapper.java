package com.jh.yogiyo.store.detail;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.jh.yogiyo.store.StoreVO;

@Mapper
public interface StoreDetailMapper {

	public StoreVO getOne(StoreVO storeVO) throws Exception;
	
	public StoreVO getStoreManage(StoreVO storeVO) throws Exception;
	
	public List<StoreMenuVO> getMenu(StoreVO storeVO) throws Exception;
	
	public String[] getMenuCategory(StoreVO storeVO) throws Exception;
	
	public List<StoreReviewVO> getStarAvg(StoreVO storeVO) throws Exception;
	
	public Long getSumReview(StoreVO storeVO) throws Exception;
	
	public List<ReviewAplyVO> getAply(StoreVO storeVO) throws Exception;
	
	public List<StoreReviewVO> getAllReview(StoreVO storeVO) throws Exception;
	
	public List<ToppingVO> getTopping(StoreVO storeVO) throws Exception;
	
	public int setReviewFileInsert(ReviewFileVO fileVO) throws Exception;
	   
	public int setReviewInsert(StoreReviewVO storeReviewVO) throws Exception;
}

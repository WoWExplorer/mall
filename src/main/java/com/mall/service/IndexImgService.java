package com.mall.service;

import com.mall.entity.po.IndexImg;
import com.mall.entity.query.IndexImgQuery;
import com.mall.entity.vo.PaginationResultVo;

import java.util.List;

/**
 *  @Description: 主页轮播图Service
 *  @Author: wow
 *  @Date: 2024年06月17日
 */
public interface IndexImgService {

	/**
	 * 根据条件查询列表
	 */
	List<IndexImg> selectListByCondition(IndexImgQuery indexImgQuery);

	/**
	 * 根据条件查询数量
	 */
	Long selectCount(IndexImgQuery indexImgQuery);

	/**
	 * 分页查询
	 */
	PaginationResultVo<IndexImg> selectList(IndexImgQuery indexImgQuery);

	/**
	 * 新增
	 */
	Integer insert(IndexImg indexImg);

	/**
	 * 批量新增
	 */
	Integer insertBatch(List<IndexImg> indexImg);

	/**
	 * 批量新增或修改
	 */
	Integer insertOrUpdateBatch(List<IndexImg> indexImgList);

	/**
	 * 根据ImgId查询
	 */
	IndexImg selectByImgId(Long imgId);

	/**
	 * 根据ImgId更新
	 */
	Integer updateByImgId(IndexImg IndexImgQuery, Long imgId);

	/**
	 * 根据ImgId删除
	 */
	Integer deleteByImgId(Long imgId);


}
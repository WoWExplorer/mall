package com.mall.service.impl;

import com.mall.entity.po.IndexImg;
import com.mall.mapper.IndexImgMapper;
import com.mall.service.IndexImgService;
import com.mall.entity.query.IndexImgQuery;
import com.mall.entity.vo.PaginationResultVo;
import com.mall.enums.PageSize;
import com.mall.entity.query.SimplePage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *  @Description: 主页轮播图IndexImgServiceImpl
 *  @Author: wow
 *  @Date: 2024年06月17日
 */
@Service("indexImgServiceImpl")
public class IndexImgServiceImpl implements IndexImgService {
	@Autowired
	private IndexImgMapper<IndexImg, IndexImgQuery> indexImgMapper;

	/**
	 * 根据条件查询列表
	 */
	@Override
	public List<IndexImg> selectListByCondition(IndexImgQuery indexImgQuery) {
		return indexImgMapper.selectList(indexImgQuery);
	}
	/**
	 * 根据条件查询数量
	 */
	@Override
	public Long selectCount(IndexImgQuery indexImgQuery) {
		return indexImgMapper.selectCount(indexImgQuery);
	}

	/**
	 * 分页查询
	 */
	@Override
	public PaginationResultVo<IndexImg> selectList(IndexImgQuery indexImgQuery) {
		int count = Math.toIntExact(this.selectCount(indexImgQuery));
		int pageSize = indexImgQuery.getPageSize() == null ? PageSize.PAGE_SIZE20.getSize() : indexImgQuery.getPageSize();
		SimplePage simplePage = new SimplePage(indexImgQuery.getPageNo(), count, pageSize);
		indexImgQuery.setSimplePage(simplePage);
		List<IndexImg> indexImg = this.selectListByCondition(indexImgQuery);
		return new PaginationResultVo<IndexImg>(count, simplePage.getPageSize(), simplePage.getPageNo(), simplePage.getPageTotal(), indexImg);
	}
	/**
	 * 新增
	 */
	@Override
	public Integer insert(IndexImg indexImg) {
		return indexImgMapper.insert(indexImg);
	}

	/**
	 * 批量新增
	 */
	@Override
	public Integer insertBatch(List<IndexImg> indexImgList) {
		return indexImgMapper.insertBatch(indexImgList);
	}

	/**
	 * 批量新增或修改
	 */
	@Override
	public Integer insertOrUpdateBatch(List<IndexImg> indexImgList) {
		return indexImgMapper.insertBatch(indexImgList);
	}

	/**
	 * 根据ImgId查询
	 */
	@Override
	public IndexImg selectByImgId(Long imgId) {
		return indexImgMapper.selectByImgId(imgId);
	}

	/**
	 * 根据ImgId更新
	 */
	@Override
	public Integer updateByImgId(IndexImg indexImg, Long imgId) {
		return indexImgMapper.updateByImgId(indexImg, imgId);
	}

	/**
	 * 根据ImgId删除
	 */
	@Override
	public Integer deleteByImgId(Long imgId) {
		return indexImgMapper.deleteByImgId(imgId);
	}
}
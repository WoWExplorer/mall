package com.mall.service.impl;

import com.mall.entity.po.ProdComm;
import com.mall.mapper.ProdCommMapper;
import com.mall.service.ProdCommService;
import com.mall.entity.query.ProdCommQuery;
import com.mall.entity.vo.PaginationResultVo;
import com.mall.enums.PageSize;
import com.mall.entity.query.SimplePage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *  @Description: 商品评论ProdCommServiceImpl
 *  @Author: wow
 *  @Date: 2024年06月17日
 */
@Service("prodCommServiceImpl")
public class ProdCommServiceImpl implements ProdCommService {
	@Autowired
	private ProdCommMapper<ProdComm, ProdCommQuery> prodCommMapper;

	/**
	 * 根据条件查询列表
	 */
	@Override
	public List<ProdComm> selectListByCondition(ProdCommQuery prodCommQuery) {
		return prodCommMapper.selectList(prodCommQuery);
	}
	/**
	 * 根据条件查询数量
	 */
	@Override
	public Long selectCount(ProdCommQuery prodCommQuery) {
		return prodCommMapper.selectCount(prodCommQuery);
	}

	/**
	 * 分页查询
	 */
	@Override
	public PaginationResultVo<ProdComm> selectList(ProdCommQuery prodCommQuery) {
		int count = Math.toIntExact(this.selectCount(prodCommQuery));
		int pageSize = prodCommQuery.getPageSize() == null ? PageSize.PAGE_SIZE20.getSize() : prodCommQuery.getPageSize();
		SimplePage simplePage = new SimplePage(prodCommQuery.getPageNo(), count, pageSize);
		prodCommQuery.setSimplePage(simplePage);
		List<ProdComm> prodComm = this.selectListByCondition(prodCommQuery);
		return new PaginationResultVo<ProdComm>(count, simplePage.getPageSize(), simplePage.getPageNo(), simplePage.getPageTotal(), prodComm);
	}
	/**
	 * 新增
	 */
	@Override
	public Integer insert(ProdComm prodComm) {
		return prodCommMapper.insert(prodComm);
	}

	/**
	 * 批量新增
	 */
	@Override
	public Integer insertBatch(List<ProdComm> prodCommList) {
		return prodCommMapper.insertBatch(prodCommList);
	}

	/**
	 * 批量新增或修改
	 */
	@Override
	public Integer insertOrUpdateBatch(List<ProdComm> prodCommList) {
		return prodCommMapper.insertBatch(prodCommList);
	}

	/**
	 * 根据ProdCommId查询
	 */
	@Override
	public ProdComm selectByProdCommId(Long prodCommId) {
		return prodCommMapper.selectByProdCommId(prodCommId);
	}

	/**
	 * 根据ProdCommId更新
	 */
	@Override
	public Integer updateByProdCommId(ProdComm prodComm, Long prodCommId) {
		return prodCommMapper.updateByProdCommId(prodComm, prodCommId);
	}

	/**
	 * 根据ProdCommId删除
	 */
	@Override
	public Integer deleteByProdCommId(Long prodCommId) {
		return prodCommMapper.deleteByProdCommId(prodCommId);
	}
}
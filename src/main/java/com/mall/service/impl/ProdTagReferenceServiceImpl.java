package com.mall.service.impl;

import com.mall.entity.po.ProdTagReference;
import com.mall.mapper.ProdTagReferenceMapper;
import com.mall.service.ProdTagReferenceService;
import com.mall.entity.query.ProdTagReferenceQuery;
import com.mall.entity.vo.PaginationResultVo;
import com.mall.enums.PageSize;
import com.mall.entity.query.SimplePage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *  @Description: ProdTagReferenceServiceImpl
 *  @Author: wow
 *  @Date: 2024年06月17日
 */
@Service("prodTagReferenceServiceImpl")
public class ProdTagReferenceServiceImpl implements ProdTagReferenceService {
	@Autowired
	private ProdTagReferenceMapper<ProdTagReference, ProdTagReferenceQuery> prodTagReferenceMapper;

	/**
	 * 根据条件查询列表
	 */
	@Override
	public List<ProdTagReference> selectListByCondition(ProdTagReferenceQuery prodTagReferenceQuery) {
		return prodTagReferenceMapper.selectList(prodTagReferenceQuery);
	}
	/**
	 * 根据条件查询数量
	 */
	@Override
	public Long selectCount(ProdTagReferenceQuery prodTagReferenceQuery) {
		return prodTagReferenceMapper.selectCount(prodTagReferenceQuery);
	}

	/**
	 * 分页查询
	 */
	@Override
	public PaginationResultVo<ProdTagReference> selectList(ProdTagReferenceQuery prodTagReferenceQuery) {
		int count = Math.toIntExact(this.selectCount(prodTagReferenceQuery));
		int pageSize = prodTagReferenceQuery.getPageSize() == null ? PageSize.PAGE_SIZE20.getSize() : prodTagReferenceQuery.getPageSize();
		SimplePage simplePage = new SimplePage(prodTagReferenceQuery.getPageNo(), count, pageSize);
		prodTagReferenceQuery.setSimplePage(simplePage);
		List<ProdTagReference> prodTagReference = this.selectListByCondition(prodTagReferenceQuery);
		return new PaginationResultVo<ProdTagReference>(count, simplePage.getPageSize(), simplePage.getPageNo(), simplePage.getPageTotal(), prodTagReference);
	}
	/**
	 * 新增
	 */
	@Override
	public Integer insert(ProdTagReference prodTagReference) {
		return prodTagReferenceMapper.insert(prodTagReference);
	}

	/**
	 * 批量新增
	 */
	@Override
	public Integer insertBatch(List<ProdTagReference> prodTagReferenceList) {
		return prodTagReferenceMapper.insertBatch(prodTagReferenceList);
	}

	/**
	 * 批量新增或修改
	 */
	@Override
	public Integer insertOrUpdateBatch(List<ProdTagReference> prodTagReferenceList) {
		return prodTagReferenceMapper.insertBatch(prodTagReferenceList);
	}

	/**
	 * 根据ReferenceId查询
	 */
	@Override
	public ProdTagReference selectByReferenceId(Long referenceId) {
		return prodTagReferenceMapper.selectByReferenceId(referenceId);
	}

	/**
	 * 根据ReferenceId更新
	 */
	@Override
	public Integer updateByReferenceId(ProdTagReference prodTagReference, Long referenceId) {
		return prodTagReferenceMapper.updateByReferenceId(prodTagReference, referenceId);
	}

	/**
	 * 根据ReferenceId删除
	 */
	@Override
	public Integer deleteByReferenceId(Long referenceId) {
		return prodTagReferenceMapper.deleteByReferenceId(referenceId);
	}
}
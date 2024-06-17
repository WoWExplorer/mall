package com.mall.service.impl;

import com.mall.entity.po.TransfeeFree;
import com.mall.mapper.TransfeeFreeMapper;
import com.mall.service.TransfeeFreeService;
import com.mall.entity.query.TransfeeFreeQuery;
import com.mall.entity.vo.PaginationResultVo;
import com.mall.enums.PageSize;
import com.mall.entity.query.SimplePage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *  @Description: TransfeeFreeServiceImpl
 *  @Author: wow
 *  @Date: 2024年06月17日
 */
@Service("transfeeFreeServiceImpl")
public class TransfeeFreeServiceImpl implements TransfeeFreeService {
	@Autowired
	private TransfeeFreeMapper<TransfeeFree, TransfeeFreeQuery> transfeeFreeMapper;

	/**
	 * 根据条件查询列表
	 */
	@Override
	public List<TransfeeFree> selectListByCondition(TransfeeFreeQuery transfeeFreeQuery) {
		return transfeeFreeMapper.selectList(transfeeFreeQuery);
	}
	/**
	 * 根据条件查询数量
	 */
	@Override
	public Long selectCount(TransfeeFreeQuery transfeeFreeQuery) {
		return transfeeFreeMapper.selectCount(transfeeFreeQuery);
	}

	/**
	 * 分页查询
	 */
	@Override
	public PaginationResultVo<TransfeeFree> selectList(TransfeeFreeQuery transfeeFreeQuery) {
		int count = Math.toIntExact(this.selectCount(transfeeFreeQuery));
		int pageSize = transfeeFreeQuery.getPageSize() == null ? PageSize.PAGE_SIZE20.getSize() : transfeeFreeQuery.getPageSize();
		SimplePage simplePage = new SimplePage(transfeeFreeQuery.getPageNo(), count, pageSize);
		transfeeFreeQuery.setSimplePage(simplePage);
		List<TransfeeFree> transfeeFree = this.selectListByCondition(transfeeFreeQuery);
		return new PaginationResultVo<TransfeeFree>(count, simplePage.getPageSize(), simplePage.getPageNo(), simplePage.getPageTotal(), transfeeFree);
	}
	/**
	 * 新增
	 */
	@Override
	public Integer insert(TransfeeFree transfeeFree) {
		return transfeeFreeMapper.insert(transfeeFree);
	}

	/**
	 * 批量新增
	 */
	@Override
	public Integer insertBatch(List<TransfeeFree> transfeeFreeList) {
		return transfeeFreeMapper.insertBatch(transfeeFreeList);
	}

	/**
	 * 批量新增或修改
	 */
	@Override
	public Integer insertOrUpdateBatch(List<TransfeeFree> transfeeFreeList) {
		return transfeeFreeMapper.insertBatch(transfeeFreeList);
	}

	/**
	 * 根据TransfeeFreeId查询
	 */
	@Override
	public TransfeeFree selectByTransfeeFreeId(Long transfeeFreeId) {
		return transfeeFreeMapper.selectByTransfeeFreeId(transfeeFreeId);
	}

	/**
	 * 根据TransfeeFreeId更新
	 */
	@Override
	public Integer updateByTransfeeFreeId(TransfeeFree transfeeFree, Long transfeeFreeId) {
		return transfeeFreeMapper.updateByTransfeeFreeId(transfeeFree, transfeeFreeId);
	}

	/**
	 * 根据TransfeeFreeId删除
	 */
	@Override
	public Integer deleteByTransfeeFreeId(Long transfeeFreeId) {
		return transfeeFreeMapper.deleteByTransfeeFreeId(transfeeFreeId);
	}
}
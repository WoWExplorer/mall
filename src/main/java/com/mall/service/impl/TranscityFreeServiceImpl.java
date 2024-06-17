package com.mall.service.impl;

import com.mall.entity.po.TranscityFree;
import com.mall.mapper.TranscityFreeMapper;
import com.mall.service.TranscityFreeService;
import com.mall.entity.query.TranscityFreeQuery;
import com.mall.entity.vo.PaginationResultVo;
import com.mall.enums.PageSize;
import com.mall.entity.query.SimplePage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *  @Description: TranscityFreeServiceImpl
 *  @Author: wow
 *  @Date: 2024年06月17日
 */
@Service("transcityFreeServiceImpl")
public class TranscityFreeServiceImpl implements TranscityFreeService {
	@Autowired
	private TranscityFreeMapper<TranscityFree, TranscityFreeQuery> transcityFreeMapper;

	/**
	 * 根据条件查询列表
	 */
	@Override
	public List<TranscityFree> selectListByCondition(TranscityFreeQuery transcityFreeQuery) {
		return transcityFreeMapper.selectList(transcityFreeQuery);
	}
	/**
	 * 根据条件查询数量
	 */
	@Override
	public Long selectCount(TranscityFreeQuery transcityFreeQuery) {
		return transcityFreeMapper.selectCount(transcityFreeQuery);
	}

	/**
	 * 分页查询
	 */
	@Override
	public PaginationResultVo<TranscityFree> selectList(TranscityFreeQuery transcityFreeQuery) {
		int count = Math.toIntExact(this.selectCount(transcityFreeQuery));
		int pageSize = transcityFreeQuery.getPageSize() == null ? PageSize.PAGE_SIZE20.getSize() : transcityFreeQuery.getPageSize();
		SimplePage simplePage = new SimplePage(transcityFreeQuery.getPageNo(), count, pageSize);
		transcityFreeQuery.setSimplePage(simplePage);
		List<TranscityFree> transcityFree = this.selectListByCondition(transcityFreeQuery);
		return new PaginationResultVo<TranscityFree>(count, simplePage.getPageSize(), simplePage.getPageNo(), simplePage.getPageTotal(), transcityFree);
	}
	/**
	 * 新增
	 */
	@Override
	public Integer insert(TranscityFree transcityFree) {
		return transcityFreeMapper.insert(transcityFree);
	}

	/**
	 * 批量新增
	 */
	@Override
	public Integer insertBatch(List<TranscityFree> transcityFreeList) {
		return transcityFreeMapper.insertBatch(transcityFreeList);
	}

	/**
	 * 批量新增或修改
	 */
	@Override
	public Integer insertOrUpdateBatch(List<TranscityFree> transcityFreeList) {
		return transcityFreeMapper.insertBatch(transcityFreeList);
	}

	/**
	 * 根据TranscityFreeId查询
	 */
	@Override
	public TranscityFree selectByTranscityFreeId(Long transcityFreeId) {
		return transcityFreeMapper.selectByTranscityFreeId(transcityFreeId);
	}

	/**
	 * 根据TranscityFreeId更新
	 */
	@Override
	public Integer updateByTranscityFreeId(TranscityFree transcityFree, Long transcityFreeId) {
		return transcityFreeMapper.updateByTranscityFreeId(transcityFree, transcityFreeId);
	}

	/**
	 * 根据TranscityFreeId删除
	 */
	@Override
	public Integer deleteByTranscityFreeId(Long transcityFreeId) {
		return transcityFreeMapper.deleteByTranscityFreeId(transcityFreeId);
	}
}
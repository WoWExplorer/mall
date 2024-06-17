package com.mall.service.impl;

import com.mall.entity.po.Transcity;
import com.mall.mapper.TranscityMapper;
import com.mall.service.TranscityService;
import com.mall.entity.query.TranscityQuery;
import com.mall.entity.vo.PaginationResultVo;
import com.mall.enums.PageSize;
import com.mall.entity.query.SimplePage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *  @Description: TranscityServiceImpl
 *  @Author: wow
 *  @Date: 2024年06月17日
 */
@Service("transcityServiceImpl")
public class TranscityServiceImpl implements TranscityService {
	@Autowired
	private TranscityMapper<Transcity, TranscityQuery> transcityMapper;

	/**
	 * 根据条件查询列表
	 */
	@Override
	public List<Transcity> selectListByCondition(TranscityQuery transcityQuery) {
		return transcityMapper.selectList(transcityQuery);
	}
	/**
	 * 根据条件查询数量
	 */
	@Override
	public Long selectCount(TranscityQuery transcityQuery) {
		return transcityMapper.selectCount(transcityQuery);
	}

	/**
	 * 分页查询
	 */
	@Override
	public PaginationResultVo<Transcity> selectList(TranscityQuery transcityQuery) {
		int count = Math.toIntExact(this.selectCount(transcityQuery));
		int pageSize = transcityQuery.getPageSize() == null ? PageSize.PAGE_SIZE20.getSize() : transcityQuery.getPageSize();
		SimplePage simplePage = new SimplePage(transcityQuery.getPageNo(), count, pageSize);
		transcityQuery.setSimplePage(simplePage);
		List<Transcity> transcity = this.selectListByCondition(transcityQuery);
		return new PaginationResultVo<Transcity>(count, simplePage.getPageSize(), simplePage.getPageNo(), simplePage.getPageTotal(), transcity);
	}
	/**
	 * 新增
	 */
	@Override
	public Integer insert(Transcity transcity) {
		return transcityMapper.insert(transcity);
	}

	/**
	 * 批量新增
	 */
	@Override
	public Integer insertBatch(List<Transcity> transcityList) {
		return transcityMapper.insertBatch(transcityList);
	}

	/**
	 * 批量新增或修改
	 */
	@Override
	public Integer insertOrUpdateBatch(List<Transcity> transcityList) {
		return transcityMapper.insertBatch(transcityList);
	}

	/**
	 * 根据TranscityId查询
	 */
	@Override
	public Transcity selectByTranscityId(Long transcityId) {
		return transcityMapper.selectByTranscityId(transcityId);
	}

	/**
	 * 根据TranscityId更新
	 */
	@Override
	public Integer updateByTranscityId(Transcity transcity, Long transcityId) {
		return transcityMapper.updateByTranscityId(transcity, transcityId);
	}

	/**
	 * 根据TranscityId删除
	 */
	@Override
	public Integer deleteByTranscityId(Long transcityId) {
		return transcityMapper.deleteByTranscityId(transcityId);
	}
}
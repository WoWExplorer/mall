package com.mall.service.impl;

import com.mall.entity.po.SmsLog;
import com.mall.mapper.SmsLogMapper;
import com.mall.service.SmsLogService;
import com.mall.entity.query.SmsLogQuery;
import com.mall.entity.vo.PaginationResultVo;
import com.mall.enums.PageSize;
import com.mall.entity.query.SimplePage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *  @Description: 短信记录表SmsLogServiceImpl
 *  @Author: wow
 *  @Date: 2024年06月17日
 */
@Service("smsLogServiceImpl")
public class SmsLogServiceImpl implements SmsLogService {
	@Autowired
	private SmsLogMapper<SmsLog, SmsLogQuery> smsLogMapper;

	/**
	 * 根据条件查询列表
	 */
	@Override
	public List<SmsLog> selectListByCondition(SmsLogQuery smsLogQuery) {
		return smsLogMapper.selectList(smsLogQuery);
	}
	/**
	 * 根据条件查询数量
	 */
	@Override
	public Long selectCount(SmsLogQuery smsLogQuery) {
		return smsLogMapper.selectCount(smsLogQuery);
	}

	/**
	 * 分页查询
	 */
	@Override
	public PaginationResultVo<SmsLog> selectList(SmsLogQuery smsLogQuery) {
		int count = Math.toIntExact(this.selectCount(smsLogQuery));
		int pageSize = smsLogQuery.getPageSize() == null ? PageSize.PAGE_SIZE20.getSize() : smsLogQuery.getPageSize();
		SimplePage simplePage = new SimplePage(smsLogQuery.getPageNo(), count, pageSize);
		smsLogQuery.setSimplePage(simplePage);
		List<SmsLog> smsLog = this.selectListByCondition(smsLogQuery);
		return new PaginationResultVo<SmsLog>(count, simplePage.getPageSize(), simplePage.getPageNo(), simplePage.getPageTotal(), smsLog);
	}
	/**
	 * 新增
	 */
	@Override
	public Integer insert(SmsLog smsLog) {
		return smsLogMapper.insert(smsLog);
	}

	/**
	 * 批量新增
	 */
	@Override
	public Integer insertBatch(List<SmsLog> smsLogList) {
		return smsLogMapper.insertBatch(smsLogList);
	}

	/**
	 * 批量新增或修改
	 */
	@Override
	public Integer insertOrUpdateBatch(List<SmsLog> smsLogList) {
		return smsLogMapper.insertBatch(smsLogList);
	}

	/**
	 * 根据Id查询
	 */
	@Override
	public SmsLog selectById(Long id) {
		return smsLogMapper.selectById(id);
	}

	/**
	 * 根据Id更新
	 */
	@Override
	public Integer updateById(SmsLog smsLog, Long id) {
		return smsLogMapper.updateById(smsLog, id);
	}

	/**
	 * 根据Id删除
	 */
	@Override
	public Integer deleteById(Long id) {
		return smsLogMapper.deleteById(id);
	}
}
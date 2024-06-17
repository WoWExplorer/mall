package com.mall.service.impl;

import com.mall.entity.po.SysLog;
import com.mall.mapper.SysLogMapper;
import com.mall.service.SysLogService;
import com.mall.entity.query.SysLogQuery;
import com.mall.entity.vo.PaginationResultVo;
import com.mall.enums.PageSize;
import com.mall.entity.query.SimplePage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *  @Description: 系统日志SysLogServiceImpl
 *  @Author: wow
 *  @Date: 2024年06月17日
 */
@Service("sysLogServiceImpl")
public class SysLogServiceImpl implements SysLogService {
	@Autowired
	private SysLogMapper<SysLog, SysLogQuery> sysLogMapper;

	/**
	 * 根据条件查询列表
	 */
	@Override
	public List<SysLog> selectListByCondition(SysLogQuery sysLogQuery) {
		return sysLogMapper.selectList(sysLogQuery);
	}
	/**
	 * 根据条件查询数量
	 */
	@Override
	public Long selectCount(SysLogQuery sysLogQuery) {
		return sysLogMapper.selectCount(sysLogQuery);
	}

	/**
	 * 分页查询
	 */
	@Override
	public PaginationResultVo<SysLog> selectList(SysLogQuery sysLogQuery) {
		int count = Math.toIntExact(this.selectCount(sysLogQuery));
		int pageSize = sysLogQuery.getPageSize() == null ? PageSize.PAGE_SIZE20.getSize() : sysLogQuery.getPageSize();
		SimplePage simplePage = new SimplePage(sysLogQuery.getPageNo(), count, pageSize);
		sysLogQuery.setSimplePage(simplePage);
		List<SysLog> sysLog = this.selectListByCondition(sysLogQuery);
		return new PaginationResultVo<SysLog>(count, simplePage.getPageSize(), simplePage.getPageNo(), simplePage.getPageTotal(), sysLog);
	}
	/**
	 * 新增
	 */
	@Override
	public Integer insert(SysLog sysLog) {
		return sysLogMapper.insert(sysLog);
	}

	/**
	 * 批量新增
	 */
	@Override
	public Integer insertBatch(List<SysLog> sysLogList) {
		return sysLogMapper.insertBatch(sysLogList);
	}

	/**
	 * 批量新增或修改
	 */
	@Override
	public Integer insertOrUpdateBatch(List<SysLog> sysLogList) {
		return sysLogMapper.insertBatch(sysLogList);
	}

	/**
	 * 根据Id查询
	 */
	@Override
	public SysLog selectById(Long id) {
		return sysLogMapper.selectById(id);
	}

	/**
	 * 根据Id更新
	 */
	@Override
	public Integer updateById(SysLog sysLog, Long id) {
		return sysLogMapper.updateById(sysLog, id);
	}

	/**
	 * 根据Id删除
	 */
	@Override
	public Integer deleteById(Long id) {
		return sysLogMapper.deleteById(id);
	}
}
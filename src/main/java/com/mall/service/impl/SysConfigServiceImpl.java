package com.mall.service.impl;

import com.mall.entity.po.SysConfig;
import com.mall.mapper.SysConfigMapper;
import com.mall.service.SysConfigService;
import com.mall.entity.query.SysConfigQuery;
import com.mall.entity.vo.PaginationResultVo;
import com.mall.enums.PageSize;
import com.mall.entity.query.SimplePage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *  @Description: 系统配置信息表SysConfigServiceImpl
 *  @Author: wow
 *  @Date: 2024年06月17日
 */
@Service("sysConfigServiceImpl")
public class SysConfigServiceImpl implements SysConfigService {
	@Autowired
	private SysConfigMapper<SysConfig, SysConfigQuery> sysConfigMapper;

	/**
	 * 根据条件查询列表
	 */
	@Override
	public List<SysConfig> selectListByCondition(SysConfigQuery sysConfigQuery) {
		return sysConfigMapper.selectList(sysConfigQuery);
	}
	/**
	 * 根据条件查询数量
	 */
	@Override
	public Long selectCount(SysConfigQuery sysConfigQuery) {
		return sysConfigMapper.selectCount(sysConfigQuery);
	}

	/**
	 * 分页查询
	 */
	@Override
	public PaginationResultVo<SysConfig> selectList(SysConfigQuery sysConfigQuery) {
		int count = Math.toIntExact(this.selectCount(sysConfigQuery));
		int pageSize = sysConfigQuery.getPageSize() == null ? PageSize.PAGE_SIZE20.getSize() : sysConfigQuery.getPageSize();
		SimplePage simplePage = new SimplePage(sysConfigQuery.getPageNo(), count, pageSize);
		sysConfigQuery.setSimplePage(simplePage);
		List<SysConfig> sysConfig = this.selectListByCondition(sysConfigQuery);
		return new PaginationResultVo<SysConfig>(count, simplePage.getPageSize(), simplePage.getPageNo(), simplePage.getPageTotal(), sysConfig);
	}
	/**
	 * 新增
	 */
	@Override
	public Integer insert(SysConfig sysConfig) {
		return sysConfigMapper.insert(sysConfig);
	}

	/**
	 * 批量新增
	 */
	@Override
	public Integer insertBatch(List<SysConfig> sysConfigList) {
		return sysConfigMapper.insertBatch(sysConfigList);
	}

	/**
	 * 批量新增或修改
	 */
	@Override
	public Integer insertOrUpdateBatch(List<SysConfig> sysConfigList) {
		return sysConfigMapper.insertBatch(sysConfigList);
	}

	/**
	 * 根据Id查询
	 */
	@Override
	public SysConfig selectById(Long id) {
		return sysConfigMapper.selectById(id);
	}

	/**
	 * 根据Id更新
	 */
	@Override
	public Integer updateById(SysConfig sysConfig, Long id) {
		return sysConfigMapper.updateById(sysConfig, id);
	}

	/**
	 * 根据Id删除
	 */
	@Override
	public Integer deleteById(Long id) {
		return sysConfigMapper.deleteById(id);
	}

	/**
	 * 根据ParamKey查询
	 */
	@Override
	public SysConfig selectByParamKey(String paramKey) {
		return sysConfigMapper.selectByParamKey(paramKey);
	}

	/**
	 * 根据ParamKey更新
	 */
	@Override
	public Integer updateByParamKey(SysConfig sysConfig, String paramKey) {
		return sysConfigMapper.updateByParamKey(sysConfig, paramKey);
	}

	/**
	 * 根据ParamKey删除
	 */
	@Override
	public Integer deleteByParamKey(String paramKey) {
		return sysConfigMapper.deleteByParamKey(paramKey);
	}
}
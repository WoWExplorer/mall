package com.mall.controller;

import com.mall.entity.vo.PaginationResultVo;
import com.mall.service.impl.SysConfigServiceImpl;
import com.mall.entity.po.SysConfig;
import com.mall.entity.vo.ResultVo;
import com.mall.entity.query.SysConfigQuery;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 *  @Description: 系统配置信息表SysConfigController
 *  @Author: wow
 *  @Date: 2024年06月17日
 */
@RestController
@RequestMapping("/sysConfig")
public class SysConfigController extends BaseController {
	@Autowired
	private SysConfigServiceImpl sysConfigServiceImpl;

	/**
	 * 根据条件查询列表
	 */
	@PostMapping("/selectListByCondition")
	public ResultVo<?> selectListByCondition(@RequestBody SysConfigQuery  sysConfigQuery){
		List<SysConfig> tz_sys_config = sysConfigServiceImpl.selectListByCondition(sysConfigQuery);
		return getSuccessResultVo(tz_sys_config);
	}

	/**
	 * 根据条件查询数量
	 */
	@PostMapping("/selectCount")
	public ResultVo<?> selectCount(@RequestBody SysConfigQuery sysConfigQuery) {
		Long l = sysConfigServiceImpl.selectCount(sysConfigQuery);
		return getSuccessResultVo(l);
	}

	/**
	 * 分页查询
	 */
	@PostMapping("/selectList")
	public ResultVo<?> selectList(@RequestBody SysConfigQuery sysConfigQuery) {
		PaginationResultVo<SysConfig> paginationResultVo = sysConfigServiceImpl.selectList(sysConfigQuery);
		return getSuccessResultVo(paginationResultVo);
	}
	/**
	 * 新增
	 */
	@PostMapping("/insert")
	public ResultVo<?> insert(@RequestBody SysConfig sysConfigQuery) {
		Integer insert = sysConfigServiceImpl.insert(sysConfigQuery);
		if (insert > 0) {
			return getSuccessResultVo(insert);
		} else {
			return ResultVo.fail("新增失败");
		}
	}

	/**
	 * 批量新增
	 */
	@PostMapping("/insertBatch")
	public ResultVo<?> insertBatch(@RequestBody List<SysConfig> sysConfigList) {
		Integer insert = sysConfigServiceImpl.insertBatch(sysConfigList);
		if (insert > 0) {
			return getSuccessResultVo(insert);
		} else {
			return ResultVo.fail("新增失败");
		}
	}

	/**
	 * 批量新增或修改
	 */
	@PostMapping("/insertOrUpdateBatch")
	public ResultVo<?> insertOrUpdateBatch(@RequestBody List<SysConfig> sysConfigList) {
		Integer insert = sysConfigServiceImpl.insertOrUpdateBatch(sysConfigList);
		if (insert > 0) {
			return getSuccessResultVo(insert);
		} else {
			return ResultVo.fail("新增或修改失败");
		}
	}

	/**
	 * 根据Id查询
	 */
	@PostMapping("/selectById")
	public ResultVo<?> selectById(Long id) {
		SysConfig  sysConfigQuery = sysConfigServiceImpl.selectById(id);
		return getSuccessResultVo(sysConfigQuery);
	}

	/**
	 * 根据Id更新
	 */
	@PostMapping("/updateById")
	public ResultVo<?> updateById(SysConfig sysConfig, Long id) {
		Integer update = sysConfigServiceImpl.updateById(sysConfig, id);
		if (update > 0) {
			return getSuccessResultVo(update);
		} else {
			return ResultVo.fail("更新失败");
		}
	}

	/**
	 * 根据Id删除
	 */
	@PostMapping("/deleteById")
	public ResultVo<?> deleteById(Long id) {
		Integer delete = sysConfigServiceImpl.deleteById(id);
		if (delete > 0) {
			return getSuccessResultVo(delete);
		} else {
			return ResultVo.fail("删除失败");
		}
	}

	/**
	 * 根据ParamKey查询
	 */
	@PostMapping("/selectByParamKey")
	public ResultVo<?> selectByParamKey(String paramKey) {
		SysConfig  sysConfigQuery = sysConfigServiceImpl.selectByParamKey(paramKey);
		return getSuccessResultVo(sysConfigQuery);
	}

	/**
	 * 根据ParamKey更新
	 */
	@PostMapping("/updateByParamKey")
	public ResultVo<?> updateByParamKey(SysConfig sysConfig, String paramKey) {
		Integer update = sysConfigServiceImpl.updateByParamKey(sysConfig, paramKey);
		if (update > 0) {
			return getSuccessResultVo(update);
		} else {
			return ResultVo.fail("更新失败");
		}
	}

	/**
	 * 根据ParamKey删除
	 */
	@PostMapping("/deleteByParamKey")
	public ResultVo<?> deleteByParamKey(String paramKey) {
		Integer delete = sysConfigServiceImpl.deleteByParamKey(paramKey);
		if (delete > 0) {
			return getSuccessResultVo(delete);
		} else {
			return ResultVo.fail("删除失败");
		}
	}
}
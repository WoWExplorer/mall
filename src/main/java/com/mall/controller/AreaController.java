package com.mall.controller;

import com.mall.entity.vo.PaginationResultVo;
import com.mall.service.impl.AreaServiceImpl;
import com.mall.entity.po.Area;
import com.mall.entity.vo.ResultVo;
import com.mall.entity.query.AreaQuery;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 *  @Description: AreaController
 *  @Author: wow
 *  @Date: 2024年06月17日
 */
@RestController
@RequestMapping("/area")
public class AreaController extends BaseController {
	@Autowired
	private AreaServiceImpl areaServiceImpl;

	/**
	 * 根据条件查询列表
	 */
	@PostMapping("/selectListByCondition")
	public ResultVo<?> selectListByCondition(@RequestBody AreaQuery  areaQuery){
		List<Area> tz_area = areaServiceImpl.selectListByCondition(areaQuery);
		return getSuccessResultVo(tz_area);
	}

	/**
	 * 返回所有
	 * @return
	 */
	@GetMapping("/getAllRegions")
	public ResultVo<?> getAllRegions() {
		List<Area> tz_area = areaServiceImpl.getAllRegions();
        return getSuccessResultVo(tz_area);
	}
	/**
	 * 根据条件查询数量
	 */
	@PostMapping("/selectCount")
	public ResultVo<?> selectCount(@RequestBody AreaQuery areaQuery) {
		Long l = areaServiceImpl.selectCount(areaQuery);
		return getSuccessResultVo(l);
	}

	/**
	 * 分页查询
	 */
	@PostMapping("/selectList")
	public ResultVo<?> selectList(@RequestBody AreaQuery areaQuery) {
		PaginationResultVo<Area> paginationResultVo = areaServiceImpl.selectList(areaQuery);
		return getSuccessResultVo(paginationResultVo);
	}
	/**
	 * 新增
	 */
	@PostMapping("/insert")
	public ResultVo<?> insert(@RequestBody Area areaQuery) {
		Integer insert = areaServiceImpl.insert(areaQuery);
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
	public ResultVo<?> insertBatch(@RequestBody List<Area> areaList) {
		Integer insert = areaServiceImpl.insertBatch(areaList);
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
	public ResultVo<?> insertOrUpdateBatch(@RequestBody List<Area> areaList) {
		Integer insert = areaServiceImpl.insertOrUpdateBatch(areaList);
		if (insert > 0) {
			return getSuccessResultVo(insert);
		} else {
			return ResultVo.fail("新增或修改失败");
		}
	}

	/**
	 * 根据AreaId查询
	 */
	@PostMapping("/selectByAreaId")
	public ResultVo<?> selectByAreaId(Long areaId) {
		Area  areaQuery = areaServiceImpl.selectByAreaId(areaId);
		return getSuccessResultVo(areaQuery);
	}

	/**
	 * 根据AreaId更新
	 */
	@PostMapping("/updateByAreaId")
	public ResultVo<?> updateByAreaId(Area area, Long areaId) {
		Integer update = areaServiceImpl.updateByAreaId(area, areaId);
		if (update > 0) {
			return getSuccessResultVo(update);
		} else {
			return ResultVo.fail("更新失败");
		}
	}

	/**
	 * 根据AreaId删除
	 */
	@PostMapping("/deleteByAreaId")
	public ResultVo<?> deleteByAreaId(Long areaId) {
		Integer delete = areaServiceImpl.deleteByAreaId(areaId);
		if (delete > 0) {
			return getSuccessResultVo(delete);
		} else {
			return ResultVo.fail("删除失败");
		}
	}
}
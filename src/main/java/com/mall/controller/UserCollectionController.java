package com.mall.controller;

import com.mall.entity.vo.PaginationResultVo;
import com.mall.service.impl.UserCollectionServiceImpl;
import com.mall.entity.po.UserCollection;
import com.mall.entity.vo.ResultVo;
import com.mall.entity.query.UserCollectionQuery;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 *  @Description: UserCollectionController
 *  @Author: wow
 *  @Date: 2024年06月17日
 */
@RestController
@RequestMapping("/userCollection")
public class UserCollectionController extends BaseController {
	@Autowired
	private UserCollectionServiceImpl userCollectionServiceImpl;

	/**
	 * 根据条件查询列表
	 */
	@PostMapping("/selectListByCondition")
	public ResultVo<?> selectListByCondition(@RequestBody UserCollectionQuery  userCollectionQuery){
		List<UserCollection> tz_user_collection = userCollectionServiceImpl.selectListByCondition(userCollectionQuery);
		return getSuccessResultVo(tz_user_collection);
	}

	/**
	 * 根据条件查询数量
	 */
	@PostMapping("/selectCount")
	public ResultVo<?> selectCount(@RequestBody UserCollectionQuery userCollectionQuery) {
		Long l = userCollectionServiceImpl.selectCount(userCollectionQuery);
		return getSuccessResultVo(l);
	}

	/**
	 * 分页查询
	 */
	@PostMapping("/selectList")
	public ResultVo<?> selectList(@RequestBody UserCollectionQuery userCollectionQuery) {
		PaginationResultVo<UserCollection> paginationResultVo = userCollectionServiceImpl.selectList(userCollectionQuery);
		return getSuccessResultVo(paginationResultVo);
	}
	/**
	 * 新增
	 */
	@PostMapping("/insert")
	public ResultVo<?> insert(@RequestBody UserCollection userCollectionQuery) {
		Integer insert = userCollectionServiceImpl.insert(userCollectionQuery);
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
	public ResultVo<?> insertBatch(@RequestBody List<UserCollection> userCollectionList) {
		Integer insert = userCollectionServiceImpl.insertBatch(userCollectionList);
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
	public ResultVo<?> insertOrUpdateBatch(@RequestBody List<UserCollection> userCollectionList) {
		Integer insert = userCollectionServiceImpl.insertOrUpdateBatch(userCollectionList);
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
		UserCollection  userCollectionQuery = userCollectionServiceImpl.selectById(id);
		return getSuccessResultVo(userCollectionQuery);
	}

	/**
	 * 根据Id更新
	 */
	@PostMapping("/updateById")
	public ResultVo<?> updateById(UserCollection userCollection, Long id) {
		Integer update = userCollectionServiceImpl.updateById(userCollection, id);
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
		Integer delete = userCollectionServiceImpl.deleteById(id);
		if (delete > 0) {
			return getSuccessResultVo(delete);
		} else {
			return ResultVo.fail("删除失败");
		}
	}
}
package com.mall.controller;

import cn.hutool.core.date.DateUtil;
import com.mall.entity.vo.PaginationResultVo;
import com.mall.enums.ResultCodeEnum;
import com.mall.service.impl.IndexImgServiceImpl;
import com.mall.entity.po.IndexImg;
import com.mall.entity.vo.ResultVo;
import com.mall.entity.query.IndexImgQuery;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static com.mall.utils.isValid.isValidImageUrl;

/**
 *  @Description: 主页轮播图IndexImgController
 *  @Author: wow
 *  @Date: 2024年06月17日
 */
@RestController
@RequestMapping("/banner")
public class IndexImgController extends BaseController {
	@Autowired
	private IndexImgServiceImpl indexImgServiceImpl;

	/**
	 * 根据条件查询列表
	 */
	@PostMapping("/selectListByCondition")
	public ResultVo<?> selectListByCondition(@RequestBody IndexImgQuery  indexImgQuery){
		List<IndexImg> tz_index_img = indexImgServiceImpl.selectListByCondition(indexImgQuery);
		return getSuccessResultVo(tz_index_img);
	}

	/**
	 * 根据条件查询数量
	 */
	@PostMapping("/selectCount")
	public ResultVo<?> selectCount(@RequestBody IndexImgQuery indexImgQuery) {
		Long l = indexImgServiceImpl.selectCount(indexImgQuery);
		return getSuccessResultVo(l);
	}

	/**
	 * 分页查询
	 */
	@PostMapping("/selectList")
	public ResultVo<?> selectList(@RequestBody IndexImgQuery indexImgQuery) {
		PaginationResultVo<IndexImg> paginationResultVo = indexImgServiceImpl.selectList(indexImgQuery);
		return getSuccessResultVo(paginationResultVo);
	}
	/**
	 * 新增
	 */
	@PostMapping("/insert")
	public ResultVo<?> insert(@RequestBody IndexImg indexImgQuery) {
		if (indexImgQuery.getImgUrl() == null) {
			return ResultVo.fail(ResultCodeEnum.CODE_428.getCode(), "图片地址不能为空");
		}
		if (!isValidImageUrl(indexImgQuery.getImgUrl())) {
			return ResultVo.fail(ResultCodeEnum.CODE_428.getCode(), "图片地址格式不正确");
		}

		indexImgQuery.setUploadTime(DateUtil.date(System.currentTimeMillis()));
		Integer insert = indexImgServiceImpl.insert(indexImgQuery);
		if (insert > 0) {
			return ResultVo.success(ResultCodeEnum.CODE_200.getCode(), "新增成功");
		} else {
			return ResultVo.fail("新增失败");
		}
	}

	/**
	 * 批量新增
	 */
//	@PostMapping("/insertBatch")
//	public ResultVo<?> insertBatch(@RequestBody List<IndexImg> indexImgList) {
//		Integer insert = indexImgServiceImpl.insertBatch(indexImgList);
//		if (insert > 0) {
//			return getSuccessResultVo(insert);
//		} else {
//			return ResultVo.fail("新增失败");
//		}
//	}

	/**
	 * 批量新增或修改
	 */
//	@PostMapping("/insertOrUpdateBatch")
//	public ResultVo<?> insertOrUpdateBatch(@RequestBody List<IndexImg> indexImgList) {
//		Integer insert = indexImgServiceImpl.insertOrUpdateBatch(indexImgList);
//		if (insert > 0) {
//			return getSuccessResultVo(insert);
//		} else {
//			return ResultVo.fail("新增或修改失败");
//		}
//	}

	/**
	 * 根据ImgId查询
	 */
	@PostMapping("/selectByImgId")
	public ResultVo<?> selectByImgId(Long imgId) {
		IndexImg  indexImgQuery = indexImgServiceImpl.selectByImgId(imgId);
		return getSuccessResultVo(indexImgQuery);
	}

	/**
	 * 根据ImgId更新
	 */
	@PostMapping("/updateByImgId")
	public ResultVo<?> updateByImgId(IndexImg indexImg, Long imgId) {
		Integer update = indexImgServiceImpl.updateByImgId(indexImg, imgId);
		if (update > 0) {
			return getSuccessResultVo(update);
		} else {
			return ResultVo.fail("更新失败");
		}
	}

	/**
	 * 根据ImgId删除
	 */
	@PostMapping("/deleteByImgId")
	public ResultVo<?> deleteByImgId(Long imgId) {
		Integer delete = indexImgServiceImpl.deleteByImgId(imgId);
		if (delete > 0) {
			return getSuccessResultVo(delete);
		} else {
			return ResultVo.fail("删除失败");
		}
	}
}
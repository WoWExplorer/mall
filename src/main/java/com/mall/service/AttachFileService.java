package com.mall.service;

import com.mall.entity.po.AttachFile;
import com.mall.entity.query.AttachFileQuery;
import com.mall.entity.vo.PaginationResultVo;

import java.util.List;

/**
 *  @Description: Service
 *  @Author: wow
 *  @Date: 2024年06月17日
 */
public interface AttachFileService {

	/**
	 * 根据条件查询列表
	 */
	List<AttachFile> selectListByCondition(AttachFileQuery attachFileQuery);

	/**
	 * 根据条件查询数量
	 */
	Long selectCount(AttachFileQuery attachFileQuery);

	/**
	 * 分页查询
	 */
	PaginationResultVo<AttachFile> selectList(AttachFileQuery attachFileQuery);

	/**
	 * 新增
	 */
	Integer insert(AttachFile attachFile);

	/**
	 * 批量新增
	 */
	Integer insertBatch(List<AttachFile> attachFile);

	/**
	 * 批量新增或修改
	 */
	Integer insertOrUpdateBatch(List<AttachFile> attachFileList);

	/**
	 * 根据FileId查询
	 */
	AttachFile selectByFileId(Long fileId);

	/**
	 * 根据FileId更新
	 */
	Integer updateByFileId(AttachFile AttachFileQuery, Long fileId);

	/**
	 * 根据FileId删除
	 */
	Integer deleteByFileId(Long fileId);


}
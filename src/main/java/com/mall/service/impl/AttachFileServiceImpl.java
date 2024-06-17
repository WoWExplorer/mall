package com.mall.service.impl;

import com.mall.entity.po.AttachFile;
import com.mall.mapper.AttachFileMapper;
import com.mall.service.AttachFileService;
import com.mall.entity.query.AttachFileQuery;
import com.mall.entity.vo.PaginationResultVo;
import com.mall.enums.PageSize;
import com.mall.entity.query.SimplePage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *  @Description: AttachFileServiceImpl
 *  @Author: wow
 *  @Date: 2024年06月17日
 */
@Service("attachFileServiceImpl")
public class AttachFileServiceImpl implements AttachFileService {
	@Autowired
	private AttachFileMapper<AttachFile, AttachFileQuery> attachFileMapper;

	/**
	 * 根据条件查询列表
	 */
	@Override
	public List<AttachFile> selectListByCondition(AttachFileQuery attachFileQuery) {
		return attachFileMapper.selectList(attachFileQuery);
	}
	/**
	 * 根据条件查询数量
	 */
	@Override
	public Long selectCount(AttachFileQuery attachFileQuery) {
		return attachFileMapper.selectCount(attachFileQuery);
	}

	/**
	 * 分页查询
	 */
	@Override
	public PaginationResultVo<AttachFile> selectList(AttachFileQuery attachFileQuery) {
		int count = Math.toIntExact(this.selectCount(attachFileQuery));
		int pageSize = attachFileQuery.getPageSize() == null ? PageSize.PAGE_SIZE20.getSize() : attachFileQuery.getPageSize();
		SimplePage simplePage = new SimplePage(attachFileQuery.getPageNo(), count, pageSize);
		attachFileQuery.setSimplePage(simplePage);
		List<AttachFile> attachFile = this.selectListByCondition(attachFileQuery);
		return new PaginationResultVo<AttachFile>(count, simplePage.getPageSize(), simplePage.getPageNo(), simplePage.getPageTotal(), attachFile);
	}
	/**
	 * 新增
	 */
	@Override
	public Integer insert(AttachFile attachFile) {
		return attachFileMapper.insert(attachFile);
	}

	/**
	 * 批量新增
	 */
	@Override
	public Integer insertBatch(List<AttachFile> attachFileList) {
		return attachFileMapper.insertBatch(attachFileList);
	}

	/**
	 * 批量新增或修改
	 */
	@Override
	public Integer insertOrUpdateBatch(List<AttachFile> attachFileList) {
		return attachFileMapper.insertBatch(attachFileList);
	}

	/**
	 * 根据FileId查询
	 */
	@Override
	public AttachFile selectByFileId(Long fileId) {
		return attachFileMapper.selectByFileId(fileId);
	}

	/**
	 * 根据FileId更新
	 */
	@Override
	public Integer updateByFileId(AttachFile attachFile, Long fileId) {
		return attachFileMapper.updateByFileId(attachFile, fileId);
	}

	/**
	 * 根据FileId删除
	 */
	@Override
	public Integer deleteByFileId(Long fileId) {
		return attachFileMapper.deleteByFileId(fileId);
	}
}
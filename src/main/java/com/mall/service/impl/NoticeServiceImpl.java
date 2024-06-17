package com.mall.service.impl;

import com.mall.entity.po.Notice;
import com.mall.mapper.NoticeMapper;
import com.mall.service.NoticeService;
import com.mall.entity.query.NoticeQuery;
import com.mall.entity.vo.PaginationResultVo;
import com.mall.enums.PageSize;
import com.mall.entity.query.SimplePage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *  @Description: NoticeServiceImpl
 *  @Author: wow
 *  @Date: 2024年06月17日
 */
@Service("noticeServiceImpl")
public class NoticeServiceImpl implements NoticeService {
	@Autowired
	private NoticeMapper<Notice, NoticeQuery> noticeMapper;

	/**
	 * 根据条件查询列表
	 */
	@Override
	public List<Notice> selectListByCondition(NoticeQuery noticeQuery) {
		return noticeMapper.selectList(noticeQuery);
	}
	/**
	 * 根据条件查询数量
	 */
	@Override
	public Long selectCount(NoticeQuery noticeQuery) {
		return noticeMapper.selectCount(noticeQuery);
	}

	/**
	 * 分页查询
	 */
	@Override
	public PaginationResultVo<Notice> selectList(NoticeQuery noticeQuery) {
		int count = Math.toIntExact(this.selectCount(noticeQuery));
		int pageSize = noticeQuery.getPageSize() == null ? PageSize.PAGE_SIZE20.getSize() : noticeQuery.getPageSize();
		SimplePage simplePage = new SimplePage(noticeQuery.getPageNo(), count, pageSize);
		noticeQuery.setSimplePage(simplePage);
		List<Notice> notice = this.selectListByCondition(noticeQuery);
		return new PaginationResultVo<Notice>(count, simplePage.getPageSize(), simplePage.getPageNo(), simplePage.getPageTotal(), notice);
	}
	/**
	 * 新增
	 */
	@Override
	public Integer insert(Notice notice) {
		return noticeMapper.insert(notice);
	}

	/**
	 * 批量新增
	 */
	@Override
	public Integer insertBatch(List<Notice> noticeList) {
		return noticeMapper.insertBatch(noticeList);
	}

	/**
	 * 批量新增或修改
	 */
	@Override
	public Integer insertOrUpdateBatch(List<Notice> noticeList) {
		return noticeMapper.insertBatch(noticeList);
	}

	/**
	 * 根据Id查询
	 */
	@Override
	public Notice selectById(Long id) {
		return noticeMapper.selectById(id);
	}

	/**
	 * 根据Id更新
	 */
	@Override
	public Integer updateById(Notice notice, Long id) {
		return noticeMapper.updateById(notice, id);
	}

	/**
	 * 根据Id删除
	 */
	@Override
	public Integer deleteById(Long id) {
		return noticeMapper.deleteById(id);
	}
}
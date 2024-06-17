package com.mall.service;

import com.mall.entity.po.Notice;
import com.mall.entity.query.NoticeQuery;
import com.mall.entity.vo.PaginationResultVo;

import java.util.List;

/**
 *  @Description: Service
 *  @Author: wow
 *  @Date: 2024年06月17日
 */
public interface NoticeService {

	/**
	 * 根据条件查询列表
	 */
	List<Notice> selectListByCondition(NoticeQuery noticeQuery);

	/**
	 * 根据条件查询数量
	 */
	Long selectCount(NoticeQuery noticeQuery);

	/**
	 * 分页查询
	 */
	PaginationResultVo<Notice> selectList(NoticeQuery noticeQuery);

	/**
	 * 新增
	 */
	Integer insert(Notice notice);

	/**
	 * 批量新增
	 */
	Integer insertBatch(List<Notice> notice);

	/**
	 * 批量新增或修改
	 */
	Integer insertOrUpdateBatch(List<Notice> noticeList);

	/**
	 * 根据Id查询
	 */
	Notice selectById(Long id);

	/**
	 * 根据Id更新
	 */
	Integer updateById(Notice NoticeQuery, Long id);

	/**
	 * 根据Id删除
	 */
	Integer deleteById(Long id);


}
package com.mall.service;

import com.mall.entity.po.Message;
import com.mall.entity.query.MessageQuery;
import com.mall.entity.vo.PaginationResultVo;

import java.util.List;

/**
 *  @Description: Service
 *  @Author: wow
 *  @Date: 2024年06月17日
 */
public interface MessageService {

	/**
	 * 根据条件查询列表
	 */
	List<Message> selectListByCondition(MessageQuery messageQuery);

	/**
	 * 根据条件查询数量
	 */
	Long selectCount(MessageQuery messageQuery);

	/**
	 * 分页查询
	 */
	PaginationResultVo<Message> selectList(MessageQuery messageQuery);

	/**
	 * 新增
	 */
	Integer insert(Message message);

	/**
	 * 批量新增
	 */
	Integer insertBatch(List<Message> message);

	/**
	 * 批量新增或修改
	 */
	Integer insertOrUpdateBatch(List<Message> messageList);

	/**
	 * 根据Id查询
	 */
	Message selectById(Long id);

	/**
	 * 根据Id更新
	 */
	Integer updateById(Message MessageQuery, Long id);

	/**
	 * 根据Id删除
	 */
	Integer deleteById(Long id);


}
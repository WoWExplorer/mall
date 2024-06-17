package com.mall.service.impl;

import com.mall.entity.po.Message;
import com.mall.mapper.MessageMapper;
import com.mall.service.MessageService;
import com.mall.entity.query.MessageQuery;
import com.mall.entity.vo.PaginationResultVo;
import com.mall.enums.PageSize;
import com.mall.entity.query.SimplePage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *  @Description: MessageServiceImpl
 *  @Author: wow
 *  @Date: 2024年06月17日
 */
@Service("messageServiceImpl")
public class MessageServiceImpl implements MessageService {
	@Autowired
	private MessageMapper<Message, MessageQuery> messageMapper;

	/**
	 * 根据条件查询列表
	 */
	@Override
	public List<Message> selectListByCondition(MessageQuery messageQuery) {
		return messageMapper.selectList(messageQuery);
	}
	/**
	 * 根据条件查询数量
	 */
	@Override
	public Long selectCount(MessageQuery messageQuery) {
		return messageMapper.selectCount(messageQuery);
	}

	/**
	 * 分页查询
	 */
	@Override
	public PaginationResultVo<Message> selectList(MessageQuery messageQuery) {
		int count = Math.toIntExact(this.selectCount(messageQuery));
		int pageSize = messageQuery.getPageSize() == null ? PageSize.PAGE_SIZE20.getSize() : messageQuery.getPageSize();
		SimplePage simplePage = new SimplePage(messageQuery.getPageNo(), count, pageSize);
		messageQuery.setSimplePage(simplePage);
		List<Message> message = this.selectListByCondition(messageQuery);
		return new PaginationResultVo<Message>(count, simplePage.getPageSize(), simplePage.getPageNo(), simplePage.getPageTotal(), message);
	}
	/**
	 * 新增
	 */
	@Override
	public Integer insert(Message message) {
		return messageMapper.insert(message);
	}

	/**
	 * 批量新增
	 */
	@Override
	public Integer insertBatch(List<Message> messageList) {
		return messageMapper.insertBatch(messageList);
	}

	/**
	 * 批量新增或修改
	 */
	@Override
	public Integer insertOrUpdateBatch(List<Message> messageList) {
		return messageMapper.insertBatch(messageList);
	}

	/**
	 * 根据Id查询
	 */
	@Override
	public Message selectById(Long id) {
		return messageMapper.selectById(id);
	}

	/**
	 * 根据Id更新
	 */
	@Override
	public Integer updateById(Message message, Long id) {
		return messageMapper.updateById(message, id);
	}

	/**
	 * 根据Id删除
	 */
	@Override
	public Integer deleteById(Long id) {
		return messageMapper.deleteById(id);
	}
}
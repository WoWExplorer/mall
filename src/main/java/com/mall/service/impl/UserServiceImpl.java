package com.mall.service.impl;

import com.mall.entity.po.User;
import com.mall.mapper.UserMapper;
import com.mall.service.UserService;
import com.mall.entity.query.UserQuery;
import com.mall.entity.vo.PaginationResultVo;
import com.mall.enums.PageSize;
import com.mall.entity.query.SimplePage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *  @Description: 用户表UserServiceImpl
 *  @Author: wow
 *  @Date: 2024年06月17日
 */
@Service("userServiceImpl")
public class UserServiceImpl implements UserService {
	@Autowired
	private UserMapper<User, UserQuery> userMapper;

	/**
	 * 根据条件查询列表
	 */
	@Override
	public List<User> selectListByCondition(UserQuery userQuery) {
		return userMapper.selectList(userQuery);
	}
	/**
	 * 根据条件查询数量
	 */
	@Override
	public Long selectCount(UserQuery userQuery) {
		return userMapper.selectCount(userQuery);
	}

	/**
	 * 分页查询
	 */
	@Override
	public PaginationResultVo<User> selectList(UserQuery userQuery) {
		int count = Math.toIntExact(this.selectCount(userQuery));
		int pageSize = userQuery.getPageSize() == null ? PageSize.PAGE_SIZE20.getSize() : userQuery.getPageSize();
		SimplePage simplePage = new SimplePage(userQuery.getPageNo(), count, pageSize);
		userQuery.setSimplePage(simplePage);
		List<User> user = this.selectListByCondition(userQuery);
		return new PaginationResultVo<User>(count, simplePage.getPageSize(), simplePage.getPageNo(), simplePage.getPageTotal(), user);
	}
	/**
	 * 新增
	 */
	@Override
	public Integer insert(User user) {
		return userMapper.insert(user);
	}

	/**
	 * 批量新增
	 */
	@Override
	public Integer insertBatch(List<User> userList) {
		return userMapper.insertBatch(userList);
	}

	/**
	 * 批量新增或修改
	 */
	@Override
	public Integer insertOrUpdateBatch(List<User> userList) {
		return userMapper.insertBatch(userList);
	}

	/**
	 * 根据UserId查询
	 */
	@Override
	public User selectByUserId(String userId) {
		return userMapper.selectByUserId(userId);
	}

	/**
	 * 根据UserId更新
	 */
	@Override
	public Integer updateByUserId(User user, String userId) {
		return userMapper.updateByUserId(user, userId);
	}

	/**
	 * 根据UserId删除
	 */
	@Override
	public Integer deleteByUserId(String userId) {
		return userMapper.deleteByUserId(userId);
	}

	/**
	 * 根据UserMail查询
	 */
	@Override
	public User selectByUserMail(String userMail) {
		return userMapper.selectByUserMail(userMail);
	}

	/**
	 * 根据UserMail更新
	 */
	@Override
	public Integer updateByUserMail(User user, String userMail) {
		return userMapper.updateByUserMail(user, userMail);
	}

	/**
	 * 根据UserMail删除
	 */
	@Override
	public Integer deleteByUserMail(String userMail) {
		return userMapper.deleteByUserMail(userMail);
	}

	/**
	 * 根据UserMobile查询
	 */
	@Override
	public User selectByUserMobile(String userMobile) {
		return userMapper.selectByUserMobile(userMobile);
	}

	/**
	 * 根据UserMobile更新
	 */
	@Override
	public Integer updateByUserMobile(User user, String userMobile) {
		return userMapper.updateByUserMobile(user, userMobile);
	}

	/**
	 * 根据UserMobile删除
	 */
	@Override
	public Integer deleteByUserMobile(String userMobile) {
		return userMapper.deleteByUserMobile(userMobile);
	}
}
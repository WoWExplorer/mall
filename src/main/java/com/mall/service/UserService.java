package com.mall.service;

import com.mall.entity.po.User;
import com.mall.entity.query.UserQuery;
import com.mall.entity.vo.PaginationResultVo;

import java.util.List;

/**
 *  @Description: 用户表Service
 *  @Author: wow
 *  @Date: 2024年06月17日
 */
public interface UserService {

	/**
	 * 根据条件查询列表
	 */
	List<User> selectListByCondition(UserQuery userQuery);

	/**
	 * 根据条件查询数量
	 */
	Long selectCount(UserQuery userQuery);

	/**
	 * 分页查询
	 */
	PaginationResultVo<User> selectList(UserQuery userQuery);

	/**
	 * 新增
	 */
	Integer insert(User user);

	/**
	 * 批量新增
	 */
	Integer insertBatch(List<User> user);

	/**
	 * 批量新增或修改
	 */
	Integer insertOrUpdateBatch(List<User> userList);

	/**
	 * 根据UserId查询
	 */
	User selectByUserId(String userId);

	/**
	 * 根据UserId更新
	 */
	Integer updateByUserId(User UserQuery, String userId);

	/**
	 * 根据UserId删除
	 */
	Integer deleteByUserId(String userId);

	/**
	 * 根据UserMail查询
	 */
	User selectByUserMail(String userMail);

	/**
	 * 根据UserMail更新
	 */
	Integer updateByUserMail(User UserQuery, String userMail);

	/**
	 * 根据UserMail删除
	 */
	Integer deleteByUserMail(String userMail);

	/**
	 * 根据UserMobile查询
	 */
	User selectByUserMobile(String userMobile);

	/**
	 * 根据UserMobile更新
	 */
	Integer updateByUserMobile(User UserQuery, String userMobile);

	/**
	 * 根据UserMobile删除
	 */
	Integer deleteByUserMobile(String userMobile);


}
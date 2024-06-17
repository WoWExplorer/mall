package com.mall.service;

import com.mall.entity.po.UserCollection;
import com.mall.entity.query.UserCollectionQuery;
import com.mall.entity.vo.PaginationResultVo;

import java.util.List;

/**
 *  @Description: Service
 *  @Author: wow
 *  @Date: 2024年06月17日
 */
public interface UserCollectionService {

	/**
	 * 根据条件查询列表
	 */
	List<UserCollection> selectListByCondition(UserCollectionQuery userCollectionQuery);

	/**
	 * 根据条件查询数量
	 */
	Long selectCount(UserCollectionQuery userCollectionQuery);

	/**
	 * 分页查询
	 */
	PaginationResultVo<UserCollection> selectList(UserCollectionQuery userCollectionQuery);

	/**
	 * 新增
	 */
	Integer insert(UserCollection userCollection);

	/**
	 * 批量新增
	 */
	Integer insertBatch(List<UserCollection> userCollection);

	/**
	 * 批量新增或修改
	 */
	Integer insertOrUpdateBatch(List<UserCollection> userCollectionList);

	/**
	 * 根据Id查询
	 */
	UserCollection selectById(Long id);

	/**
	 * 根据Id更新
	 */
	Integer updateById(UserCollection UserCollectionQuery, Long id);

	/**
	 * 根据Id删除
	 */
	Integer deleteById(Long id);


}
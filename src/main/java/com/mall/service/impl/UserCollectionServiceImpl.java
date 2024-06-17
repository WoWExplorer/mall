package com.mall.service.impl;

import com.mall.entity.po.UserCollection;
import com.mall.mapper.UserCollectionMapper;
import com.mall.service.UserCollectionService;
import com.mall.entity.query.UserCollectionQuery;
import com.mall.entity.vo.PaginationResultVo;
import com.mall.enums.PageSize;
import com.mall.entity.query.SimplePage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *  @Description: UserCollectionServiceImpl
 *  @Author: wow
 *  @Date: 2024年06月17日
 */
@Service("userCollectionServiceImpl")
public class UserCollectionServiceImpl implements UserCollectionService {
	@Autowired
	private UserCollectionMapper<UserCollection, UserCollectionQuery> userCollectionMapper;

	/**
	 * 根据条件查询列表
	 */
	@Override
	public List<UserCollection> selectListByCondition(UserCollectionQuery userCollectionQuery) {
		return userCollectionMapper.selectList(userCollectionQuery);
	}
	/**
	 * 根据条件查询数量
	 */
	@Override
	public Long selectCount(UserCollectionQuery userCollectionQuery) {
		return userCollectionMapper.selectCount(userCollectionQuery);
	}

	/**
	 * 分页查询
	 */
	@Override
	public PaginationResultVo<UserCollection> selectList(UserCollectionQuery userCollectionQuery) {
		int count = Math.toIntExact(this.selectCount(userCollectionQuery));
		int pageSize = userCollectionQuery.getPageSize() == null ? PageSize.PAGE_SIZE20.getSize() : userCollectionQuery.getPageSize();
		SimplePage simplePage = new SimplePage(userCollectionQuery.getPageNo(), count, pageSize);
		userCollectionQuery.setSimplePage(simplePage);
		List<UserCollection> userCollection = this.selectListByCondition(userCollectionQuery);
		return new PaginationResultVo<UserCollection>(count, simplePage.getPageSize(), simplePage.getPageNo(), simplePage.getPageTotal(), userCollection);
	}
	/**
	 * 新增
	 */
	@Override
	public Integer insert(UserCollection userCollection) {
		return userCollectionMapper.insert(userCollection);
	}

	/**
	 * 批量新增
	 */
	@Override
	public Integer insertBatch(List<UserCollection> userCollectionList) {
		return userCollectionMapper.insertBatch(userCollectionList);
	}

	/**
	 * 批量新增或修改
	 */
	@Override
	public Integer insertOrUpdateBatch(List<UserCollection> userCollectionList) {
		return userCollectionMapper.insertBatch(userCollectionList);
	}

	/**
	 * 根据Id查询
	 */
	@Override
	public UserCollection selectById(Long id) {
		return userCollectionMapper.selectById(id);
	}

	/**
	 * 根据Id更新
	 */
	@Override
	public Integer updateById(UserCollection userCollection, Long id) {
		return userCollectionMapper.updateById(userCollection, id);
	}

	/**
	 * 根据Id删除
	 */
	@Override
	public Integer deleteById(Long id) {
		return userCollectionMapper.deleteById(id);
	}
}
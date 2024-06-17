package com.mall.service.impl;

import com.mall.entity.po.ProdTag;
import com.mall.mapper.ProdTagMapper;
import com.mall.service.ProdTagService;
import com.mall.entity.query.ProdTagQuery;
import com.mall.entity.vo.PaginationResultVo;
import com.mall.enums.PageSize;
import com.mall.entity.query.SimplePage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *  @Description: 商品分组表ProdTagServiceImpl
 *  @Author: wow
 *  @Date: 2024年06月17日
 */
@Service("prodTagServiceImpl")
public class ProdTagServiceImpl implements ProdTagService {
	@Autowired
	private ProdTagMapper<ProdTag, ProdTagQuery> prodTagMapper;

	/**
	 * 根据条件查询列表
	 */
	@Override
	public List<ProdTag> selectListByCondition(ProdTagQuery prodTagQuery) {
		return prodTagMapper.selectList(prodTagQuery);
	}
	/**
	 * 根据条件查询数量
	 */
	@Override
	public Long selectCount(ProdTagQuery prodTagQuery) {
		return prodTagMapper.selectCount(prodTagQuery);
	}

	/**
	 * 分页查询
	 */
	@Override
	public PaginationResultVo<ProdTag> selectList(ProdTagQuery prodTagQuery) {
		int count = Math.toIntExact(this.selectCount(prodTagQuery));
		int pageSize = prodTagQuery.getPageSize() == null ? PageSize.PAGE_SIZE20.getSize() : prodTagQuery.getPageSize();
		SimplePage simplePage = new SimplePage(prodTagQuery.getPageNo(), count, pageSize);
		prodTagQuery.setSimplePage(simplePage);
		List<ProdTag> prodTag = this.selectListByCondition(prodTagQuery);
		return new PaginationResultVo<ProdTag>(count, simplePage.getPageSize(), simplePage.getPageNo(), simplePage.getPageTotal(), prodTag);
	}
	/**
	 * 新增
	 */
	@Override
	public Integer insert(ProdTag prodTag) {
		return prodTagMapper.insert(prodTag);
	}

	/**
	 * 批量新增
	 */
	@Override
	public Integer insertBatch(List<ProdTag> prodTagList) {
		return prodTagMapper.insertBatch(prodTagList);
	}

	/**
	 * 批量新增或修改
	 */
	@Override
	public Integer insertOrUpdateBatch(List<ProdTag> prodTagList) {
		return prodTagMapper.insertBatch(prodTagList);
	}

	/**
	 * 根据Id查询
	 */
	@Override
	public ProdTag selectById(Long id) {
		return prodTagMapper.selectById(id);
	}

	/**
	 * 根据Id更新
	 */
	@Override
	public Integer updateById(ProdTag prodTag, Long id) {
		return prodTagMapper.updateById(prodTag, id);
	}

	/**
	 * 根据Id删除
	 */
	@Override
	public Integer deleteById(Long id) {
		return prodTagMapper.deleteById(id);
	}
}
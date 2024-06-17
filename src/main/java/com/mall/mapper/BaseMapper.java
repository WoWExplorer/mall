package com.mall.mapper;


import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BaseMapper<T, P> {

    // 定义一个公共的Mapper方法

    /**
     * insert: (插入). <br/>
     */
    Integer insert(@Param("bean") T t);

    /**
     * InsertOrUpdate: (插入或者更新). <br/>
     */
    Integer insertOrUpdate(@Param("bean") T t);


    /**
     * insertBatch: (批量插入). <br/>
     */
    Integer insertBatch(@Param("beans") List<T> tList);


    /**
     * InsertOrUpdateBatch: (批量插入或者更新). <br/>
     */
    Integer insertOrUpdateBatch(@Param("beans") List<T> tList);

    /**
     * selectList: (根据参数查询集合). <br/>
     */
    List<T> selectList(@Param("query") P p);


    /**
     * selectCount: (根据参数查询数量). <br/>
     */
    Long selectCount(@Param("query") P p);
}

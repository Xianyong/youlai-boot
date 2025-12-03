package com.youlai.boot.repository.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.youlai.boot.repository.model.entity.BizRepository;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.youlai.boot.repository.model.query.BizRepositoryQuery;
import com.youlai.boot.repository.model.vo.BizRepositoryVO;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品选购Mapper接口
 *
 * @author youlaitech
 * @since 2025-12-02 09:35
 */
@Mapper
public interface BizRepositoryMapper extends BaseMapper<BizRepository> {

    /**
     * 获取商品选购分页数据
     *
     * @param page 分页对象
     * @param queryParams 查询参数
     * @return {@link Page<BizRepositoryVO>} 商品选购分页列表
     */
    Page<BizRepositoryVO> getBizRepositoryPage(Page<BizRepositoryVO> page, BizRepositoryQuery queryParams);

}

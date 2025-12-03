package com.youlai.boot.orders.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.youlai.boot.orders.model.entity.BizOrders;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.youlai.boot.orders.model.query.BizOrdersQuery;
import com.youlai.boot.orders.model.vo.BizOrdersVO;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单Mapper接口
 *
 * @author youlaitech
 * @since 2025-12-02 19:33
 */
@Mapper
public interface BizOrdersMapper extends BaseMapper<BizOrders> {

    /**
     * 获取订单分页数据
     *
     * @param page 分页对象
     * @param queryParams 查询参数
     * @return {@link Page<BizOrdersVO>} 订单分页列表
     */
    Page<BizOrdersVO> getBizOrdersPage(Page<BizOrdersVO> page, BizOrdersQuery queryParams);

}

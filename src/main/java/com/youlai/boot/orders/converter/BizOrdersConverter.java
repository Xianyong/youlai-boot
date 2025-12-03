package com.youlai.boot.orders.converter;

import org.mapstruct.Mapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.youlai.boot.orders.model.entity.BizOrders;
import com.youlai.boot.orders.model.form.BizOrdersForm;

/**
 * 订单对象转换器
 *
 * @author youlaitech
 * @since 2025-12-02 19:33
 */
@Mapper(componentModel = "spring")
public interface BizOrdersConverter{

    BizOrdersForm toForm(BizOrders entity);

    BizOrders toEntity(BizOrdersForm formData);
}
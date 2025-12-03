package com.youlai.boot.orders.service;

import com.youlai.boot.orders.model.entity.BizOrders;
import com.youlai.boot.orders.model.form.BizOrdersForm;
import com.youlai.boot.orders.model.query.BizOrdersQuery;
import com.youlai.boot.orders.model.vo.BizOrdersVO;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * 订单服务类
 *
 * @author youlaitech
 * @since 2025-12-02 19:33
 */
public interface BizOrdersService extends IService<BizOrders> {

    /**
     *订单分页列表
     *
     * @return {@link IPage<BizOrdersVO>} 订单分页列表
     */
    IPage<BizOrdersVO> getBizOrdersPage(BizOrdersQuery queryParams);

    /**
     * 获取订单表单数据
     *
     * @param id 订单ID
     * @return 订单表单数据
     */
     BizOrdersForm getBizOrdersFormData(Long id);

    /**
     * 新增订单
     *
     * @param formData 订单表单对象
     * @return 是否新增成功
     */
    boolean saveBizOrders(BizOrdersForm formData);

    /**
     * 修改订单
     *
     * @param id   订单ID
     * @param formData 订单表单对象
     * @return 是否修改成功
     */
    boolean updateBizOrders(Long id, BizOrdersForm formData);

    /**
     * 删除订单
     *
     * @param ids 订单ID，多个以英文逗号(,)分割
     * @return 是否删除成功
     */
    boolean deleteBizOrderss(String ids);

}

package com.youlai.boot.orders.model.entity;

import lombok.Getter;
import lombok.Setter;
import java.time.LocalDateTime;
import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.TableName;
import com.youlai.boot.common.base.BaseEntity;

/**
 * 订单实体对象
 *
 * @author youlaitech
 * @since 2025-12-02 19:33
 */
@Getter
@Setter
@TableName("biz_orders")
public class BizOrders extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 站点ID，外键关联部门表
     */
    private Integer repoId;
    /**
     * 用户ID，外键关联用户表
     */
    private Integer userId;
    /**
     * 购买数量
     */
    private Integer quantity;
    /**
     * 商品单价（下单时价格）
     */
    private BigDecimal unitPrice;
    /**
     * 订单总金额
     */
    private BigDecimal totalAmount;
    /**
     * 订单日期（下单时间）
     */
    private LocalDateTime orderDate;
    /**
     * 记录创建人（用户ID）
     */
    private Integer createBy;
    /**
     * 记录最后修改人
     */
    private Integer updateBy;
}

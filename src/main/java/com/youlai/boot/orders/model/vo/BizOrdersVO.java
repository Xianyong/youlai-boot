package com.youlai.boot.orders.model.vo;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;
import java.time.LocalDateTime;
import java.math.BigDecimal;

/**
 * 订单视图对象
 *
 * @author youlaitech
 * @since 2025-12-02 19:33
 */
@Getter
@Setter
@Schema( description = "订单视图对象")
public class BizOrdersVO implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Schema(description = "订单唯一标识符")
    private Integer id;
    @Schema(description = "站点ID，外键关联部门表")
    private Integer repoId;
    @Schema(description = "用户ID，外键关联用户表")
    private Integer userId;
    @Schema(description = "用户名称")
    private String userName;

    @Schema(description = "部门名称")
    private  String departmentName;

    @Schema(description = "商品名称")
    private String productName;
    @Schema(description = "购买数量")
    private Integer quantity;
    @Schema(description = "商品单价（下单时价格）")
    private BigDecimal unitPrice;
    @Schema(description = "订单总金额")
    private BigDecimal totalAmount;
    @Schema(description = "订单日期（下单时间）")
    private LocalDateTime orderDate;
    @Schema(description = "记录创建人（用户ID）")
    private Integer createBy;
    @Schema(description = "记录创建时间")
    private LocalDateTime createTime;
    @Schema(description = "记录最后修改人")
    private Integer updateBy;
    @Schema(description = "记录最后修改时间")
    private LocalDateTime updateTime;
}

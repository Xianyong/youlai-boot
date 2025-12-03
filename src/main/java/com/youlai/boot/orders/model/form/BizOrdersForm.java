package com.youlai.boot.orders.model.form;

import java.io.Serial;
import java.io.Serializable;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;
import java.time.LocalDateTime;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.math.BigDecimal;
import jakarta.validation.constraints.*;

/**
 * 订单表单对象
 *
 * @author youlaitech
 * @since 2025-12-02 19:33
 */
@Getter
@Setter
@Schema(description = "订单表单对象")
public class BizOrdersForm implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Schema(description = "订单唯一标识符")
    private Integer id;

    @Schema(description = "站点ID，外键关联部门表")
    @NotNull(message = "站点ID，外键关联部门表不能为空")
    private Integer repoId;

    @Schema(description = "用户ID，外键关联用户表")
    @NotNull(message = "用户ID，外键关联用户表不能为空")
    private Integer userId;

    @Schema(description = "购买数量")
    @NotNull(message = "购买数量不能为空")
    private Integer quantity;

    @Schema(description = "商品单价（下单时价格）")
    @NotNull(message = "商品单价（下单时价格）不能为空")
    private BigDecimal unitPrice;

    @Schema(description = "订单总金额")
    @NotNull(message = "订单总金额不能为空")
    private BigDecimal totalAmount;

    @Schema(description = "订单日期（下单时间）")
    @NotNull(message = "订单日期（下单时间）不能为空")
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime orderDate;

    @Schema(description = "记录创建人（用户ID）")
    @NotNull(message = "记录创建人（用户ID）不能为空")
    private Integer createBy;

    @Schema(description = "记录创建时间")
    @NotNull(message = "记录创建时间不能为空")
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime createTime;

    @Schema(description = "记录最后修改人")
    private Integer updateBy;

    @Schema(description = "记录最后修改时间")
    @NotNull(message = "记录最后修改时间不能为空")
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime updateTime;


}

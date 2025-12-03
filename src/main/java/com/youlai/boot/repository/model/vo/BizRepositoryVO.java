package com.youlai.boot.repository.model.vo;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;
import java.time.LocalDateTime;

/**
 * 商品选购视图对象
 *
 * @author youlaitech
 * @since 2025-12-02 09:35
 */
@Getter
@Setter
@Schema( description = "商品选购视图对象")
public class BizRepositoryVO implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Schema(description = "关系记录唯一标识符")
    private Long id;
    @Schema(description = "站点ID，外键关联部门表")
    private Long departmentId;
    @Schema(description = "站点名称")
    private String departmentName;
    @Schema(description = "产品ID，外键关联产品表")
    private Long productId;
    @Schema(description = "产品名称")
    private String productName;
    @Schema(description = "当前库存数量")
    private Integer currentQuantity;
    @Schema(description = "累计订购数量")
    private Integer orderQuantityTotal;
    @Schema(description = "最近订购日期")
    private LocalDateTime orderDateLatest;
    @Schema(description = "记录创建时间")
    private LocalDateTime createTime;
    @Schema(description = "记录最后更新时间")
    private LocalDateTime updateTime;
    private Long createBy;
    private Long updateBy;
}

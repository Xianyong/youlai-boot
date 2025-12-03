package com.youlai.boot.repository.model.entity;

import lombok.Getter;
import lombok.Setter;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableName;
import com.youlai.boot.common.base.BaseEntity;

/**
 * 商品选购实体对象
 *
 * @author youlaitech
 * @since 2025-12-02 09:35
 */
@Getter
@Setter
@TableName("biz_repository")
public class BizRepository extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 部门ID，外键关联部门表
     */
    private Long departmentId;
    /**
     * 产品ID，外键关联产品表
     */
    private Long productId;
    /**
     * 当前库存数量
     */
    private Integer currentQuantity;
    /**
     * 累计订购数量
     */
    private Integer orderQuantityTotal;
    /**
     * 最近订购日期
     */
    private LocalDateTime orderDateLatest;
    private Long createBy;
    private Long updateBy;
}

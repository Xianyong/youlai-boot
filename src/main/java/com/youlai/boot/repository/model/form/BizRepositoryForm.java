package com.youlai.boot.repository.model.form;

import java.io.Serial;
import java.io.Serializable;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;
import java.time.LocalDateTime;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.*;

/**
 * 商品选购表单对象
 *
 * @author youlaitech
 * @since 2025-12-02 09:35
 */
@Getter
@Setter
@Schema(description = "商品选购表单对象")
public class BizRepositoryForm implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Schema(description = "关系记录唯一标识符")
//    @NotNull(message = "关系记录唯一标识符不能为空")
    private Long id;

    @Schema(description = "站点ID，外键关联站点表")
//    @NotNull(message = "站点ID，外键关联站点表不能为空")
    private Long departmentId;

    @Schema(description = "产品ID，外键关联产品表")
//    @NotNull(message = "产品ID，外键关联产品表不能为空")
    private Long productId;

    @Schema(description = "当前库存数量")
    @NotNull(message = "当前库存数量不能为空")
    private Integer currentQuantity;

    @Schema(description = "累计订购数量")
    private Integer orderQuantityTotal;

    @Schema(description = "最近订购日期")
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime orderDateLatest;

    @Schema(description = "记录创建时间")
//    @NotNull(message = "记录创建时间不能为空")
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime createTime;

    @Schema(description = "记录最后更新时间")
//    @NotNull(message = "记录最后更新时间不能为空")
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime updateTime;

    private Long createBy;

    private Long updateBy;


}

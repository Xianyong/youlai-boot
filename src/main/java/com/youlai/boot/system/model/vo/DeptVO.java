package com.youlai.boot.system.model.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import org.apache.poi.hpsf.Decimal;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Schema(description = "部门视图对象")
@Data
public class DeptVO {

    @Schema(description = "部门ID")
    private Long id;

    @Schema(description = "父部门ID")
    private Long parentId;

    @Schema(description = "部门名称")
    private String name;

    @Schema(description = "部门编号")
    private String code;

    @Schema(description = "排序")
    private Integer sort;

    @Schema(description = "状态(1:启用；0:禁用)")
    private Integer status;

    @Schema(description = "子部门")
    private List<DeptVO> children;

    @Schema(description = "创建时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm")
    private LocalDateTime createTime;

    @Schema(description = "修改时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm")
    private LocalDateTime updateTime;

    @Schema(description = "站点地址")
    private String dptAddress;

    @Schema(description = "站点类型")
    private Integer dptType;

    @Schema(description = "销售提成比例 0-100")
    private BigDecimal dptSaleRate;
}

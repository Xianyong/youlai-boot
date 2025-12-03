package com.youlai.boot.repository.model.query;

import com.youlai.boot.common.base.BasePageQuery;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;
import java.time.LocalDateTime;
import java.util.List;

/**
 * 商品选购分页查询对象
 *
 * @author youlaitech
 * @since 2025-12-02 09:35
 */
@Schema(description ="商品选购查询对象")
@Getter
@Setter
public class BizRepositoryQuery extends BasePageQuery {

    @Schema(description="关键字(商品名称)")
    private String keywords;

    @Schema(description="状态(1->正常；0->禁用)")
    private Integer status;

    @Schema(description = "关联站点ID")
    private List<Long> deptIds;
}

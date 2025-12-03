package com.youlai.boot.repository.controller;

import com.youlai.boot.repository.service.BizRepositoryService;
import com.youlai.boot.security.util.SecurityUtils;
import com.youlai.boot.system.model.query.DeptQuery;
import com.youlai.boot.system.model.vo.DeptVO;
import com.youlai.boot.system.service.DeptService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.youlai.boot.repository.model.form.BizRepositoryForm;
import com.youlai.boot.repository.model.query.BizRepositoryQuery;
import com.youlai.boot.repository.model.vo.BizRepositoryVO;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.youlai.boot.core.web.PageResult;
import com.youlai.boot.core.web.Result;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import jakarta.validation.Valid;

import java.util.ArrayList;
import java.util.List;

/**
 * 商品选购前端控制层
 *
 * @author youlaitech
 * @since 2025-12-02 09:35
 */
@Tag(name = "13. 商品选购接口")
@RestController
@RequestMapping("/api/v1/biz-repository")
@RequiredArgsConstructor
public class BizRepositoryController  {

    private final BizRepositoryService bizRepositoryService;
    private final DeptService deptService;

    @Operation(summary = "商品选购分页列表")
    @GetMapping("/page")
    @PreAuthorize("@ss.hasPerm('repository:biz-repository:query')")
    public PageResult<BizRepositoryVO> getBizRepositoryPage(BizRepositoryQuery queryParams ) {

        DeptQuery dptqueryParams = new DeptQuery();
        queryParams.setStatus(1);
        List<DeptVO> list = deptService.getMyDeptList(dptqueryParams);
        List<Long> deptIds = new ArrayList<>();
        for(DeptVO dpt : list){
            deptIds.add(dpt.getId());
            for(DeptVO dpt2 : dpt.getChildren()){
                deptIds.add(dpt2.getId());
            }
        }

        if(deptIds.toArray().length > 0) {
            queryParams.setDeptIds(deptIds);
            IPage<BizRepositoryVO> result = bizRepositoryService.getBizRepositoryPage(queryParams);
            return PageResult.success(result);
        }
        else{
            return PageResult.success(null);
        }
    }

    @Operation(summary = "新增商品选购")
    @PostMapping
    @PreAuthorize("@ss.hasPerm('repository:biz-repository:add')")
    public Result<Void> saveBizRepository(@RequestBody @Valid BizRepositoryForm formData ) {
        boolean result = bizRepositoryService.saveBizRepository(formData);
        return Result.judge(result);
    }

    @Operation(summary = "获取商品选购表单数据")
    @GetMapping("/{id}/form")
    @PreAuthorize("@ss.hasPerm('repository:biz-repository:edit')")
    public Result<BizRepositoryForm> getBizRepositoryForm(
        @Parameter(description = "商品选购ID") @PathVariable Long id
    ) {
        BizRepositoryForm formData = bizRepositoryService.getBizRepositoryFormData(id);
        return Result.success(formData);
    }

    @Operation(summary = "修改商品选购")
    @PutMapping(value = "/{id}")
    @PreAuthorize("@ss.hasPerm('repository:biz-repository:edit')")
    public Result<Void> updateBizRepository(
            @Parameter(description = "商品选购ID") @PathVariable Long id,
            @RequestBody @Validated BizRepositoryForm formData
    ) {
        boolean result = bizRepositoryService.updateBizRepository(id, formData);
        return Result.judge(result);
    }

    @Operation(summary = "删除商品选购")
    @DeleteMapping("/{ids}")
    @PreAuthorize("@ss.hasPerm('repository:biz-repository:delete')")
    public Result<Void> deleteBizRepositorys(
        @Parameter(description = "商品选购ID，多个以英文逗号(,)分割") @PathVariable String ids
    ) {
        boolean result = bizRepositoryService.deleteBizRepositorys(ids);
        return Result.judge(result);
    }
}

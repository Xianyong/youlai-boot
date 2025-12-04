package com.youlai.boot.orders.controller;

import com.youlai.boot.common.constant.SystemConstants;
import com.youlai.boot.orders.service.BizOrdersService;
import com.youlai.boot.system.model.dto.CurrentUserDTO;
import com.youlai.boot.system.model.query.DeptQuery;
import com.youlai.boot.system.model.vo.DeptVO;
import com.youlai.boot.system.service.DeptService;
import com.youlai.boot.system.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.youlai.boot.orders.model.form.BizOrdersForm;
import com.youlai.boot.orders.model.query.BizOrdersQuery;
import com.youlai.boot.orders.model.vo.BizOrdersVO;
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

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * 订单前端控制层
 *
 * @author youlaitech
 * @since 2025-12-02 19:33
 */
@Tag(name = "14. 订单接口")
@RestController
@RequestMapping("/api/v1/biz-orders")
@RequiredArgsConstructor
public class BizOrdersController  {

    private final BizOrdersService bizOrdersService;
    private final UserService userService;
    private final DeptService deptService;

    @Operation(summary = "订单分页列表")
    @GetMapping("/page")
    @PreAuthorize("@ss.hasPerm('orders:biz-orders:query')")
    public PageResult<BizOrdersVO> getBizOrdersPage(BizOrdersQuery queryParams ) {
        CurrentUserDTO currentUserDTO = userService.getCurrentUserInfo();
        if(currentUserDTO.getRoles().contains(SystemConstants.ADMIN_DEPT_STATION)){
            DeptQuery dptqueryParams = new DeptQuery();
            List<DeptVO> list = deptService.getMyDeptList(dptqueryParams);
            List<Long> deptIds = new ArrayList<>();
            for(DeptVO dpt : list){
                deptIds.add(dpt.getId());
                for(DeptVO dpt2 : dpt.getChildren()){
                    deptIds.add(dpt2.getId());
                }
            }
            if(deptIds.size() > 0)
                queryParams.setDeptIds(deptIds);
        }
        else{
            queryParams.setUserId(currentUserDTO.getUserId());
        }

        IPage<BizOrdersVO> result = bizOrdersService.getBizOrdersPage(queryParams);
        return PageResult.success(result);
    }

    @Operation(summary = "购物订单")
    @PostMapping(value="/buy")
    @PreAuthorize("@ss.hasPerm('repository:biz-repository:buy')")
    public Result<Void> buyBizOrders(@RequestBody @Valid BizOrdersForm formData ) {
        CurrentUserDTO currentUserDTO = userService.getCurrentUserInfo();
        formData.setUserId(currentUserDTO.getUserId());
        formData.setCreateBy(currentUserDTO.getUserId());
        formData.setOrderDate(LocalDateTime.now());
        boolean result = bizOrdersService.saveBizOrders(formData);
        return Result.judge(result);
    }

    @Operation(summary = "新增订单")
    @PostMapping
    @PreAuthorize("@ss.hasPerm('orders:biz-orders:add')")
    public Result<Void> saveBizOrders(@RequestBody @Valid BizOrdersForm formData ) {
        boolean result = bizOrdersService.saveBizOrders(formData);
        return Result.judge(result);
    }

    @Operation(summary = "获取订单表单数据")
    @GetMapping("/{id}/form")
    @PreAuthorize("@ss.hasPerm('orders:biz-orders:edit')")
    public Result<BizOrdersForm> getBizOrdersForm(
        @Parameter(description = "订单ID") @PathVariable Long id
    ) {
        BizOrdersForm formData = bizOrdersService.getBizOrdersFormData(id);
        return Result.success(formData);
    }

    @Operation(summary = "修改订单")
    @PutMapping(value = "/{id}")
    @PreAuthorize("@ss.hasPerm('orders:biz-orders:edit')")
    public Result<Void> updateBizOrders(
            @Parameter(description = "订单ID") @PathVariable Long id,
            @RequestBody @Validated BizOrdersForm formData
    ) {
        boolean result = bizOrdersService.updateBizOrders(id, formData);
        return Result.judge(result);
    }

    @Operation(summary = "删除订单")
    @DeleteMapping("/{ids}")
    @PreAuthorize("@ss.hasPerm('orders:biz-orders:delete')")
    public Result<Void> deleteBizOrderss(
        @Parameter(description = "订单ID，多个以英文逗号(,)分割") @PathVariable String ids
    ) {
        boolean result = bizOrdersService.deleteBizOrderss(ids);
        return Result.judge(result);
    }
}

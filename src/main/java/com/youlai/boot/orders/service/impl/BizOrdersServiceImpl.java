package com.youlai.boot.orders.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.youlai.boot.orders.mapper.BizOrdersMapper;
import com.youlai.boot.orders.service.BizOrdersService;
import com.youlai.boot.orders.model.entity.BizOrders;
import com.youlai.boot.orders.model.form.BizOrdersForm;
import com.youlai.boot.orders.model.query.BizOrdersQuery;
import com.youlai.boot.orders.model.vo.BizOrdersVO;
import com.youlai.boot.orders.converter.BizOrdersConverter;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import cn.hutool.core.lang.Assert;
import cn.hutool.core.util.StrUtil;

/**
 * 订单服务实现类
 *
 * @author youlaitech
 * @since 2025-12-02 19:33
 */
@Service
@RequiredArgsConstructor
public class BizOrdersServiceImpl extends ServiceImpl<BizOrdersMapper, BizOrders> implements BizOrdersService {

    private final BizOrdersConverter bizOrdersConverter;

    /**
    * 获取订单分页列表
    *
    * @param queryParams 查询参数
    * @return {@link IPage<BizOrdersVO>} 订单分页列表
    */
    @Override
    public IPage<BizOrdersVO> getBizOrdersPage(BizOrdersQuery queryParams) {
        Page<BizOrdersVO> pageVO = this.baseMapper.getBizOrdersPage(
                new Page<>(queryParams.getPageNum(), queryParams.getPageSize()),
                queryParams
        );
        return pageVO;
    }
    
    /**
     * 获取订单表单数据
     *
     * @param id 订单ID
     * @return 订单表单数据
     */
    @Override
    public BizOrdersForm getBizOrdersFormData(Long id) {
        BizOrders entity = this.getById(id);
        return bizOrdersConverter.toForm(entity);
    }
    
    /**
     * 新增订单
     *
     * @param formData 订单表单对象
     * @return 是否新增成功
     */
    @Override
    public boolean saveBizOrders(BizOrdersForm formData) {
        BizOrders entity = bizOrdersConverter.toEntity(formData);
        return this.save(entity);
    }
    
    /**
     * 更新订单
     *
     * @param id   订单ID
     * @param formData 订单表单对象
     * @return 是否修改成功
     */
    @Override
    public boolean updateBizOrders(Long id,BizOrdersForm formData) {
        BizOrders entity = bizOrdersConverter.toEntity(formData);
        return this.updateById(entity);
    }
    
    /**
     * 删除订单
     *
     * @param ids 订单ID，多个以英文逗号(,)分割
     * @return 是否删除成功
     */
    @Override
    public boolean deleteBizOrderss(String ids) {
        Assert.isTrue(StrUtil.isNotBlank(ids), "删除的订单数据为空");
        // 逻辑删除
        List<Long> idList = Arrays.stream(ids.split(","))
                .map(Long::parseLong)
                .toList();
        return this.removeByIds(idList);
    }

}

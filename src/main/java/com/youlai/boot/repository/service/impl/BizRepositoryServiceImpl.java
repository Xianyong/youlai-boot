package com.youlai.boot.repository.service.impl;

import com.youlai.boot.system.model.vo.DeptVO;
import com.youlai.boot.system.service.DeptService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.youlai.boot.repository.mapper.BizRepositoryMapper;
import com.youlai.boot.repository.service.BizRepositoryService;
import com.youlai.boot.repository.model.entity.BizRepository;
import com.youlai.boot.repository.model.form.BizRepositoryForm;
import com.youlai.boot.repository.model.query.BizRepositoryQuery;
import com.youlai.boot.repository.model.vo.BizRepositoryVO;
import com.youlai.boot.repository.converter.BizRepositoryConverter;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import cn.hutool.core.lang.Assert;
import cn.hutool.core.util.StrUtil;

/**
 * 商品选购服务实现类
 *
 * @author youlaitech
 * @since 2025-12-02 09:35
 */
@Service
@RequiredArgsConstructor
public class BizRepositoryServiceImpl extends ServiceImpl<BizRepositoryMapper, BizRepository> implements BizRepositoryService {

    private final BizRepositoryConverter bizRepositoryConverter;

    /**
    * 获取商品选购分页列表
    *
    * @param queryParams 查询参数
    * @return {@link IPage<BizRepositoryVO>} 商品选购分页列表
    */
    @Override
    public IPage<BizRepositoryVO> getBizRepositoryPage(BizRepositoryQuery queryParams) {
//        DeptService deptService = SpringUtils.getBean(DeptService.class);

        Page<BizRepositoryVO> pageVO = this.baseMapper.getBizRepositoryPage(
                new Page<>(queryParams.getPageNum(), queryParams.getPageSize()),
                queryParams
        );
        return pageVO;
    }
    
    /**
     * 获取商品选购表单数据
     *
     * @param id 商品选购ID
     * @return 商品选购表单数据
     */
    @Override
    public BizRepositoryForm getBizRepositoryFormData(Long id) {
        BizRepository entity = this.getById(id);
        return bizRepositoryConverter.toForm(entity);
    }
    
    /**
     * 新增商品选购
     *
     * @param formData 商品选购表单对象
     * @return 是否新增成功
     */
    @Override
    public boolean saveBizRepository(BizRepositoryForm formData) {
        BizRepository entity = bizRepositoryConverter.toEntity(formData);
        return this.save(entity);
    }
    
    /**
     * 更新商品选购
     *
     * @param id   商品选购ID
     * @param formData 商品选购表单对象
     * @return 是否修改成功
     */
    @Override
    public boolean updateBizRepository(Long id,BizRepositoryForm formData) {
        BizRepository entity = bizRepositoryConverter.toEntity(formData);
        return this.updateById(entity);
    }
    
    /**
     * 删除商品选购
     *
     * @param ids 商品选购ID，多个以英文逗号(,)分割
     * @return 是否删除成功
     */
    @Override
    public boolean deleteBizRepositorys(String ids) {
        Assert.isTrue(StrUtil.isNotBlank(ids), "删除的商品选购数据为空");
        // 逻辑删除
        List<Long> idList = Arrays.stream(ids.split(","))
                .map(Long::parseLong)
                .toList();
        return this.removeByIds(idList);
    }

}

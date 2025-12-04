package com.youlai.boot.repository.service;

import com.youlai.boot.repository.model.entity.BizRepository;
import com.youlai.boot.repository.model.form.BizRepositoryForm;
import com.youlai.boot.repository.model.query.BizRepositoryQuery;
import com.youlai.boot.repository.model.vo.BizRepositoryVO;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * 商品选购服务类
 *
 * @author youlaitech
 * @since 2025-12-02 09:35
 */
public interface BizRepositoryService extends IService<BizRepository> {

    /**
     *商品选购分页列表
     *
     * @return {@link IPage<BizRepositoryVO>} 商品选购分页列表
     */
    IPage<BizRepositoryVO> getBizRepositoryPage(BizRepositoryQuery queryParams);

    /**
     * 获取商品选购表单数据
     *
     * @param id 商品选购ID
     * @return 商品选购表单数据
     */
     BizRepositoryForm getBizRepositoryFormData(Long id);

    /**
     * 新增商品选购
     *
     * @param formData 商品选购表单对象
     * @return 是否新增成功
     */
    boolean saveBizRepository(BizRepositoryForm formData);

    /**
     * 修改商品选购
     *
     * @param id   商品选购ID
     * @param formData 商品选购表单对象
     * @return 是否修改成功
     */
    boolean updateBizRepository(Long id, BizRepositoryForm formData);

    /**
     * 删除商品选购
     *
     * @param ids 商品选购ID，多个以英文逗号(,)分割
     * @return 是否删除成功
     */
    boolean deleteBizRepositorys(String ids);

    /**
     * 根据产品ID和部门ID获取记录
     */
    BizRepositoryForm getByProductAndDept(Long productId, Long departmentId);

}

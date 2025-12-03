package com.youlai.boot.repository.converter;

import org.mapstruct.Mapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.youlai.boot.repository.model.entity.BizRepository;
import com.youlai.boot.repository.model.form.BizRepositoryForm;

/**
 * 商品选购对象转换器
 *
 * @author youlaitech
 * @since 2025-12-02 09:35
 */
@Mapper(componentModel = "spring")
public interface BizRepositoryConverter{

    BizRepositoryForm toForm(BizRepository entity);

    BizRepository toEntity(BizRepositoryForm formData);
}
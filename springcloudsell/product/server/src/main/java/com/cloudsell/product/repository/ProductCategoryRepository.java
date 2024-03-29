package com.cloudsell.product.repository;

import com.cloudsell.product.dataobject.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author Trump
 * @date 2018/10/15 9:48
 */
public interface ProductCategoryRepository extends JpaRepository<ProductCategory,Integer> {
    /**
     * 根据类目编号查找商品类目
     * @param categoryTypes
     * @return
     */
    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypes);
}

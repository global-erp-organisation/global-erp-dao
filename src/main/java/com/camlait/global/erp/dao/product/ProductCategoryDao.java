package com.camlait.global.erp.dao.product;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.camlait.global.erp.domain.product.ProductCategory;

@Repository
public interface ProductCategoryDao extends JpaRepository<ProductCategory, String> {

    @Query(value = "from ProductCategory c where(c.codeCategorieProduit like %?1%)or (c.descriptionCategorie like %?1%)")
    Page<ProductCategory> retriveProductCategories(String keyWord, Pageable p);
}

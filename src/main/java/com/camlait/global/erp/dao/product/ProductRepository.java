package com.camlait.global.erp.dao.product;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.camlait.global.erp.domain.product.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, String> {
    @Query(value = "from Product p where (p.productCode like %?1%) or (p.productDescription like %?1%) or p.category.categoryDescription like %?1%")
    Page<Product> retriveProducts(String keyWord, Pageable p);
}

package com.camlait.global.erp.dao.product;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.camlait.global.erp.domain.product.Product;

@Repository
public interface ProductDao extends JpaRepository<Product, String> {
    @Query(value = "from Product p where (p.codeProduit like %?1%) or (p.descriptionProduit like %?1%) or p.categorie.descriptionCategorie like %?1%")
    Page<Product> retriveProducts(String keyWord, Pageable p);
}

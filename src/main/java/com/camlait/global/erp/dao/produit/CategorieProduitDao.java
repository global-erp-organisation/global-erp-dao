package com.camlait.global.erp.dao.produit;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.camlait.global.erp.domain.produit.CategorieProduit;

@Repository
public interface CategorieProduitDao extends JpaRepository<CategorieProduit, String> {

    @Query(value = "from CategorieProduit c where(c.codeCategorieProduit like %?1%)or (c.descriptionCategorie like %?1%)")
    Page<CategorieProduit> retriveProductCategories(String keyWord, Pageable p);
}

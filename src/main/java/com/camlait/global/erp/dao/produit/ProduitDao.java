package com.camlait.global.erp.dao.produit;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.camlait.global.erp.domain.produit.Produit;

@Repository
public interface ProduitDao extends JpaRepository<Produit, String> {
    @Query(value = "from Produit p where (p.codeProduit like %?1%) or (p.descriptionProduit like %?1%) or p.categorie.descriptionCategorie like %?1%")
    Page<Produit> retriveProducts(String keyWord, Pageable p);
}

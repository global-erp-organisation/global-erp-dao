package com.camlait.global.erp.dao.produit;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.camlait.global.erp.domain.produit.CategorieProduit;

@Repository
public interface CategorieProduitDao extends JpaRepository<CategorieProduit, Long> {

}

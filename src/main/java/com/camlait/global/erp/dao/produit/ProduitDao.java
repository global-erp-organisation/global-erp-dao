package com.camlait.global.erp.dao.produit;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.camlait.global.erp.domain.produit.Produit;

@Repository
public interface ProduitDao extends JpaRepository<Produit, Long> {

}

package com.camlait.global.erp.dao.produit;

import org.springframework.data.jpa.repository.JpaRepository;

import com.camlait.global.erp.domain.produit.ProduitTaxe;

public interface ProduitTaxeDao extends JpaRepository<ProduitTaxe, String> {

}

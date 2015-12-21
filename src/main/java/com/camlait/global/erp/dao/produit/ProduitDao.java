package com.camlait.global.erp.dao.produit;

import org.springframework.data.repository.CrudRepository;

import com.camlait.global.erp.domain.produit.Produit;

public interface ProduitDao extends CrudRepository<Produit, Long> {

}

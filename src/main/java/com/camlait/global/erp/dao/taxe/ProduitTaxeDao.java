package com.camlait.global.erp.dao.taxe;

import org.springframework.data.repository.CrudRepository;

import com.camlait.global.erp.domain.pk.PKProduitTaxe;
import com.camlait.global.erp.domain.taxe.ProduitTaxe;

public interface ProduitTaxeDao extends CrudRepository<ProduitTaxe, PKProduitTaxe> {

}

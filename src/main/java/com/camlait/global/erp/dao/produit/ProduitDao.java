package com.camlait.global.erp.dao.produit;

import java.util.Collection;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.camlait.global.erp.domain.produit.Produit;

@Repository
public interface ProduitDao extends JpaRepository<Produit, Long> {

	@Query(value = "from Produit p where p.categorie.categorieProduitId=?1")
	Collection<Produit> listerProduit(Long categorieId, Pageable p);
}

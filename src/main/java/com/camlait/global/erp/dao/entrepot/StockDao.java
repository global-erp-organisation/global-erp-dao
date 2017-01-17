package com.camlait.global.erp.dao.entrepot;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.camlait.global.erp.domain.inventaire.Stock;

public interface StockDao extends JpaRepository<Stock, String> {

	@Query(value = "From Stock s where s.magasin.magasinId=?1 and s.produit.produitId=?2")
	Stock obtenirStock(Long magasinId, Long produitId);

	@Query(value = "From Stock s where s.produit.produitId=?1")
	Collection<Stock> listerStockParProduit(Long produitId);

	@Query(value = "From Stock s where s.magasin.magasinId=?1")
	Collection<Stock> listerStockParMagasin(Long magasinId);
}

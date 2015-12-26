package com.camlait.global.erp.dao.entrepot;

import org.springframework.data.jpa.repository.JpaRepository;

import com.camlait.global.erp.domain.inventaire.Stock;

public interface StockDao extends JpaRepository<Stock, Long> {

}

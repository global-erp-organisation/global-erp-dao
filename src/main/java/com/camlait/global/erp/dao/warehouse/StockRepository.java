package com.camlait.global.erp.dao.warehouse;

import org.springframework.data.jpa.repository.JpaRepository;

import com.camlait.global.erp.domain.inventory.Stock;

public interface StockRepository extends JpaRepository<Stock, String> {
}

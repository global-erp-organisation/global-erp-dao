package com.camlait.global.erp.dao.warehouse;

import org.springframework.data.jpa.repository.JpaRepository;

import com.camlait.global.erp.domain.inventory.StockCard;
import com.camlait.global.erp.domain.keys.StockCardKey;

public interface StockCardRepository extends JpaRepository<StockCard, StockCardKey> {

}

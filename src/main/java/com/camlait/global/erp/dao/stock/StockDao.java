package com.camlait.global.erp.dao.stock;

import org.springframework.data.repository.CrudRepository;

import com.camlait.global.erp.domain.pk.PKStock;
import com.camlait.global.erp.domain.stock.Stock;

public interface StockDao extends CrudRepository<Stock, PKStock> {

}

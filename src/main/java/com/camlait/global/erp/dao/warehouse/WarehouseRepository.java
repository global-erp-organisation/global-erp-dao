package com.camlait.global.erp.dao.warehouse;

import org.springframework.data.jpa.repository.JpaRepository;

import com.camlait.global.erp.domain.warehouse.Warehouse;

public interface WarehouseRepository extends JpaRepository<Warehouse, String> {
}

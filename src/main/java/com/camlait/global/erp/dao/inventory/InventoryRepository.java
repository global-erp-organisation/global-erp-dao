package com.camlait.global.erp.dao.inventory;

import org.springframework.data.jpa.repository.JpaRepository;

import com.camlait.global.erp.domain.inventory.Inventory;

public interface InventoryRepository extends JpaRepository<Inventory, String> {

}

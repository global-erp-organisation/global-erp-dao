package com.camlait.global.erp.dao.inventory;

import org.springframework.data.jpa.repository.JpaRepository;

import com.camlait.global.erp.domain.inventory.InventoryDetail;

public interface InventoryDetailRepository extends JpaRepository<InventoryDetail, String> {

}

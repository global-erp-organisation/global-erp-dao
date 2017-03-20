package com.camlait.global.erp.dao.warehouse;

import org.springframework.data.jpa.repository.JpaRepository;

import com.camlait.global.erp.domain.warehouse.Store;

public interface StoreRepository extends JpaRepository<Store, String> {    
}

package com.camlait.global.erp.dao.prix;

import org.springframework.data.jpa.repository.JpaRepository;

import com.camlait.global.erp.domain.prix.RegularUnitPrice;

public interface RegularUnitPriceDao extends JpaRepository<RegularUnitPrice, String> {

}

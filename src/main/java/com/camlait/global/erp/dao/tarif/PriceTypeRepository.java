package com.camlait.global.erp.dao.tarif;

import org.springframework.data.jpa.repository.JpaRepository;

import com.camlait.global.erp.domain.tarif.PriceType;

public interface PriceTypeRepository extends JpaRepository<PriceType, String> {

}

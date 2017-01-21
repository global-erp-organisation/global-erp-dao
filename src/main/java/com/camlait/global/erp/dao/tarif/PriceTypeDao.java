package com.camlait.global.erp.dao.tarif;

import org.springframework.data.jpa.repository.JpaRepository;

import com.camlait.global.erp.domain.tarif.PriceType;

public interface PriceTypeDao extends JpaRepository<PriceType, String> {

}

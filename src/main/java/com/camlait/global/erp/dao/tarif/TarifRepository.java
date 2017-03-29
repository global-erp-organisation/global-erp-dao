package com.camlait.global.erp.dao.tarif;

import org.springframework.data.jpa.repository.JpaRepository;

import com.camlait.global.erp.domain.tarif.Tariff;

public interface TarifRepository extends JpaRepository<Tariff, String> {

}

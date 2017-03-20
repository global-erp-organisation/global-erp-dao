package com.camlait.global.erp.dao.tarif;

import org.springframework.data.jpa.repository.JpaRepository;

import com.camlait.global.erp.domain.tarif.Tarif;

public interface TarifRepository extends JpaRepository<Tarif, String> {

}

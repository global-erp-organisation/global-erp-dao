package com.camlait.global.erp.dao.taxe;

import org.springframework.data.jpa.repository.JpaRepository;

import com.camlait.global.erp.domain.taxe.Taxe;

public interface TaxeDao extends JpaRepository<Taxe, Long> {

}

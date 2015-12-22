package com.camlait.global.erp.dao.operation.manquant;

import org.springframework.data.jpa.repository.JpaRepository;

import com.camlait.global.erp.domain.operation.manquant.ManquantFinancier;

public interface ManquantFinancierDao extends JpaRepository<ManquantFinancier, Long> {

}

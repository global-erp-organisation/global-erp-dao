package com.camlait.global.erp.dao.document.comerciaux;

import org.springframework.data.jpa.repository.JpaRepository;

import com.camlait.global.erp.domain.document.commerciaux.Taxe;

public interface TaxeDao extends JpaRepository<Taxe, String> {

}

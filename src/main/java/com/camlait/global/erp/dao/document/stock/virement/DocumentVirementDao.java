package com.camlait.global.erp.dao.document.stock.virement;

import org.springframework.data.jpa.repository.JpaRepository;

import com.camlait.global.erp.domain.document.stock.virement.DocumentVirement;

public interface DocumentVirementDao extends JpaRepository<DocumentVirement, Long> {

}

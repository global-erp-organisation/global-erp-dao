package com.camlait.global.erp.dao.document.stock.virement;

import org.springframework.data.jpa.repository.JpaRepository;

import com.camlait.global.erp.domain.document.stock.transfert.DocumentTransfert;

public interface DocumentVirementDao extends JpaRepository<DocumentTransfert, Long> {

}

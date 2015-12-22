package com.camlait.global.erp.dao.document.vente;

import org.springframework.data.jpa.repository.JpaRepository;

import com.camlait.global.erp.domain.document.vente.FactureClient;

public interface FactureClientDao extends JpaRepository<FactureClient, Long> {

}

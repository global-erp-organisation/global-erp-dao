package com.camlait.global.erp.dao.document.commerciaux.vente;

import org.springframework.data.jpa.repository.JpaRepository;

import com.camlait.global.erp.domain.document.commerciaux.vente.FactureClient;

public interface FactureClientDao extends JpaRepository<FactureClient, Long> {

}

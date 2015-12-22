package com.camlait.global.erp.dao.inventaire;

import org.springframework.data.jpa.repository.JpaRepository;

import com.camlait.global.erp.domain.inventaire.Inventaire;

public interface InventaireDao extends JpaRepository<Inventaire, Long> {

}

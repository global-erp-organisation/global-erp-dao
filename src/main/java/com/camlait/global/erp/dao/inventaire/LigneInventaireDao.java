package com.camlait.global.erp.dao.inventaire;

import org.springframework.data.jpa.repository.JpaRepository;

import com.camlait.global.erp.domain.inventaire.LigneInventaire;

public interface LigneInventaireDao extends JpaRepository<LigneInventaire, Long> {

}

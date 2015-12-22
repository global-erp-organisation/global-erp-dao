package com.camlait.global.erp.dao.inventaire;

import org.springframework.data.jpa.repository.JpaRepository;

import com.camlait.global.erp.domain.inventaire.LigneInventaire;
import com.camlait.global.erp.domain.pk.PKLigneInventaire;

public interface LigneInventaireDao extends JpaRepository<LigneInventaire, PKLigneInventaire> {

}

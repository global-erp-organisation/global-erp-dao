package com.camlait.global.erp.dao.inventaire;

import org.springframework.data.repository.CrudRepository;

import com.camlait.global.erp.domain.inventaire.LigneInventaire;
import com.camlait.global.erp.domain.pk.PKLigneInventaire;

public interface LigneInventaireDao extends CrudRepository<LigneInventaire, PKLigneInventaire> {

}

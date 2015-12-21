package com.camlait.global.erp.dao.inventaire;

import org.springframework.data.repository.CrudRepository;

import com.camlait.global.erp.domain.inventaire.Inventaire;

public interface InventaireDao extends CrudRepository<Inventaire, Long> {

}

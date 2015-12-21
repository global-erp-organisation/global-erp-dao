package com.camlait.global.erp.dao.operation.caisse;

import org.springframework.data.repository.CrudRepository;

import com.camlait.global.erp.domain.operation.caisse.Versement;

public interface VersementDao extends CrudRepository<Versement, Long> {

}

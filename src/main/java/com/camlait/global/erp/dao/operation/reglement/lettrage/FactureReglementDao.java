package com.camlait.global.erp.dao.operation.reglement.lettrage;

import org.springframework.data.repository.CrudRepository;

import com.camlait.global.erp.domain.operation.reglement.lettrage.FactureReglement;
import com.camlait.global.erp.domain.pk.PKFactureReglement;

public interface FactureReglementDao extends CrudRepository<FactureReglement, PKFactureReglement> {

}

package com.camlait.global.erp.dao.operation.reglement.lettrage;

import org.springframework.data.jpa.repository.JpaRepository;


import com.camlait.global.erp.domain.operation.reglement.lettrage.FactureReglement;
import com.camlait.global.erp.domain.pk.PKFactureReglement;

public interface FactureReglementDao extends JpaRepository<FactureReglement, PKFactureReglement> {

}

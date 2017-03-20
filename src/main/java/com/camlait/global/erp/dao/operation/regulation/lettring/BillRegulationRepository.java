package com.camlait.global.erp.dao.operation.regulation.lettring;

import org.springframework.data.jpa.repository.JpaRepository;

import com.camlait.global.erp.domain.keys.BillRegulationKey;
import com.camlait.global.erp.domain.operation.regulation.lettering.BillRegulation;

public interface BillRegulationRepository extends JpaRepository<BillRegulation, BillRegulationKey> {

}

package com.camlait.global.erp.dao.immobilisation;

import org.springframework.data.jpa.repository.JpaRepository;

import com.camlait.global.erp.domain.immobilisation.PartenaireImmobilisation;
import com.camlait.global.erp.domain.pk.PKPartenaireImmobilisation;

public interface PartenaireImmobilisationDao extends JpaRepository<PartenaireImmobilisation, PKPartenaireImmobilisation> {

}

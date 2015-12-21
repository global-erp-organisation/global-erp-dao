package com.camlait.global.erp.dao.immobilisation;

import org.springframework.data.repository.CrudRepository;

import com.camlait.global.erp.domain.immobilisation.PartenaireImmobilisation;
import com.camlait.global.erp.domain.pk.PKPartenaireImmobilisation;

public interface PartenaireImmobilisationDao extends CrudRepository<PartenaireImmobilisation, PKPartenaireImmobilisation> {

}

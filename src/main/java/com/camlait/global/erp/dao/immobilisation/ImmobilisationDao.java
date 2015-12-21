package com.camlait.global.erp.dao.immobilisation;

import org.springframework.data.repository.CrudRepository;

import com.camlait.global.erp.domain.immobilisation.Immobilisation;

public interface ImmobilisationDao extends CrudRepository<Immobilisation, Long> {

}

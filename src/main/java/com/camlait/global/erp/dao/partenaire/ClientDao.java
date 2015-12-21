package com.camlait.global.erp.dao.partenaire;

import org.springframework.data.repository.CrudRepository;

import com.camlait.global.erp.domain.partenaire.Client;

public interface ClientDao extends CrudRepository<Client, Long> {

}

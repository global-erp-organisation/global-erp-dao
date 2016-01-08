package com.camlait.global.erp.dao.partenaire;

import org.springframework.data.jpa.repository.JpaRepository;

import com.camlait.global.erp.domain.partenaire.Client;

public interface ClientDao extends JpaRepository<Client, Long> {

}

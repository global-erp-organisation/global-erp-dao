package com.camlait.global.erp.dao.auth;

import org.springframework.data.repository.CrudRepository;

import com.camlait.global.erp.domain.auth.Utilisateur;

public interface UtilisateurDao extends CrudRepository<Utilisateur, String> {

}

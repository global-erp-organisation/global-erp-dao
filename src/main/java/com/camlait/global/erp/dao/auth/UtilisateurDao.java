package com.camlait.global.erp.dao.auth;

import org.springframework.data.jpa.repository.JpaRepository;

import com.camlait.global.erp.domain.auth.Utilisateur;

public interface UtilisateurDao extends JpaRepository<Utilisateur, String> {

}

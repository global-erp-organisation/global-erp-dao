package com.camlait.global.erp.dao.auth;

import org.springframework.data.jpa.repository.JpaRepository;

import com.camlait.global.erp.domain.auth.user.RessourceUtilisateur;

public interface RessourceUtilisateurDao extends JpaRepository<RessourceUtilisateur, String> {

}

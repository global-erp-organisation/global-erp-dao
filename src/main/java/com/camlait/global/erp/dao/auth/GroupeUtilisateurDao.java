package com.camlait.global.erp.dao.auth;

import org.springframework.data.jpa.repository.JpaRepository;

import com.camlait.global.erp.domain.auth.GroupeUtilisateur;

public interface GroupeUtilisateurDao extends JpaRepository<GroupeUtilisateur, String> {

}

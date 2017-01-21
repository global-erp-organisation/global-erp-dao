package com.camlait.global.erp.dao.auth;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.camlait.global.erp.domain.auth.Utilisateur;

public interface UtilisateurDao extends JpaRepository<Utilisateur, String> {

	Page<Utilisateur> findUtilisateurByCourriel(String courriel,Pageable p);

	@Query(value = "from Utilisateur u where u.codeUtilisateur like %?1% or u.courriel like %?1%")
	Page<Utilisateur> listerUtilisateur(String motCle, Pageable p);

}

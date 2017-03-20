package com.camlait.global.erp.dao.auth;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.camlait.global.erp.domain.auth.User;

public interface UserRepository extends JpaRepository<User, String> {

	Page<User> findUtilisateurByCourriel(String courriel, Pageable p);
}

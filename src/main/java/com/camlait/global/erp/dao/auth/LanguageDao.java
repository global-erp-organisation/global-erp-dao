package com.camlait.global.erp.dao.auth;

import org.springframework.data.jpa.repository.JpaRepository;

import com.camlait.global.erp.domain.auth.ressource.Langue;

public interface LanguageDao extends JpaRepository<Langue, String> {

	Langue findByCodeLangue(String codeLangue);
}

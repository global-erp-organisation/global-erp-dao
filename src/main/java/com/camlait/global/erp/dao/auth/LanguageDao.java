package com.camlait.global.erp.dao.auth;

import org.springframework.data.jpa.repository.JpaRepository;

import com.camlait.global.erp.domain.auth.Langue;

public interface LanguageDao extends JpaRepository<Langue, Long> {

	Langue findByCodeLangue(String codeLangue);
}
package com.camlait.global.erp.dao.auth;

import org.springframework.data.jpa.repository.JpaRepository;

import com.camlait.global.erp.domain.keys.TermLanguageKey;
import com.camlait.global.erp.domain.translation.TermLanguage;

public interface TermLanguageRepository extends JpaRepository<TermLanguage, TermLanguageKey> {

}

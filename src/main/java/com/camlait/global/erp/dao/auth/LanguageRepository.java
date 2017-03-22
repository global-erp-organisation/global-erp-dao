package com.camlait.global.erp.dao.auth;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.camlait.global.erp.domain.translation.Language;

public interface LanguageRepository extends JpaRepository<Language, String> {

    Language findByCodeLangue(String codeLangue);

    @Query(value = "from Language l where l.langId like %?1% or l.codeLangue like %?1% or l.title like %?1% or l.alt like %?1%")
    Page<Language> retrieveLanguages(String keyWord, Pageable p);
}

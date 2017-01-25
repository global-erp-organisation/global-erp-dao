package com.camlait.global.erp.dao.auth;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.camlait.global.erp.domain.traduction.Langue;

public interface LanguageDao extends JpaRepository<Langue, String> {

    Langue findByCodeLangue(String codeLangue);

    @Query(value = "from Langue l where l.langId like %?1% or l.codeLangue like %?1% or l.title like %?1% or l.alt like %?1%")
    Page<Langue> RetrieveLanguages(String keyWord, Pageable p);
}

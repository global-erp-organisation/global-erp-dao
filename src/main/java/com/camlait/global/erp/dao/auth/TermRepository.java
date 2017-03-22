package com.camlait.global.erp.dao.auth;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.camlait.global.erp.domain.translation.Term;

public interface TermRepository extends JpaRepository<Term, String> {
    @Query(value = "from Term t where t.termeId like %?1% or t.descriptionTerme like %?1%")
    Page<Term> retrieveTerms(String keyWord, Pageable p);
}

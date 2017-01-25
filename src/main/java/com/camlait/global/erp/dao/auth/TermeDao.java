package com.camlait.global.erp.dao.auth;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.camlait.global.erp.domain.traduction.Terme;

public interface TermeDao extends JpaRepository<Terme, String> {

    Terme findByDescriptionTerme(String descriptionTerme);

    @Query(value = "from Terme t where t.termeId like %?1% or t.descriptionTerme like %?1%")
    Page<Terme> RetrieveTerms(String keyWord, Pageable p);
}

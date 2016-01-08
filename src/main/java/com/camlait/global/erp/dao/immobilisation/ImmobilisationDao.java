package com.camlait.global.erp.dao.immobilisation;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.camlait.global.erp.domain.immobilisation.Immobilisation;

public interface ImmobilisationDao extends JpaRepository<Immobilisation, Long> {
    
    Page<Immobilisation> findByCodeImmo(String codeImmo, Pageable p);
}

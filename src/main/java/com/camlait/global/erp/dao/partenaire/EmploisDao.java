package com.camlait.global.erp.dao.partenaire;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.camlait.global.erp.domain.partenaire.Emplois;

public interface EmploisDao extends JpaRepository<Emplois, Long> {
    
    Page<Emplois> findByCodeEmplois(String codeEmplois, Pageable p);
}

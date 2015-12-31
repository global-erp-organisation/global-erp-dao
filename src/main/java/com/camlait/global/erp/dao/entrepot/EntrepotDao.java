package com.camlait.global.erp.dao.entrepot;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.camlait.global.erp.domain.entrepot.Entrepot;

public interface EntrepotDao extends JpaRepository<Entrepot, Long> {
    
    @Query(value = "select e from Entrepot e order by e.codeEntrepot")
    Page<Entrepot> obtenirDernierEntrepot(Pageable p);
    
    Page<Entrepot> findByCodeEntrepot(String codeEntrepot,Pageable p);
    Entrepot findByCodeEntrepot(String codeEntrepot);
}

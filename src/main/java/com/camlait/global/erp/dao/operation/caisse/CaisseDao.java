package com.camlait.global.erp.dao.operation.caisse;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.camlait.global.erp.domain.operation.caisse.Caisse;

public interface CaisseDao extends JpaRepository<Caisse, Long> {
    
    Page<Caisse> findByCodeCaisse(String codeCaisse,Pageable p);
}

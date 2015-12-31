package com.camlait.global.erp.dao.partenaire;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.camlait.global.erp.domain.enumeration.EnumTypeEntite;
import com.camlait.global.erp.domain.partenaire.Partenaire;

public interface PartenaireDao extends JpaRepository<Partenaire, Long> {
    
    @Query(value = "select p from Partenaire p where p.typePartenaire=?1 order by p.codePartenaire desc")
    Page<Partenaire> obtenirDernierPartenaire(EnumTypeEntite type, Pageable p);
    
    Page<Partenaire> findByCodePartenaire(String codePartenaire,Pageable p);
}

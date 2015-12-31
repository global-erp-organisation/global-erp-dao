package com.camlait.global.erp.dao.organisation;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.camlait.global.erp.domain.enumeration.EnumTypeEntite;
import com.camlait.global.erp.domain.organisation.Localisation;

public interface LocalisationDao extends JpaRepository<Localisation, Long> {
    
    @Query(value = "Select l From Localisation l where l.typeLocal=?1 order by l.code desc")
    Page<Localisation> obtenirDernierLocal(EnumTypeEntite type,Pageable p);
    
    Page<Localisation> findByCode(String code,Pageable p);
}

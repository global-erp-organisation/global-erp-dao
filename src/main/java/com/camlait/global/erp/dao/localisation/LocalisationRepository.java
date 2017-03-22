package com.camlait.global.erp.dao.localisation;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.camlait.global.erp.domain.enumeration.EnumTypeEntitity;
import com.camlait.global.erp.domain.localisation.Localisation;

public interface LocalisationRepository extends JpaRepository<Localisation, String>{
    
    @Query(value = "Select l From Localisation l where l.typeLocal=?1 order by l.code desc")
    Page<Localisation> obtenirDernierLocal(EnumTypeEntitity type,Pageable p);
    
    Page<Localisation> findByCode(String code,Pageable p);
}

package com.camlait.global.erp.dao.localisation;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.camlait.global.erp.domain.enumeration.EnumTypeEntitity;
import com.camlait.global.erp.domain.localization.Localization;

public interface LocalisationRepository extends JpaRepository<Localization, String>{
    
    @Query(value = "Select l From Localization l where l.typeLocal=?1 order by l.code desc")
    Page<Localization> obtenirDernierLocal(EnumTypeEntitity type,Pageable p);
    
    Page<Localization> findByCode(String code,Pageable p);
}

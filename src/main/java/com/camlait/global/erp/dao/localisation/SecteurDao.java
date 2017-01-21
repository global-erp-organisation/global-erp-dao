package com.camlait.global.erp.dao.localisation;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.camlait.global.erp.domain.localisation.Secteur;

public interface SecteurDao extends JpaRepository<Secteur, String> {

    @Query(value = "From Secteur s where s.region.localId=?1")
    Collection<Secteur> listerSecteur(Long regionId);       
}

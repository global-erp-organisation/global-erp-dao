package com.camlait.global.erp.dao.localisation;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.camlait.global.erp.domain.localisation.Region;

public interface RegionDao extends JpaRepository<Region, String> {
    
    @Query(value = "From Region r where r.centre.localId=?1")
    Collection<Region> listerRegion(Long localId);    
}

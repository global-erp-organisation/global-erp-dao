package com.camlait.global.erp.dao.organisation;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.camlait.global.erp.domain.organisation.Region;

public interface RegionDao extends JpaRepository<Region, Long> {
    
    @Query(value = "From Region r where r.centre.localId=?1")
    Collection<Region> listerRegion(Long localId);    
}

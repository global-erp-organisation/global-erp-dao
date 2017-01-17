package com.camlait.global.erp.dao.organisation;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.camlait.global.erp.domain.organisation.Zone;

public interface ZoneDao extends JpaRepository<Zone, String> {

    @Query(value = "From Zone z where z.secteur.localId=?1")
    Collection<Zone> listerZone(Long secteurId);
}

package com.camlait.global.erp.dao.immobilisation;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.camlait.global.erp.domain.immobilisation.Vehicule;

public interface VehiculeDao extends JpaRepository<Vehicule, Long> {
    
    Page<Vehicule> findByImmatriculation(String immatriculation,Pageable p);
}

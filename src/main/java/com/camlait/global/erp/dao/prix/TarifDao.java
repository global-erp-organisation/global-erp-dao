package com.camlait.global.erp.dao.prix;

import org.springframework.data.jpa.repository.JpaRepository;

import com.camlait.global.erp.domain.prix.Tarif;

public interface TarifDao extends JpaRepository<Tarif, String> {

}

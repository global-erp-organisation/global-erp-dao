package com.camlait.global.erp.dao.prix;

import org.springframework.data.jpa.repository.JpaRepository;

import com.camlait.global.erp.domain.prix.Tarification;

public interface TarificationDao extends JpaRepository<Tarification, String> {

}

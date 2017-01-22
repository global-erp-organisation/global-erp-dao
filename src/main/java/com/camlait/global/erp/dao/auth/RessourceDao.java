package com.camlait.global.erp.dao.auth;

import org.springframework.data.jpa.repository.JpaRepository;

import com.camlait.global.erp.domain.auth.Ressource;

public interface RessourceDao extends JpaRepository<Ressource, String> {
}

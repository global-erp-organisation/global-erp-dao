package com.camlait.global.erp.dao.auth;

import org.springframework.data.jpa.repository.JpaRepository;

import com.camlait.global.erp.domain.auth.user.Groupe;

public interface GroupeDao extends JpaRepository<Groupe, String> {

}

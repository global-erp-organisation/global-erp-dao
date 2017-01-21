package com.camlait.global.erp.dao.auth;

import org.springframework.data.jpa.repository.JpaRepository;

import com.camlait.global.erp.domain.traduction.Terme;

public interface TermeDao extends JpaRepository<Terme, String> {
	
	Terme findByDescriptionTerme(String descriptionTerme);
}

package com.camlait.global.erp.dao.auth;

import org.springframework.data.jpa.repository.JpaRepository;

import com.camlait.global.erp.domain.auth.Terme;

public interface TermeDao extends JpaRepository<Terme, Long> {
	
	Terme findByDescriptionTerme(String descriptionTerme);
}

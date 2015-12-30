package com.camlait.global.erp.dao.partenaire;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.camlait.global.erp.domain.partenaire.Partenaire;

public interface PartenaireDao extends JpaRepository<Partenaire, Long> {

	@Query(value = "select max(p.partenaireId) from Partenaire p")
	Long obtenirDernierPartenaire(String prefixe);
}

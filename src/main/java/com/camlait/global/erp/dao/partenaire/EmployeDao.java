package com.camlait.global.erp.dao.partenaire;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.camlait.global.erp.domain.partenaire.Employe;

public interface EmployeDao extends JpaRepository<Employe, Long> {

	@Query(value = "From Employe e where (e.nom like %?1) or ((e.prenom like %?1)or (e.matricule like %?1))")
	Page<Employe> listerEmploye(String motCle, Pageable p);
}

package com.camlait.global.erp.dao.bmq;

import java.util.Date;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.camlait.global.erp.domain.bmq.Bmq;

public interface BmqDao extends JpaRepository<Bmq, String> {

	@Query(value = "from Bmq b where b.vendeur.partenaireId=?1")
	Page<Bmq> listerBmq(Long vendeurId, Pageable p);

	@Query(value = "from Bmq b where (b.dateBmq>=?1 and b.dateBmq<=?2)")
	Page<Bmq> listerBmq(Date debut, Date fin, Pageable p);

	@Query(value = "from Bmq b where (b.vendeur.partenaireId=?1) and (b.dateBmq>=?2 and b.dateBmq<=?3)")
	Page<Bmq> listerBmq(Long vendeurId, Date debut, Date fin, Pageable p);

	@Query(value = "from Bmq b order by b.codeBmq desc")
	Page<Bmq> obtenirDernierBmq(Pageable p);

	Page<Bmq> findByCodeBmq(String codeBmq, Pageable p);
}

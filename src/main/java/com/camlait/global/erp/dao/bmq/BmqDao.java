package com.camlait.global.erp.dao.bmq;

import java.util.Date;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.camlait.global.erp.domain.bmq.Bmq;

public interface BmqDao extends JpaRepository<Bmq, String> {
	@Query(value = "from Bmq b where (b.dateBmq>=?1 and b.dateBmq<=?2)")
	Page<Bmq> retrieveBmqs(Date start, Date end, Pageable p);

	@Query(value = "from Bmq b where b.bmqId like %?1% " + "or b.dateBmq like %?1% or b.vendeur.nom like %?1% "
			+ "or b.vendeur.prenom like %?1% or b.magasin.magasinId like %?1% "
			+ "or b.magasin.codeMagasin like %?1% or b.magasin.descriptionMagasin like %?1%")
	Page<Bmq> retrieveBmqs(String keyWord, Pageable p);
}

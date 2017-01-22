package com.camlait.global.erp.dao.document.comerciaux;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.camlait.global.erp.domain.document.commerciaux.Taxe;

public interface TaxeDao extends JpaRepository<Taxe, String> {
	@Query(value = "from Taxe t where t.codeTaxe like %?1% or t.taxeId like %?1% or taxeDescription like %?1%")
	Page<Taxe> retrieveTaxes(String keyWord, Pageable p);
}

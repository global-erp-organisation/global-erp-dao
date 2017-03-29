package com.camlait.global.erp.dao.document;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.camlait.global.erp.domain.document.business.Tax;

public interface TaxRepository extends JpaRepository<Tax, String> {
	@Query(value = "from Tax t where t.codeTaxe like %?1% or t.taxeId like %?1% or taxeDescription like %?1%")
	Page<Tax> retrieveTaxes(String keyWord, Pageable p);
}
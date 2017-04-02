package com.camlait.global.erp.dao.document;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.camlait.global.erp.domain.document.business.Tax;

public interface TaxRepository extends JpaRepository<Tax, String> {
    @Query(value = "from Tax t where t.taxCode like %?1% or t.taxId like %?1% or taxDescription like %?1%")
    Page<Tax> retrieveTaxes(String keyWord, Pageable p);

    /**
     * Retrieve a tax by code.
     * 
     * @param taxCode
     * @return
     */
    Tax findOneTaxByTaxCode(String taxCode);
}

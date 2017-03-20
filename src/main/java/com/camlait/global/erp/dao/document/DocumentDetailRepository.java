package com.camlait.global.erp.dao.document;

import org.springframework.data.jpa.repository.JpaRepository;

import com.camlait.global.erp.domain.document.DocumentDetails;

public interface DocumentDetailRepository extends JpaRepository<DocumentDetails, String> {

}

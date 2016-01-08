package com.camlait.global.erp.dao.document;

import org.springframework.data.jpa.repository.JpaRepository;

import com.camlait.global.erp.domain.document.LigneDeDocument;

public interface LigneDocumentDao extends JpaRepository<LigneDeDocument, Long> {

}

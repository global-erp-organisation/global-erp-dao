package com.camlait.global.erp.dao.document;

import org.springframework.data.jpa.repository.JpaRepository;

import com.camlait.global.erp.domain.document.LigneDeDocument;
import com.camlait.global.erp.domain.pk.PKLigneDocument;

public interface LigneDocumentDao extends JpaRepository<LigneDeDocument, PKLigneDocument> {

}

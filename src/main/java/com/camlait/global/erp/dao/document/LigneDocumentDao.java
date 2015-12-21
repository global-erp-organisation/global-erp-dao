package com.camlait.global.erp.dao.document;

import org.springframework.data.repository.CrudRepository;

import com.camlait.global.erp.domain.document.LigneDeDocument;
import com.camlait.global.erp.domain.pk.PKLigneDocument;

public interface LigneDocumentDao extends CrudRepository<LigneDeDocument, PKLigneDocument> {

}

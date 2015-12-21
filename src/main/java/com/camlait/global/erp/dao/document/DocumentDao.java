package com.camlait.global.erp.dao.document;

import org.springframework.data.repository.CrudRepository;

import com.camlait.global.erp.domain.document.Document;

public interface DocumentDao extends CrudRepository<Document, Long> {

}

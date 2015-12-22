package com.camlait.global.erp.dao.document;


import org.springframework.data.jpa.repository.JpaRepository;

import com.camlait.global.erp.domain.document.Document;

public interface DocumentDao extends JpaRepository<Document, Long> {

}

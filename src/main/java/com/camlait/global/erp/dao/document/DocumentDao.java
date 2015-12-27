package com.camlait.global.erp.dao.document;


import java.util.Date;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.camlait.global.erp.domain.document.Document;

public interface DocumentDao extends JpaRepository<Document, Long> {

	@Query(value="from Document d where (d.dateDocument>=?1 and d.dateDocument<=?2)")
	Page<Document> listerDocument(Date debut, Date fin, Pageable p);
	
}

package com.camlait.global.erp.dao.document;

import java.util.Date;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.camlait.global.erp.domain.document.Document;
import com.camlait.global.erp.domain.enumeration.EnumTypeEntite;

public interface DocumentDao extends JpaRepository<Document, Long> {
    
    @Query(value = "from Document d where (d.dateDocument>=?1 and d.dateDocument<=?2)")
    Page<Document> listerDocument(Date debut, Date fin, Pageable p);
    
    @Query(value = "Select d From Document d where d.typeDocument=?1 order by d.codeDocument desc")
    Page<Document> obtenirDernierDocument(EnumTypeEntite type,Pageable p);
    
    Page<Document> findByCodeDocument(String codeDocument,Pageable p);
}

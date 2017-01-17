package com.camlait.global.erp.dao.operation.caisse;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.camlait.global.erp.domain.operation.caisse.JournalCaisse;

public interface JournalCaisseDao extends JpaRepository<JournalCaisse, String> {
    
    Page<JournalCaisse> findByCodeJournal(String codeJournal,Pageable p);
}

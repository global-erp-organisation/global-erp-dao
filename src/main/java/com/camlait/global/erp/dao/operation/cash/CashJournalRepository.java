package com.camlait.global.erp.dao.operation.cash;

import org.springframework.data.jpa.repository.JpaRepository;

import com.camlait.global.erp.domain.operation.cash.CashJournal;

public interface CashJournalRepository extends JpaRepository<CashJournal, String> {
}

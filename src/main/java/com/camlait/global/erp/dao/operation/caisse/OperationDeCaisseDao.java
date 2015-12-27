package com.camlait.global.erp.dao.operation.caisse;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.camlait.global.erp.domain.operation.caisse.OperationDeCaisse;

public interface OperationDeCaisseDao extends JpaRepository<OperationDeCaisse, Long> {

	@Query(value="from OperationDeCaisse o where o.journal.journalId=?1")
	Collection<OperationDeCaisse> listerOperationDeCaisse(Long journalId);
}

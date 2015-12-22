package com.camlait.global.erp.dao.operation.caisse;

import org.springframework.data.jpa.repository.JpaRepository;

import com.camlait.global.erp.domain.operation.caisse.OperationDeCaisse;

public interface OperationDeCaisseDao extends JpaRepository<OperationDeCaisse, Long> {

}

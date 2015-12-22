package com.camlait.global.erp.dao.operation;

import org.springframework.data.jpa.repository.JpaRepository;

import com.camlait.global.erp.domain.operation.Operation;

public interface OperationDao extends JpaRepository<Operation, Long> {

}

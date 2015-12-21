package com.camlait.global.erp.dao.operation;

import org.springframework.data.repository.CrudRepository;

import com.camlait.global.erp.domain.operation.Operation;

public interface OperationDao extends CrudRepository<Operation, Long> {

}

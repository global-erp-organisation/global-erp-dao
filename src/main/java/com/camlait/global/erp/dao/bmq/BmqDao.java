package com.camlait.global.erp.dao.bmq;

import org.springframework.data.repository.CrudRepository;

import com.camlait.global.erp.domain.bmq.Bmq;
import com.camlait.global.erp.domain.pk.PKBmq;

public interface BmqDao extends CrudRepository<Bmq, PKBmq> {

}

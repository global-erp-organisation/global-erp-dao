package com.camlait.global.erp.dao.bmq;

import org.springframework.data.repository.CrudRepository;

import com.camlait.global.erp.domain.bmq.LigneBmq;
import com.camlait.global.erp.domain.pk.PKLigneBmq;

public interface LigneBmqDao extends CrudRepository<LigneBmq, PKLigneBmq> {

}

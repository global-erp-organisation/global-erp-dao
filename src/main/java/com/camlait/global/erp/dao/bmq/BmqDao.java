package com.camlait.global.erp.dao.bmq;

import org.springframework.data.jpa.repository.JpaRepository;

import com.camlait.global.erp.domain.bmq.Bmq;
import com.camlait.global.erp.domain.pk.PKBmq;

public interface BmqDao extends JpaRepository<Bmq, PKBmq> {

}

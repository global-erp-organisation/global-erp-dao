package com.camlait.global.erp.dao.bmq;

import org.springframework.data.jpa.repository.JpaRepository;

import com.camlait.global.erp.domain.bmq.LigneBmq;
import com.camlait.global.erp.domain.pk.PKLigneBmq;

public interface LigneBmqDao extends JpaRepository<LigneBmq, PKLigneBmq> {

}

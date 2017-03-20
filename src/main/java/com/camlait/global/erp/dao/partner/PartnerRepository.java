package com.camlait.global.erp.dao.partner;

import org.springframework.data.jpa.repository.JpaRepository;

import com.camlait.global.erp.domain.partner.Partner;

public interface PartnerRepository extends JpaRepository<Partner, String> {
}

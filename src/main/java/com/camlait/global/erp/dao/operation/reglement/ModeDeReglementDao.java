package com.camlait.global.erp.dao.operation.reglement;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.camlait.global.erp.domain.operation.reglement.ModeDeReglement;

public interface ModeDeReglementDao extends JpaRepository<ModeDeReglement, String> {

    Page<ModeDeReglement> findByCodeModeReglement(String code,Pageable p);
}

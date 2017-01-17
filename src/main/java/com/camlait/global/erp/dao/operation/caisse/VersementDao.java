package com.camlait.global.erp.dao.operation.caisse;

import org.springframework.data.jpa.repository.JpaRepository;
import com.camlait.global.erp.domain.operation.caisse.Versement;

public interface VersementDao extends JpaRepository<Versement, String> {

}

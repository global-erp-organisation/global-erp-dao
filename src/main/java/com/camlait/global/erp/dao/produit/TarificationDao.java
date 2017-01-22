package com.camlait.global.erp.dao.produit;

import org.springframework.data.jpa.repository.JpaRepository;
import com.camlait.global.erp.domain.tarif.Tarification;

public interface TarificationDao extends JpaRepository<Tarification, String> {

}

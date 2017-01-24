package com.camlait.global.erp.dao.tarif;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.camlait.global.erp.domain.tarif.Tarification;

public interface TarificationDao extends JpaRepository<Tarification, String> {

    @Query(value = "from Tarification t where t.tarif.tarifId=?1 and t.zone.localId=?2 and t.produit.produitId=?3")
    Double retrieveUnitPrice(String tarifId, String zoneId, String productId);

    @Query(value = "from Tarification t where t.tarificationId like %?1% or t.zone.localId like %?1% "
            + "or t.zone.code like %?1% or t.produit.produitId like %?1% or t.produit.codeProduit like %?1% "
            + "or t.produit.descriptionProduit like %?1% or t.tarif.tarifId like %?1% or t.tarif.descriptionTarif like %?1%")
    Page<Tarification> retrieveTarifications(String keyWord, Pageable p);
}

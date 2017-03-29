package com.camlait.global.erp.dao.tarif;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.camlait.global.erp.domain.tarif.Tariffication;

public interface TarificationRepository extends JpaRepository<Tariffication, String> {

    @Query(value = "from Tariffication t where t.tarif.tarifId=?1 and t.zone.localId=?2 and t.produit.produitId=?3 and t.priceType.priceTypeId=?4")
    Double retrieveUnitPrice(String tarifId, String zoneId, String productId, String tariffId);

    @Query(value = "from Tariffication t where t.tarificationId like %?1% or t.zone.localId like %?1% "
            + "or t.zone.code like %?1% or t.produit.produitId like %?1% or t.produit.codeProduit like %?1% "
            + "or t.produit.descriptionProduit like %?1% or t.tarif.tarifId like %?1% or t.tarif.descriptionTarif like %?1%")
    Page<Tariffication> retrieveTarifications(String keyWord, Pageable p);
}

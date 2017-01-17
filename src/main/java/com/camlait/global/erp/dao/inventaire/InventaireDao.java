package com.camlait.global.erp.dao.inventaire;

import java.util.Date;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.camlait.global.erp.domain.inventaire.Inventaire;

public interface InventaireDao extends JpaRepository<Inventaire, String>{
    
    @Query(value = "from Inventaire i where (i.dateInventaire>=?1 and i.dateInventaire<=?2)")
    Page<Inventaire> listerInventaire(Date debut, Date fin, Pageable p);
    
    @Query(value = "from Inventaire i where i.magasin.magasinId=?1")
    Page<Inventaire> listerInventaire(Long magasinId, Pageable p);
    
    @Query(value = "select i from Inventaire i order by i.codeInventaire")
    Page<Inventaire> obtenirDernierInventaire(Pageable p);
    
    Page<Inventaire> findByCodeInventaire(String codeInventaire,Pageable p);
    
}

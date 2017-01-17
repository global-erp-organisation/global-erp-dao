package com.camlait.global.erp.dao.entrepot;

import java.util.Collection;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.camlait.global.erp.domain.entrepot.Magasin;
import com.camlait.global.erp.domain.enumeration.EnumTypeEntite;

public interface MagasinDao extends JpaRepository<Magasin, String> {
    
    @Query(value = "from Magasin m where m.entrepot.entrepotId=?1")
    Collection<Magasin> listerMagasin(Long entrepotId);
    
    @Query(value = "from Magasin m where (m.codeMagasin like %?1%) or (m.descriptionMagasin like %?1%)")
    Collection<Magasin> listerMagasin(String motCle);
    
    @Query(value="from Magasin m where m.typeMagasin=?1 order by m.codeMagasin")
    Page<Magasin> obtenirDernierMagasin(EnumTypeEntite type, Pageable p);
    
    Page<Magasin> findByCodeMagasin(String codeMagasin,Pageable p);
    
}

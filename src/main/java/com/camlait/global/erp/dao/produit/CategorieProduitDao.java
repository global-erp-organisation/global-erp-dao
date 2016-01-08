package com.camlait.global.erp.dao.produit;

import java.util.Collection;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.camlait.global.erp.domain.produit.CategorieProduit;

@Repository
public interface CategorieProduitDao extends JpaRepository<CategorieProduit, Long> {

	@Query(value = "from CategorieProduit c where c.categorieParent.categorieProduitId=?1")
	Collection<CategorieProduit> listerCategorie(Long parentId);

	@Query(value = "from CategorieProduit c where(c.codeCategorieProduit like %?1%)or (c.descriptionCategorie like %?1%)")
	Collection<CategorieProduit> listerCategorieProduit(String motCle);
	
	Page<CategorieProduit> findBycodeCategorieProduit(String codeCategorieProduit,Pageable p);
}

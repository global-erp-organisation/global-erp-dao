package com.camlait.global.erp.dao.document;

import java.util.Date;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.camlait.global.erp.domain.document.Document;
import com.camlait.global.erp.domain.exception.DataStorageExcetion;

public interface DocumentDao extends JpaRepository<Document, String> {

	@Query(value = "from Document d where (d.dateDocument>=?1 and d.dateDocument<=?2)")
	Page<Document> retrieveDocuments(Date start, Date end, Pageable p);

	@Query(value = "from Document d where d.documentId like %?1% or d.dateDocument like %?1% "
			+ "or d.magasin.magasinId like %?1% or d.magasin.descriptionMagasin like %?1% or d.responsableDocument.partenaireId like %?1% "
			+ "or d.responsableDocument.nom like %?1% or d.responsableDocument.prenom like %?1% or d.inventaire.inventaireid like %?1% "
			+ "or d.inventaire.dateInventaire like %?1% or d.typeDocument like %?1% or d.bmq.bmqId like %?1% or d.bmq.vendeur.partenaireid like %?1% "
			+ "order by dateDocument, documentId desc")
	Page<Document> retrieveDocuments(String keyWord, Pageable p) throws DataStorageExcetion;
}

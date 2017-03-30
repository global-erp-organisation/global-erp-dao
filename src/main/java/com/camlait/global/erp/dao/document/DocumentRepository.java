package com.camlait.global.erp.dao.document;

import java.util.Date;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.camlait.global.erp.domain.document.Document;
import com.camlait.global.erp.domain.exception.DataStorageException;

public interface DocumentRepository extends JpaRepository<Document, String> {

    @Query(value = "from Document d where (d.documentDate>=?1 and d.documentDate<=?2)")
    Page<Document> retrieveDocuments(Date start, Date end, Pageable p);

    @Query(value = "from Document d where d.documentId like %?1% or d.documentDate like %?1% "
            + "or d.store.storeId like %?1% or d.store.storeDescription like %?1% or d.documentWorker.partnerId like %?1% "
            + "or d.documentWorker.lastName like %?1% or d.documentWorker.firstname like %?1% or d.inventory.inventoryId like %?1% "
            + "or d.inventory.inventoryDate like %?1% or d.documentType like %?1% or d.dailyMovement.dmId like %?1% or d.dailyMovement.seller.partnerId like %?1% "
            + "order by documentDate, documentId desc")
    Page<Document> retrieveDocuments(String keyWord, Pageable p) throws DataStorageException;
}

package com.camlait.global.erp.dao.dm;

import java.util.Date;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.camlait.global.erp.domain.dm.DailyMovement;

public interface DailyManagementRepository extends JpaRepository<DailyMovement, String> {
    @Query(value = "from DailyMovement b where (b.dmDate>=?1 and b.dmDate<=?2)")
    Page<DailyMovement> retrieveBmqs(Date start, Date end, Pageable p);

    @Query(value = "from DailyMovement b where b.dmCode like %?1% " + "or b.dmDate like %?1% or b.seller.lastName like %?1% "
            + "or b.seller.firstname like %?1% or b.store.storeId like %?1% " + "or b.store.storeCode like %?1% or b.store.storeDescription like %?1%")
    Page<DailyMovement> retrieveBmqs(String keyWord, Pageable p);
}

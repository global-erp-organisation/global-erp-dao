package com.camlait.global.erp.dao.auth;

import org.springframework.data.jpa.repository.JpaRepository;

import com.camlait.global.erp.domain.auth.ResourceUser;
import com.camlait.global.erp.domain.keys.ResourceGroupKey;

public interface ResourceUserRepository extends JpaRepository<ResourceUser, ResourceGroupKey> {

}

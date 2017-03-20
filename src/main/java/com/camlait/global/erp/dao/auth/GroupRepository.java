package com.camlait.global.erp.dao.auth;

import org.springframework.data.jpa.repository.JpaRepository;

import com.camlait.global.erp.domain.auth.Group;

public interface GroupRepository extends JpaRepository<Group, String> {

}

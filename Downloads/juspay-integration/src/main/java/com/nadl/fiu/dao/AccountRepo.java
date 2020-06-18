package com.nadl.fiu.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nadl.fiu.model.AccountModel;

public interface AccountRepo extends JpaRepository<AccountModel, String> {

}

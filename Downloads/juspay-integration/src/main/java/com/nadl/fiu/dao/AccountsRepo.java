package com.nadl.fiu.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nadl.fiu.model.AccountModel;
import com.nadl.fiu.model.Accounts;

public interface AccountsRepo extends JpaRepository<Accounts, String>{
	

}

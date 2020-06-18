package com.nadl.fiu.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nadl.fiu.model.Account;



public interface AccountServiceRepo extends JpaRepository<Account, String> {

}

package com.nadl.fiu.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nadl.fiu.model.Accounts;
import com.nadl.fiu.model.ConsentRequestModel;

public interface ConsentRepo  extends JpaRepository<ConsentRequestModel,String> {

}

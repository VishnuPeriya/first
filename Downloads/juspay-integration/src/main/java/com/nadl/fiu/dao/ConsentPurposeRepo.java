package com.nadl.fiu.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nadl.fiu.model.ConsentRequestModel;
import com.nadl.fiu.model.PurposeModel;

public interface ConsentPurposeRepo extends JpaRepository<PurposeModel,String> {

}

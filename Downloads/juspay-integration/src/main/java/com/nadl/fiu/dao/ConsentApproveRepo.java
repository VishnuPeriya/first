package com.nadl.fiu.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nadl.fiu.model.ConsentApproveModel;


public interface ConsentApproveRepo  extends JpaRepository<ConsentApproveModel,String> {
	public List<ConsentApproveModel> findByArtefactId(String artefactId);

}

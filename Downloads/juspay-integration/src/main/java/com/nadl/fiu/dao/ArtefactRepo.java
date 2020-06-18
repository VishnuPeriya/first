package com.nadl.fiu.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nadl.fiu.model.ConsentApproveModel;
import com.nadl.fiu.model.ConsentArtefactModel;
import com.nadl.fiu.model.ConsentRequestModel;

public interface ArtefactRepo extends JpaRepository<ConsentArtefactModel,String> {
	public List<ConsentArtefactModel> findByConsentId(String artefactId);

}

package com.nadl.fiu.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nadl.fiu.model.FipModel;
@Repository
public interface FipSaveRepo extends JpaRepository<FipModel, String> {

}

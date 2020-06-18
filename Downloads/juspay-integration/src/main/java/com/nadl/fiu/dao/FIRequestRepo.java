package com.nadl.fiu.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nadl.fiu.model.FIRequestModel;

public interface FIRequestRepo extends JpaRepository<FIRequestModel, String> {

}

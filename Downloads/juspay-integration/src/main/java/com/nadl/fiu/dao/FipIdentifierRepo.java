package com.nadl.fiu.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nadl.fiu.model.FipIdentifier;

public interface FipIdentifierRepo extends JpaRepository<FipIdentifier, Integer> {

}

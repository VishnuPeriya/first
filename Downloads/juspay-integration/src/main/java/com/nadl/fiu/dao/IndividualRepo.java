package com.nadl.fiu.dao;

import org.springframework.data.jpa.repository.JpaRepository;


import com.nadl.fiu.model.Individual;

public interface IndividualRepo extends JpaRepository<Individual, String> {

}

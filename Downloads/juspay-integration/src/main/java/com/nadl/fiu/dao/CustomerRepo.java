package com.nadl.fiu.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nadl.fiu.model.Customers;

public interface CustomerRepo extends JpaRepository<Customers,String> {

}

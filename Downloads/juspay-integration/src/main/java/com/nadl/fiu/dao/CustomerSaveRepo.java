package com.nadl.fiu.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nadl.fiu.model.Customer;
@Repository
public interface CustomerSaveRepo extends JpaRepository<Customer, String>  {
	

}

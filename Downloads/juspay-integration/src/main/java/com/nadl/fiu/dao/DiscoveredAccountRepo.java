package com.nadl.fiu.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nadl.fiu.model.DiscoveredAccount;



public interface DiscoveredAccountRepo extends JpaRepository<DiscoveredAccount, String> {

}

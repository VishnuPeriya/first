package com.nadl.fiu.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nadl.fiu.model.DiscoveredAccount;
import com.nadl.fiu.model.Fip;
import com.nadl.fiu.model.FipModel;

public interface FIPModelRepo extends JpaRepository<Fip, String>{

}

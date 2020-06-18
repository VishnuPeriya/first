package com.nadl.fiu.dao;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Component;

import com.nadl.fiu.dto.CustomerType;
import com.nadl.fiu.dto.FipAdd;
import com.nadl.fiu.dto.RegisterReq;
import com.nadl.fiu.model.Account;
import com.nadl.fiu.model.AccountModel;
import com.nadl.fiu.model.Accounts;
import com.nadl.fiu.model.ConsentApproveModel;
import com.nadl.fiu.model.ConsentArtefactModel;
import com.nadl.fiu.model.ConsentRequestModel;
//import com.nadl.fiu.controller.FiuController;
import com.nadl.fiu.model.Customer;
import com.nadl.fiu.model.Customers;
import com.nadl.fiu.model.FIRequestModel;
import com.nadl.fiu.model.Fip;
import com.nadl.fiu.model.FipModel;
import com.nadl.fiu.model.Individual;
import com.nadl.fiu.model.PurposeModel;
public interface FiuDAO {
	
public void CustomerSave(Customer customer);

public void addfip(FipModel fip);

public List<FipModel> getfip();

public Customer getCustomer(String id);

public Account getaccount(String id);

public AccountModel getAccountDetails(String accountId);

public Accounts getAccounts(String accountId);

public ConsentRequestModel saveConsentRequest(ConsentRequestModel populateConsentRequestModel);

public PurposeModel getPurpose(String purposeId);

public ConsentArtefactModel saveartefact(ConsentArtefactModel consentArtefact);

public ConsentRequestModel getconsent(String id);

public ConsentApproveModel saveConsentAccount(ConsentApproveModel consentAccount);

public List<ConsentArtefactModel> findbyid(String id);

public List<ConsentApproveModel> getapprove(String id);

public Fip getfipmodel(String fipId);

public FIRequestModel saverequest(FIRequestModel fiRequestModel);

public Customer saveCustomer(RegisterReq reg, String string);

public Customers saveCustomers(RegisterReq reg, CustomerType string);

public Individual saveIndividual(String customerId, RegisterReq reg);
}

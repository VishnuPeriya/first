package com.nadl.fiu.dao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import com.nadl.fiu.controller.FiuController;
import com.nadl.fiu.dto.CustomerStatus;
import com.nadl.fiu.dto.CustomerType;
import com.nadl.fiu.dto.FipAdd;
import com.nadl.fiu.dto.RegisterReq;
import com.nadl.fiu.model.Account;
import com.nadl.fiu.model.AccountModel;
import com.nadl.fiu.model.Accounts;
import com.nadl.fiu.model.ConsentApproveModel;
import com.nadl.fiu.model.ConsentArtefactModel;
import com.nadl.fiu.model.ConsentRequestModel;
import com.nadl.fiu.model.Customer;
import com.nadl.fiu.model.Customers;
import com.nadl.fiu.model.FIRequestModel;
import com.nadl.fiu.model.Fip;
import com.nadl.fiu.model.FipModel;
import com.nadl.fiu.model.Individual;
import com.nadl.fiu.model.PurposeModel;
@Component
public class FiuDAOImp implements FiuDAO {
	private static final Logger LOGGER = LogManager.getLogger(FiuDAO.class);
	@Autowired CustomerSaveRepo customersaverepo;
	@Autowired FipSaveRepo fipsaverepo;
	@Autowired FipIdentifierRepo fipidentifierrepo;
	@Autowired AccountServiceRepo accountservicerepo;
	@Autowired DiscoveredAccountRepo discoveredaccrepo;
	@Autowired AccountRepo accountrepo;
	@Autowired AccountsRepo accountsrepo;
	@Autowired ConsentRepo consentrepo;
	@Autowired ConsentPurposeRepo purposerepo;
	@Autowired ArtefactRepo artefactrepo;
	@Autowired ConsentApproveRepo consentapproverepo;
	@Autowired FIPModelRepo fiprepo;
	@Autowired FIRequestRepo fiprequesterepo;
	@Autowired CustomerRepo customerRepository;
	@Autowired IndividualRepo individualRepository;
	@Override
	@Transactional
	public void CustomerSave(Customer customer) {
		System.out.println("inside daoimpl");
		customersaverepo.save(customer);
		
	}
	@Transactional
	public void addfip(FipModel fip)
	{
		fipsaverepo.save(fip);
	}
	@Override
	public List<FipModel> getfip() {
		// TODO Auto-generated method stub
		return fipsaverepo.findAll();
	}
	@Override
	public Customer getCustomer(String id) {
		// TODO Auto-generated method stub
		return customersaverepo.findById(id).get();
	}
	@Override
	public Account getaccount(String id) {
		// TODO Auto-generated method stub
		return accountservicerepo.findById(id).get();
	}
	@Override
	public AccountModel getAccountDetails(String accountId) {
		return accountrepo.findById(accountId).get();
	
	}
	@Override
	public Accounts getAccounts(String accountId) {
		// TODO Auto-generated method stub
		return accountsrepo.findById(accountId).get();
	}
	@Override
	public ConsentRequestModel saveConsentRequest(ConsentRequestModel populateConsentRequestModel) {
		// TODO Auto-generated method stub
		return consentrepo.save(populateConsentRequestModel);
	}
	@Override
	public PurposeModel getPurpose(String purposeId) {
		// TODO Auto-generated method stub
		return purposerepo.findById(purposeId).get();
	}
	@Override
	public ConsentArtefactModel saveartefact(ConsentArtefactModel consentArtefact) {
		// TODO Auto-generated method stub
		return artefactrepo.save(consentArtefact);
	}
	@Override
	public ConsentRequestModel getconsent(String id) {
		// TODO Auto-generated method stub
		return consentrepo.findById(id).get();
	}
	@Override
	public ConsentApproveModel saveConsentAccount(ConsentApproveModel consentAccount) {
		// TODO Auto-generated method stub
		return consentapproverepo.save(consentAccount);
	}
	@Override
	public List<ConsentArtefactModel> findbyid(String id) {
		// TODO Auto-generated method stub
		return artefactrepo.findByConsentId(id);
	}
	@Override
	public List<ConsentApproveModel> getapprove(String id) {
		// TODO Auto-generated method stub
		return consentapproverepo.findByArtefactId(id);
	}
	@Override
	public Fip getfipmodel(String fipId) {
		// TODO Auto-generated method stub
		return fiprepo.findById(fipId).get();
	}
	@Override
	public FIRequestModel saverequest(FIRequestModel fiRequestModel) {
		return fiprequesterepo.save(fiRequestModel);
		
	}
	@Override
	public Customer saveCustomer(RegisterReq reg, String string) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Customers saveCustomers(RegisterReq reg, CustomerType string) {
		// TODO Auto-generated method stub
		return  customerRepository.save(populateCustomerData(reg,string));
	}
	private Customers populateCustomerData(RegisterReq reg, CustomerType string) {
		// TODO Auto-generated method stub
		Customers customer = new Customers();
		customer.setCustomerType(string);
		customer.setMobileNo(reg.getMobileNo());
		customer.setEmailId(reg.getEmailId());
		customer.setMobileValidated(1);
		customer.setMobileValidationId(reg.getMobileValidationId());
		customer.setVua(reg.getVua());
		customer.setOkycId(reg.getOkycId());
		customer.setStatus(CustomerStatus.PendingAccountLinking);
		
		return customer;
	}
	@Override
	public Individual saveIndividual(String customerId, RegisterReq reg) {
		// TODO Auto-generated method stub
		return individualRepository.save(populateIndividual(customerId, reg));
		
	}
	private Individual populateIndividual(String customerId, RegisterReq reg) {
		// TODO Auto-generated method stub
		Individual individual = new Individual();
		individual.setCustomerId(customerId);
		individual.setFirstName(reg.getFirstName());
		individual.setMiddleName(reg.getMiddleName());
		individual.setLastName(reg.getLastName());
		Date date = formatDate(reg.getDob());
		individual.setDob(date);
		return individual;
	}
	private Date formatDate(String dob) {
		// TODO Auto-generated method stub
		try {
			return  new SimpleDateFormat("yyyy-mm-DD").parse(dob);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}

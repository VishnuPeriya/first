package com.nadl.fiu.service;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.xml.bind.DatatypeConverter;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.nadl.fiu.dao.FiuDAO;
import com.nadl.fiu.dto.AccountReq;
import com.nadl.fiu.dto.ConsentCustomer;
import com.nadl.fiu.dto.ConsentDetail;
import com.nadl.fiu.dto.ConsentPurpose;
import com.nadl.fiu.dto.ConsentPurposeCategory;
import com.nadl.fiu.dto.ConsentRequest;
import com.nadl.fiu.dto.ConsentStatus;
import com.nadl.fiu.dto.ConsentTypes;
import com.nadl.fiu.dto.Consents;
import com.nadl.fiu.dto.CustomerType;
import com.nadl.fiu.dto.DataConsumer;
import com.nadl.fiu.dto.DataFilter;
import com.nadl.fiu.dto.DataFilterType;
import com.nadl.fiu.dto.DataLife;
import com.nadl.fiu.dto.DataLifeUnit;
import com.nadl.fiu.dto.DataProvider;
import com.nadl.fiu.dto.EndUserAuthType;
import com.nadl.fiu.dto.EndUserRequest;
import com.nadl.fiu.dto.EndUserReturnValue;
import com.nadl.fiu.dto.FIDataRange;
import com.nadl.fiu.dto.FIRequest;
import com.nadl.fiu.dto.FIRequestStatusEnums;
import com.nadl.fiu.dto.FIResponse;
import com.nadl.fiu.dto.FITypeEnums;
import com.nadl.fiu.dto.FipAdd;
import com.nadl.fiu.dto.Frequency;
import com.nadl.fiu.dto.FrequencyUnitEnums;
import com.nadl.fiu.dto.IndividualReturnValue;
import com.nadl.fiu.dto.RegisterReq;
import com.nadl.fiu.dto.RejectionResponse;
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

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.MalformedJwtException;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.SignatureException;
import io.jsonwebtoken.UnsupportedJwtException;
import services.FipServiceCommunicator;
@Service("FiuService")
public class FiuService {
	 @Autowired 
	 FiuDAO fiudao;	
	 @Autowired 
	 FipServiceCommunicator fipserver;
		public void CustomerSave(Customer customer)
		{   
			System.out.println("inside serviceimpl");
			fiudao.CustomerSave(customer);	 
			
		}
	public String generateSessionKey(Customer c) {
		    String jwt=null;
		try {
			 jwt=Jwts.builder().setSubject("customerinfo").setExpiration(new Date(System.currentTimeMillis() + (90* 60 * 1000))).claim("mobile",c.getMobileNumber()).claim("customerid",c.getCustomerId()).setId(c.getCustomerId()).signWith(SignatureAlgorithm.HS256, "secret".getBytes("UTF-8")).compact();
		    return jwt;
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		return jwt;
	}
	public void addfip(FipModel string) {
		fiudao.addfip(string);
		
	}
	public List<FipModel> getfip() {
		
		return fiudao.getfip();
	}
	public Customer validateTocken(String tocken) {
		// TODO Auto-generated method stub
		Customer c=null;
		try {
			Claims claims=Jwts.parser().setSigningKey("secret".getBytes("UTF-8")).parseClaimsJws(tocken).getBody();
			String customerid=claims.getId();
			 c=fiudao.getCustomer(customerid);
			
		} catch (UnsupportedJwtException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MalformedJwtException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SignatureException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return c;
		
	}
	public  Account getaccount(String id) {
		// TODO Auto-generated method stub
		return fiudao.getaccount(id);
	}
	public List<AccountModel> linkaccount(AccountReq req) {
		// TODO Auto-generated method stub
		List<AccountModel> accounts = getAccountDetails(req.getAccountIds());
		return accounts;		
	}
	private List<AccountModel> getAccountDetails(List<String> accountIds) {
		// TODO Auto-generated method stub
		List<AccountModel> accounts = new ArrayList<>();
		for (String accountId : accountIds) {
			AccountModel account = fiudao.getAccountDetails(accountId);
			accounts.add(account);   
	}
	
		return accounts;
	}
	public List<Accounts> getaccount(ConsentRequest req) {
		// TODO Auto-generated method stub
		List<Accounts> accounts=getacc(req.getConsentdetail().getAccountIds());
		
		return accounts;
	}
	private List<Accounts> getacc(List<String> accountIds) {
		// TODO Auto-generated method stub
		List<Accounts> accounts = new ArrayList<>();
		for (String accountId : accountIds) {
			Accounts account = fiudao.getAccounts(accountId);
			accounts.add(account);   
	}
		
	return accounts;
		
	}
	public ConsentRequestModel saveConsentRequest(ConsentRequest req) {
		// TODO Auto-generated method stub
		return fiudao.saveConsentRequest(populateConsentRequestModel(req));
	}
	private ConsentRequestModel populateConsentRequestModel(ConsentRequest req) {
		// TODO Auto-generated method stub
		ConsentRequestModel consentCollection = new ConsentRequestModel();
		ConsentDetail consentDetail = req.getConsentdetail();
		consentCollection.setRequestId((String.valueOf(UUID.randomUUID())));
		consentCollection.setCustomerId(consentDetail.getCustomer().getId());
		consentCollection.setTxnId((String.valueOf(UUID.randomUUID())));
		consentCollection.setVer("1.0");
		consentCollection.setTimestamp("04-01-2019");
		consentCollection.setConsentRecipientId(consentDetail.getDataConsumer().getId());
		consentCollection.setFetchType(consentDetail.getFetchType());
		consentCollection.setAssetTypeId(consentDetail.getFiTypes().stream().map(FITypeEnums::name).collect(Collectors.joining(",")));
		consentCollection.setConsentMode(consentDetail.getConsentMode());
		consentCollection.setConsentTypes(consentDetail.getConsentTypes().stream().map(ConsentTypes::name).collect(Collectors.joining(",")));
		consentCollection.setConsentHandle(String.valueOf(UUID.randomUUID()));
		consentCollection.setConsentId(String.valueOf(UUID.randomUUID()));
		if (consentDetail.getDataFilter() != null || consentDetail.getDataFilter().isEmpty() == false)
			consentCollection.setDataFilter(consentDetail.getDataFilter().stream().map(dataFilter -> {
				return dataFilter.getType().name() + "," + dataFilter.getOperator() + "," + dataFilter.getValue();
			}).collect(Collectors.joining("|")));
		consentCollection.setStartDate(consentDetail.getConsentStart());
		consentCollection.setEndDate(consentDetail.getConsentExpiry());
		if (consentDetail.getFrequency() != null && consentDetail.getFrequency().getUnit() != null) {
			consentCollection.setFrequencyUnit(consentDetail.getFrequency().getUnit().name());
			consentCollection.setFrequencyValue(consentDetail.getFrequency().getValue());
		}
		if (consentDetail.getDataLife() != null && consentDetail.getDataLife().getUnit() != null) {
			consentCollection.setDataLifeUnit(consentDetail.getDataLife().getUnit().name());
			consentCollection.setDataLifeValue(consentDetail.getDataLife().getValue());
		}
		consentCollection.setPurposeId(consentDetail.getPurposeId());
		consentCollection.setStatus(ConsentStatus.APPROVED);
		if (consentDetail.getFiDataRange() != null) {
			consentCollection.setFiDataRangeFrom(consentDetail.getFiDataRange().getFrom());
			consentCollection.setFiDataRangeTo(consentDetail.getFiDataRange().getTo());
		}
		consentCollection.setConsentUseCount(1);
		consentCollection.setConsentUseLogUri("abc@gmail.com");
		consentCollection.setConsentUseLastUsedDate("01-09-2019");
		consentCollection.setConsentRequestId((String.valueOf(UUID.randomUUID())));
		consentCollection.setDigitalSignature("signature");
		return consentCollection;
		
		
		
	}
	public PurposeModel getPurpose(String purposeId) {
		// TODO Auto-generated method stub
	return	fiudao.getPurpose(purposeId);
		
	}
	public ConsentArtefactModel saveArtefact(ConsentArtefactModel consentArtefact) {
		// TODO Auto-generated method stub
		return fiudao.saveartefact(consentArtefact);
	}
	public ConsentRequestModel getConsent() {
		// TODO Auto-generated method stub
		return fiudao.getconsent("d533f281-12eb-4f7d-b3bb-d2cbc8f041bf");
		
	
	}
	public Consents getall(ConsentRequestModel consent, List<String> accids) {
		// TODO Auto-generated method stub
	//	List<Consents> consents=new ArrayList<>();
		//List<Account> acc=getaccounts(consent);
		Consents cons=new Consents();
	
				cons.setStatus(consent.getStatus().name());
			
				cons.setConsentid(consent.getConsentId());
				cons.setConsenthandle(consent.getConsentHandle());
				cons.setCreatetimestamp(consent.getTimestamp());
				 ConsentDetail consentdetail=new ConsentDetail();
			   //  consentdetail.setAccounts();
			     String fromDate = null;
					String toDate = null;
			     consentdetail.setConsentExpiry(consent.getEndDate());
			     consentdetail.setConsentMode(consent.getConsentMode());
			     consentdetail.setConsentStart(consent.getStartDate());
			 	consentdetail.setConsentTypes(Stream.of(consent.getConsentTypes().split(",")).map(ConsentTypes::valueOf).collect(Collectors.toList()));
				consentdetail.setFiTypes(Stream.of(consent.getAssetTypeId().split(",")).map(FITypeEnums::valueOf).collect(Collectors.toList()));
				consentdetail.setDataConsumer(new DataConsumer(consent.getConsentRecipientId(), null));
				consentdetail.setCustomer(new ConsentCustomer(consent.getCustomerId()));
				consentdetail.setDataProvider(new DataProvider("AA", "AA"));
				consentdetail.setPurpose(createConsentPurpose(consent.getPurposeId()));
				if (consent.getFiDataRangeFrom() != null)
					fromDate = consent.getFiDataRangeFrom();
				if (consent.getFiDataRangeTo() != null)
					toDate =consent.getFiDataRangeTo();
				consentdetail.setFiDataRange(new FIDataRange(fromDate, toDate));
				if (consent.getDataLifeUnit() != null)
					consentdetail.setDataLife(new DataLife(DataLifeUnit.valueOf(consent.getDataLifeUnit()), consent.getDataLifeValue()));
				if (consent.getFrequencyUnit() != null)
					consentdetail.setFrequency(new Frequency(FrequencyUnitEnums.valueOf(consent.getFrequencyUnit()), consent.getFrequencyValue()));
				if (consent.getDataFilter() != null && consent.getDataFilter().isEmpty() == false)
					consentdetail.setDataFilter(Stream.of(consent.getDataFilter().split("\\|")).filter(i -> i != null).map(i -> createDataFilter(i)).collect(Collectors.toList()));
                consentdetail.setFetchType(consent.getFetchType());
				//List<String> accid=new ArrayList<>();
			
				consentdetail.setAccountIds(accids);
				consentdetail.setPurposeId(consent.getPurposeId());
				List<Accounts> accts=getacc(accids);
				consentdetail.setAccounts(accts);
				cons.setConsentdetail(consentdetail);
		return cons;
		//return null;
		
	}
	public DataFilter createDataFilter(String dataFilter) {
	//	LOGGER.info("inside createDataFilter method");
		String[] filters = dataFilter.split(",");
		if (filters.length == 3 && filters[0] != null)
			return new DataFilter(DataFilterType.valueOf(filters[0]), filters[1], filters[2]);
		return null;
	}
	private ConsentPurpose createConsentPurpose(String purposeId) {
		// TODO Auto-generated method stub
		PurposeModel purposeModel=fiudao.getPurpose(purposeId);
			ConsentPurpose purpose = new ConsentPurpose();
			purpose.setCode(purposeModel.getCode());
			purpose.setRefUri(purposeModel.getRefUri());
			purpose.setText(purposeModel.getText());
			purpose.setCategoryType(new ConsentPurposeCategory(purposeModel.getCategoryType()));
			return purpose;
		}
	public void mapAccountIdsToArtefactId(String artefactid, List<Accounts> acc) {
	
		acc.stream().map(account -> saveConsentAccounts(artefactid, account)).collect(Collectors.toList());
		
	}
	private ConsentApproveModel saveConsentAccounts(String artefactId, Accounts account) {
	//	LOGGER.info("inside saveConsentAccounts method");
		ConsentApproveModel consentAccount = new ConsentApproveModel();
		consentAccount.setArtefactId(artefactId);
		consentAccount.setAccountId(account.getAccountId());
		consentAccount.setAccountStatus("ACTIVE");
		consentAccount.setFipId(account.getFipId());
		return fiudao.saveConsentAccount(consentAccount);
	}
	public List<ConsentArtefactModel> getByid(String id) {
		// TODO Auto-generated method stub
		return fiudao.findbyid(id);
	}
	public List <ConsentApproveModel> getapprove(String id) {
		// TODO Auto-generated method stub
		return fiudao.getapprove(id);
	}
	public Fip getFipModel(String fipId) {
		// TODO Auto-generated method stub
		return fiudao.getfipmodel(fipId);
	}
	public FIResponse savefirequest(FIRequest req) {
		// TODO Auto-generated method stub
	 FIRequestModel request=saverequest(req);
	 FIResponse firesponse=new FIResponse();
	 firesponse.setConsentId(request.getConsentId());
	 firesponse.setSessionId(request.getSessionId());
	 firesponse.setTimestamp(request.getTimestamp());
	 firesponse.setTransactionId(request.getTxnId());
	 firesponse.setVersion(req.getVersion());
	 return firesponse;
		
	}
	private FIRequestModel saverequest(FIRequest fiRequest) {
		FIRequestModel fiRequestModel = new FIRequestModel();
		fiRequestModel.setTxnId(fiRequest.getTransactionId());
		fiRequestModel.setCustomerId("abc@nadl");
		fiRequestModel.setTimestamp(fiRequest.getTimestamp());
		fiRequestModel.setConsentId(fiRequest.getConsent().getId());
		fiRequestModel.setSessionId(String.valueOf(UUID.randomUUID()));
		fiRequestModel.setDigitalSignature(fiRequest.getConsent().getDigitalSignature());
		fiRequestModel.setFiDatarangeFrom(fiRequest.getFiDataRange().getFrom());
		fiRequestModel.setFiDatarangeTo(fiRequest.getFiDataRange().getTo());
		fiRequestModel.setCryptoAlg(fiRequest.getKeyMaterial().getCryptoAlg());
		fiRequestModel.setCurve(fiRequest.getKeyMaterial().getCurve());
		fiRequestModel.setParams(fiRequest.getKeyMaterial().getParams());
		fiRequestModel.setDhPublickeyExpiry(fiRequest.getKeyMaterial().getDhPublicKey().getExpiry());
		fiRequestModel.setDhPublickeyKeyvalue(fiRequest.getKeyMaterial().getDhPublicKey().getKeyValue());
		fiRequestModel.setDhPublickeyParameters(fiRequest.getKeyMaterial().getDhPublicKey().getParameters());
		fiRequestModel.setNonce(fiRequest.getKeyMaterial().getNonce());
		fiRequestModel.setSignature(fiRequest.getKeyMaterial().getSignature());
		fiRequestModel.setStatus(FIRequestStatusEnums.PENDING);
		return fiudao.saverequest(fiRequestModel);
	}
	public IndividualReturnValue addcustomer(RegisterReq reg) {
		
		IndividualReturnValue returnValue = null;
		RejectionResponse rejectionRes = null;
		//validateRegistrationData(reg);
		Customers cust = fiudao.saveCustomers(reg,CustomerType.INDIVIDUAL);
		Individual individual = fiudao.saveIndividual(cust.getCustomerId(), reg);
		//EndUserRequest req= createEndUserRequest(reg, cust);
		//updateCustomerAccRefId("123", cust.getCustomerId(), createSubject(cust).getId());
	    ResponseEntity<EndUserReturnValue> endUserReturnValue = registerUserInAuthServer(createEndUserRequest(reg, cust), null);
		System.out.println("result is"+endUserReturnValue.getBody());
		return null;
	}
	private IndividualReturnValue populateIndividualReturnValue(Customers cust, Individual individual,
			RejectionResponse rejectionRes,RegisterReq req) {
		// TODO Auto-generated method stub
		IndividualReturnValue returnValue = null;
		returnValue = populateCustomerData(cust,req);
		if (rejectionRes != null) {
			List<RejectionResponse> rejections = new ArrayList<>();
			rejections.add(rejectionRes);
			returnValue.setRejections(rejections);
		}
		returnValue.setHttpStatus(HttpStatus.OK);
		returnValue.setObject("Individual");
		return returnValue;
		//return null;
	}
	private IndividualReturnValue populateCustomerData(Customers customer, RegisterReq req) {
		// TODO Auto-generated method stub
		IndividualReturnValue returnValue = new IndividualReturnValue();
		returnValue.setId(customer.getCustomerId());
		returnValue.setEmailID(customer.getEmailId());
		returnValue.setVua(customer.getVua());
		returnValue.setMobileNo(customer.getMobileNo());
		returnValue.setIsEmailActivated(customer.isEmailValidated());
		returnValue.setDob(req.getDob());
	//	returnValue.setRejections(rejections);
		returnValue.setAgreedTermsAndConditions(req.getAgreedTermsAndConditions());
		returnValue.setOVDs(req.getOvds());
		returnValue.setFirstName(req.getFirstName());
		returnValue.setMiddleName(req.getMiddleName());
		returnValue.setLastName(req.getLastName());
		
	//	returnValue.setCreatedOn(DateUtils.convertDateToString(customer.getCreatedAt()));
		//returnValue.setModifiedOn(DateUtils.convertDateToString(customer.getModifiedAt()));
		returnValue.setStatus(customer.getStatus());
		return returnValue;
	}
	private ResponseEntity<EndUserReturnValue> registerUserInAuthServer(EndUserRequest createEndUserRequest, HttpHeaders haders ) {
		// TODO Auto-generated method stub
		HttpHeaders headers=new HttpHeaders();
		dto.EndUserReturnValue val=null;
		headers.setContentType(MediaType.APPLICATION_JSON);
		RestTemplate rest=new RestTemplate();
		//EndUserReturnValue ret=rest.postForObject("http://localhost:8091/api/v1/register",createEndUserRequest, EndUserReturnValue.class);
		//System.out.println(ret);
	//	ResponseEntity<dto.EndUserReturnValue> returnValue = fipserver.endUserlogin(createEndUserRequest, headers);
	//	val=returnValue.getBody();
		HttpEntity<EndUserRequest> requestEntity = new HttpEntity<EndUserRequest>(createEndUserRequest, headers);
		//System.out.println("result   ");
		ResponseEntity<EndUserReturnValue> responseEntity = rest.postForEntity("http://localhost:8091/api/v1/register", requestEntity, EndUserReturnValue.class);
		System.out.println("result is  ");
		//return null;
		return responseEntity;
	}
	private EndUserRequest createEndUserRequest(RegisterReq reg, Customers cust) {
		// TODO Auto-generated method stub
		EndUserRequest request = new EndUserRequest();
		List<EndUserAuthType> authType = new ArrayList<EndUserAuthType>(3);
		List<String> roles = new ArrayList<String>(2);
		request.setUsername(reg.getVua());
		roles.add("CUSTOMER_ROLE");
		request.setRoles(roles);
		request.setMpin(reg.getMpin());
		request.setPassword(reg.getPassword());
		if (reg.getMpin() != null)
			authType.add(EndUserAuthType.M_PIN);
		if (reg.getPassword() != null)
			authType.add(EndUserAuthType.PASSWORD);
		request.setAuthTypes(authType);
	//	request.setContext(createContext(cust));
		return request;
	}
	
	public ResponseEntity<IndividualReturnValue> Demo(RegisterReq reg ) {
		// TODO Auto-generated method stub
		HttpHeaders headers=new HttpHeaders();
		dto.EndUserReturnValue val=null;
		headers.setContentType(MediaType.APPLICATION_JSON);
		RestTemplate rest=new RestTemplate();
		//EndUserReturnValue ret=rest.postForObject("http://localhost:8091/api/v1/register",createEndUserRequest, EndUserReturnValue.class);
		//System.out.println(ret);
	//	ResponseEntity<dto.EndUserReturnValue> returnValue = fipserver.endUserlogin(createEndUserRequest, headers);
	//	val=returnValue.getBody();
		HttpEntity<RegisterReq> requestEntity = new HttpEntity<RegisterReq>(reg, headers);
		//System.out.println("result   ");
		ResponseEntity<IndividualReturnValue> responseEntity = rest.postForEntity("http://api:8091/api/v1/registerdemo", requestEntity, IndividualReturnValue.class);
		System.out.println("result is  ");
		//return null;
		return responseEntity;
	}

 /*   public Customer getCustomer(String id)
    {
    	Customer c1=new Customer("123","a","456","a123");
		Customer c2=new Customer("12345","b","6456","b123");
		Customer c3=new Customer("123456","c","8756","c123");
		Customer c4=new Customer("1256873","d","456856","d123");
    	c.add(c1);
	    c.add(c2);
	    c.add(c3);
	    c.add(c4);
    	return c.stream().filter(cus->cus.getPan().equals(id)).findFirst().get();
    }*/
}

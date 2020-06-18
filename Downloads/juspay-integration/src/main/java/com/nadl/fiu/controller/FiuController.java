package com.nadl.fiu.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.nadl.fiu.dto.AccountDetail;
import com.nadl.fiu.dto.AccountReq;
import com.nadl.fiu.dto.ConsentArtefacts;
import com.nadl.fiu.dto.ConsentDetail;
import com.nadl.fiu.dto.ConsentPurpose;
import com.nadl.fiu.dto.ConsentPurposeCategory;
import com.nadl.fiu.dto.ConsentRequest;
import com.nadl.fiu.dto.ConsentResponse;
import com.nadl.fiu.dto.ConsentStatus;
import com.nadl.fiu.dto.ConsentUse;
import com.nadl.fiu.dto.Consents;
import com.nadl.fiu.dto.CustomerSave;
import com.nadl.fiu.dto.FIRequest;
import com.nadl.fiu.dto.FIResponse;
import com.nadl.fiu.dto.FipAdd;
import com.nadl.fiu.dto.FipResponse;
import com.nadl.fiu.dto.IndividualReturnValue;
import com.nadl.fiu.dto.PurposeCategory;
import com.nadl.fiu.dto.RegisterReq;
import com.nadl.fiu.model.Account;
import com.nadl.fiu.model.AccountModel;
import com.nadl.fiu.model.Accounts;
import com.nadl.fiu.model.ConsentApproveModel;
import com.nadl.fiu.model.ConsentArtefactModel;
import com.nadl.fiu.model.ConsentRequestModel;
import com.nadl.fiu.model.Customer;
import com.nadl.fiu.model.Fip;
import com.nadl.fiu.model.FipModel;
import com.nadl.fiu.model.PurposeModel;
import com.nadl.fiu.service.FiuService;
import com.nadl.fiu.service.FiuServiceImp;
@RestController
@CrossOrigin(origins="http://localhost:4300")  
public class FiuController {
	private static final Logger LOGGER = LogManager.getLogger(FiuController.class);
	@Autowired FiuService fiuservice;
	
	@RequestMapping(value="api/v1/session/init", method = RequestMethod.POST)
	public<T>ResponseEntity<T>init(@RequestParam String mobileNumber,@RequestParam String pan,@RequestParam String timestamp)
	{
		System.out.println("inside controller");
		Customer c=new Customer();
		c.setCustomerId(pan+"@nadl");
		c.setMobileNumber(mobileNumber);
	    fiuservice.CustomerSave(c);
	    String str=fiuservice.generateSessionKey(c);
	    System.out.println(str);
	    HttpHeaders headers=new HttpHeaders(); 
		headers.add("header", str);
		CustomerSave cs=new CustomerSave();
		cs.setCustomerInfo(c);
		cs.setSessionTocken(str);
		return  new ResponseEntity<T>((T)cs, headers,HttpStatus.OK);
		
	}
	@RequestMapping(value="/api/v1/fip", method = RequestMethod.POST)
	public<T>ResponseEntity<T>getfip(@RequestBody FipModel fip)
	{
		 System.out.println("inside fip");
		// System.out.println(fip.getFipModel().getFip_id());
		 fiuservice.addfip(fip);
		 HttpHeaders headers=new HttpHeaders(); 
	     headers.add("header", "str");
		 return new ResponseEntity<T>((T)"fipadded",headers,HttpStatus.OK);
	}
	@RequestMapping(value="/api/v1/fip/list", method = RequestMethod.GET)
	public List <FipModel> getfip(HttpServletRequest request)
	{    
		//String tocken=request.getHeader("sessionTocken");
		//if(tocken==null)
		//{
		 //return new ResponseEntity<T>((T)"no session tocken",HttpStatus.NOT_FOUND);	
		//}
		
		//Customer c=fiuservice.validateTocken(tocken);
	//	System.out.println(c.getCustomerId());
		//if(c==null)
		//{
			//return new ResponseEntity<T>((T)"not authenticated",HttpStatus.NOT_FOUND);
		//}
		
		//else
		//{
		List<FipModel> fip=fiuservice.getfip();
		 HttpHeaders headers=new HttpHeaders(); 
	     headers.add("header", "str");
	     return fip;
		// return new ResponseEntity<T>((T)fip,HttpStatus.OK);
	}
	@RequestMapping(value="/api/v1/account/discovery", method = RequestMethod.GET)
	@ResponseBody
	public Account accountdiscovery(@RequestParam("id") String id )
	{    
		//String tocken=request.getHeader("sessionTocken");
		//if(tocken==null)
		//{
		 //return new ResponseEntity<T>((T)"no session tocken",HttpStatus.NOT_FOUND);	
		//}
		
		//Customer c=fiuservice.validateTocken(tocken);
	//	System.out.println(c.getCustomerId());
		//if(c==null)
		//{
			//return new ResponseEntity<T>((T)"not authenticated",HttpStatus.NOT_FOUND);
		//}
		
		//else
		//{
		Account acc=fiuservice.getaccount(id);
		 HttpHeaders headers=new HttpHeaders(); 
	     headers.add("header", "str");
	     return acc;
		// return new ResponseEntity<T>((T)fip,HttpStatus.OK);
	}
	@RequestMapping(value="/api/v1/account/link", method = RequestMethod.POST)
	public List<AccountModel> linkaccount(@RequestBody AccountReq req )
	{    
		//String tocken=request.getHeader("sessionTocken");
		//if(tocken==null)
		//{
		 //return new ResponseEntity<T>((T)"no session tocken",HttpStatus.NOT_FOUND);	
		//}
		
		//Customer c=fiuservice.validateTocken(tocken);
	//	System.out.println(c.getCustomerId());
		//if(c==null)
		//{
			//return new ResponseEntity<T>((T)"not authenticated",HttpStatus.NOT_FOUND);
		//}
		
		//else
		//{
		List <AccountModel> acc=fiuservice.linkaccount(req);
	    return acc;

	
	    }
	@RequestMapping(value="/api/v1/consent/request", method = RequestMethod.POST)
	public ConsentResponse createconsent(@RequestBody ConsentRequest req )
	{
	 
     List<Accounts> acc=fiuservice.getaccount(req);
     String fipid=null;
     for(Accounts fip:acc)
     {
    	 fipid=fip.getFipId();
     }
     ConsentRequestModel approvedConsent = fiuservice.saveConsentRequest(req);
     List<Account> accdetail=new ArrayList<Account>();
     List<String> accid=new ArrayList<>();
     int i=0;
     for(Accounts accids:acc)
     {
    	 accid.add(accids.getAccountId());
     }
     
     System.out.println(fipid);
     ConsentResponse res=new ConsentResponse();
     ConsentArtefacts artefacts=new ConsentArtefacts();
     System.out.println(req.getConsentdetail().getPurposeId());
     PurposeModel purp=fiuservice.getPurpose(req.getConsentdetail().getPurposeId());
     ConsentPurpose purpose=new ConsentPurpose();
     purpose.setPurposeId(purp.getPurposeId());
     purpose.setCode(purp.getCode());
	 purpose.setRefUri(purp.getRefUri());
	 purpose.setText(purp.getText());
	 ConsentPurposeCategory category = new ConsentPurposeCategory();
	 category.setCategoryType(purp.getCategoryType());
	 purpose.setCategoryType(category);
     res.setVersion(req.getVersion());
     res.setConsentId(approvedConsent.getConsentId());
     res.setTransactionId(req.getTxnid());
 	ConsentArtefactModel consentArtefact = new ConsentArtefactModel();
	consentArtefact.setConsentId(approvedConsent.getConsentId());
	consentArtefact.setTxnId(String.valueOf(UUID.randomUUID()));
	consentArtefact.setFipId(fipid);
	consentArtefact.setArtefactStatus(ConsentStatus.APPROVED.name());
	consentArtefact.setDigitalSignature("signature");
	consentArtefact.setIsDeleted(0);
	ConsentArtefactModel artefact=fiuservice.saveArtefact(consentArtefact);
	artefacts.setId(artefact.getConsentId());
	artefacts.setDigitalsignature(artefact.getDigitalSignature());
	artefacts.setFip_id(artefact.getFipId());
	artefacts.setStatus(artefact.getArtefactStatus());
    res.setConsentArtefacts(artefacts);
    String artefactid=artefact.getArtefactId();
    fiuservice.mapAccountIdsToArtefactId(artefactid,acc);
    ConsentDetail consentdetail=new ConsentDetail();
     consentdetail.setAccounts(acc);
     consentdetail.setConsentExpiry(req.getConsentdetail().getConsentExpiry());
     consentdetail.setConsentMode(req.getConsentdetail().getConsentMode());
     consentdetail.setConsentStart(req.getConsentdetail().getConsentStart());
     consentdetail.setConsentTypes(req.getConsentdetail().getConsentTypes());
     consentdetail.setCustomer(req.getConsentdetail().getCustomer());
     consentdetail.setDataConsumer(req.getConsentdetail().getDataConsumer());
     consentdetail.setDataFilter(req.getConsentdetail().getDataFilter());
     consentdetail.setDataLife(req.getConsentdetail().getDataLife());
     consentdetail.setDataProvider(req.getConsentdetail().getDataProvider());
     consentdetail.setFetchType(req.getConsentdetail().getFetchType());
     consentdetail.setFiTypes(req.getConsentdetail().getFiTypes());
     consentdetail.setFrequency(req.getConsentdetail().getFrequency());
     consentdetail.setFiDataRange(req.getConsentdetail().getFiDataRange());
     consentdetail.setPurpose(purpose);
     consentdetail.setPurposeId(req.getConsentdetail().getPurposeId());
     consentdetail.setAccountIds(accid);
     res.setConsentDetail(consentdetail);
     res.setStatus(ConsentStatus.ACTIVE);
     res.setConsentHandle(approvedConsent.getConsentHandle());
     res.setCreateTimeStamp(String.valueOf(new Date()));
     res.setConsentDetailDigitalSignature("signature");
     res.setVersion("v1");
     res.setTransactionId(String.valueOf(UUID.randomUUID()));
     
     ConsentUse use=new ConsentUse();
     use.setCount(1);
     use.setLastUseDateTime("10-04-2020");
     use.setLogUri("log");
     res.setConsentUse(use);
     return res;
		
		
	    

	
	    }
	
	@RequestMapping(value="/api/v1/consent/getall", method = RequestMethod.GET)
	public Consents getconsents(HttpServletRequest request)
	{    
		
		
		
		
		
		//String tocken=request.getHeader("sessionTocken");
		//if(tocken==null)
		//{
		 //return new ResponseEntity<T>((T)"no session tocken",HttpStatus.NOT_FOUND);	
		//}
		
		//Customer c=fiuservice.validateTocken(tocken);
	//	System.out.println(c.getCustomerId());
		//if(c==null)
		//{
			//return new ResponseEntity<T>((T)"not authenticated",HttpStatus.NOT_FOUND);
		//}
		
		//else
		//{
		ConsentRequestModel consent=fiuservice.getConsent();
		String id=consent.getConsentId();
		List<ConsentArtefactModel> approve=fiuservice.getByid(id);
		List<String> accid=new ArrayList<>();
		String artids=null;
		for(ConsentArtefactModel ids:approve)
		{
			artids=ids.getArtefactId();
		}
		List<ConsentApproveModel> app=fiuservice.getapprove(artids);
		for(ConsentApproveModel appr:app)
		{
			accid.add(appr.getAccountId());
		}
			Consents consents=fiuservice.getall(consent,accid);
	     return consents;
		// return new ResponseEntity<T>((T)fip,HttpStatus.OK);
	}
	
	
	@RequestMapping(value = "/api/v1/FIPs/fi-request", method = RequestMethod.POST)
	public FIResponse FIRequests (@RequestBody FIRequest  req )
	{
		//Fip fipModel = fiuservice.getFipModel(req.getFipId());
	    FIResponse response=fiuservice.savefirequest(req);
	    return response;
	
	}
	@RequestMapping(value="/api/v1/individuals", method = RequestMethod.POST)
	public<T>ResponseEntity<T>register(@RequestBody RegisterReq reg )
	{
		// System.out.println("inside fip");
		// System.out.println(fip.getFipModel().getFip_id());
		IndividualReturnValue in= fiuservice.addcustomer(reg);
		 HttpHeaders headers=new HttpHeaders(); 
	     headers.add("header", "str");
		 return new ResponseEntity<T>((T)in,headers,HttpStatus.OK);
	}

@RequestMapping(value="/api/v1/individuals/demo", method = RequestMethod.POST)
public IndividualReturnValue registerdemo(@RequestBody RegisterReq reg )
{
	// System.out.println("inside fip");
	// System.out.println(fip.getFipModel().getFip_id());
	ResponseEntity<IndividualReturnValue> in= fiuservice.Demo(reg);
	 HttpHeaders headers=new HttpHeaders(); 
     headers.add("header", "str");
     IndividualReturnValue ind=in.getBody();
	// return new ResponseEntity<T>((T)in,headers,HttpStatus.OK);
     return ind;
}
}

	
	

	//}
		/*public <T>ResponseEntity<T> getAccounts(HttpServletRequest request)
		{    
			String tocken=request.getHeader("sessionTocken");
			if(tocken==null)
			{
			 return new ResponseEntity<T>((T)"no session tocken",HttpStatus.NOT_FOUND);	
			}
			
			Customer c=fiuservice.validateTocken(tocken);
		//	System.out.println(c.getCustomerId());
			if(c==null)
			{
				return new ResponseEntity<T>((T)"not authenticated",HttpStatus.NOT_FOUND);
			}
			
			else
			{
			List<FipModel> fip=fiuservice.getfip();
			 HttpHeaders headers=new HttpHeaders(); 
		     headers.add("header", "str");
			 return new ResponseEntity<T>((T)fip,HttpStatus.OK);
		}
}*/

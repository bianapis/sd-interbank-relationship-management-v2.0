/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.bian.dto.*;
import org.bian.util.JsonReader;
import com.fasterxml.jackson.core.type.TypeReference;

@Service
public class InterbankRelationshipManagementApiServiceImpl implements InterbankRelationshipManagementApiService {

	public SDInterbankRelationshipManagementActivateOutputModel activate(SDInterbankRelationshipManagementActivateInputModel request){
		return JsonReader.read("activate-SDInterbankRelationshipManagementActivateOutputModel.json",new TypeReference<SDInterbankRelationshipManagementActivateOutputModel>(){});
	}
	
	public SDInterbankRelationshipManagementConfigureOutputModel configure(String sdReferenceId, SDInterbankRelationshipManagementConfigureInputModel request){
		return JsonReader.read("configure-SDInterbankRelationshipManagementConfigureOutputModel.json",new TypeReference<SDInterbankRelationshipManagementConfigureOutputModel>(){});
	}
	
	public CRBankRelationshipManagementPlanControlOutputModel control(String sdReferenceId, String crReferenceId, CRBankRelationshipManagementPlanControlInputModel request){
		return JsonReader.read("control-CRBankRelationshipManagementPlanControlOutputModel.json",new TypeReference<CRBankRelationshipManagementPlanControlOutputModel>(){});
	}
	
	public CRBankRelationshipManagementPlanCreateOutputModel create(String sdReferenceId, CRBankRelationshipManagementPlanCreateInputModel request){
		return JsonReader.read("create-CRBankRelationshipManagementPlanCreateOutputModel.json",new TypeReference<CRBankRelationshipManagementPlanCreateOutputModel>(){});
	}
	
	public BQContactCreateOutputModel createContact(String sdReferenceId, String crReferenceId, BQContactCreateInputModel request){
		return JsonReader.read("create-BQContactCreateOutputModel.json",new TypeReference<BQContactCreateOutputModel>(){});
	}
	
	public CRBankRelationshipManagementPlanExchangeOutputModel exchange(String sdReferenceId, String crReferenceId, CRBankRelationshipManagementPlanExchangeInputModel request){
		return JsonReader.read("exchange-CRBankRelationshipManagementPlanExchangeOutputModel.json",new TypeReference<CRBankRelationshipManagementPlanExchangeOutputModel>(){});
	}
	
	public SDInterbankRelationshipManagementFeedbackOutputModel feedback(String sdReferenceId, SDInterbankRelationshipManagementFeedbackInputModel request){
		return JsonReader.read("feedback-SDInterbankRelationshipManagementFeedbackOutputModel.json",new TypeReference<SDInterbankRelationshipManagementFeedbackOutputModel>(){});
	}
	
	public CRBankRelationshipManagementPlanGrantOutputModel grant(String sdReferenceId, String crReferenceId, CRBankRelationshipManagementPlanGrantInputModel request){
		return JsonReader.read("grant-CRBankRelationshipManagementPlanGrantOutputModel.json",new TypeReference<CRBankRelationshipManagementPlanGrantOutputModel>(){});
	}
	
	public BQContactRequestOutputModel requestContact(String sdReferenceId, String crReferenceId, String bqReferenceId, BQContactRequestInputModel request){
		return JsonReader.read("request-BQContactRequestOutputModel.json",new TypeReference<BQContactRequestOutputModel>(){});
	}
	
	public CRBankRelationshipManagementPlanRequestOutputModel request(String sdReferenceId, String crReferenceId, CRBankRelationshipManagementPlanRequestInputModel request){
		return JsonReader.read("request-CRBankRelationshipManagementPlanRequestOutputModel.json",new TypeReference<CRBankRelationshipManagementPlanRequestOutputModel>(){});
	}
	
	public BQContactRetrieveOutputModel retrieveContact(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQContactRetrieveOutputModel.json",new TypeReference<BQContactRetrieveOutputModel>(){});
	}
	
	public CRBankRelationshipManagementPlanRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId){
		return JsonReader.read("retrieve-CRBankRelationshipManagementPlanRetrieveOutputModel.json",new TypeReference<CRBankRelationshipManagementPlanRetrieveOutputModel>(){});
	}
	
	public List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier){
		return JsonReader.read("retrieveBQIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveBQs(){
		return JsonReader.read("retrieveBQs-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveRefIds(String sdReferenceId){
		return JsonReader.read("retrieveRefIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public SDInterbankRelationshipManagementRetrieveOutputModel retrieveSD(String sdReferenceId){
		return JsonReader.read("retrieveSD-SDInterbankRelationshipManagementRetrieveOutputModel.json",new TypeReference<SDInterbankRelationshipManagementRetrieveOutputModel>(){});
	}
	
	public CRBankRelationshipManagementPlanUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRBankRelationshipManagementPlanUpdateInputModel request){
		return JsonReader.read("update-CRBankRelationshipManagementPlanUpdateOutputModel.json",new TypeReference<CRBankRelationshipManagementPlanUpdateOutputModel>(){});
	}
	
	public BQContactUpdateOutputModel updateContact(String sdReferenceId, String crReferenceId, String bqReferenceId, BQContactUpdateInputModel request){
		return JsonReader.read("update-BQContactUpdateOutputModel.json",new TypeReference<BQContactUpdateOutputModel>(){});
	}
	
}

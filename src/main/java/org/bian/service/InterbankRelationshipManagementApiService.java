/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.bian.dto.*;

public interface InterbankRelationshipManagementApiService {

	SDInterbankRelationshipManagementActivateOutputModel activate(SDInterbankRelationshipManagementActivateInputModel request);
	
	SDInterbankRelationshipManagementConfigureOutputModel configure(String sdReferenceId, SDInterbankRelationshipManagementConfigureInputModel request);
	
	CRBankRelationshipManagementPlanControlOutputModel control(String sdReferenceId, String crReferenceId, CRBankRelationshipManagementPlanControlInputModel request);
	
	CRBankRelationshipManagementPlanCreateOutputModel create(String sdReferenceId, CRBankRelationshipManagementPlanCreateInputModel request);
	
	BQContactCreateOutputModel createContact(String sdReferenceId, String crReferenceId, BQContactCreateInputModel request);
	
	CRBankRelationshipManagementPlanExchangeOutputModel exchange(String sdReferenceId, String crReferenceId, CRBankRelationshipManagementPlanExchangeInputModel request);
	
	SDInterbankRelationshipManagementFeedbackOutputModel feedback(String sdReferenceId, SDInterbankRelationshipManagementFeedbackInputModel request);
	
	CRBankRelationshipManagementPlanGrantOutputModel grant(String sdReferenceId, String crReferenceId, CRBankRelationshipManagementPlanGrantInputModel request);
	
	BQContactRequestOutputModel requestContact(String sdReferenceId, String crReferenceId, String bqReferenceId, BQContactRequestInputModel request);
	
	CRBankRelationshipManagementPlanRequestOutputModel request(String sdReferenceId, String crReferenceId, CRBankRelationshipManagementPlanRequestInputModel request);
	
	BQContactRetrieveOutputModel retrieveContact(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	CRBankRelationshipManagementPlanRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId);
	
	List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier);
	
	List<String> retrieveBQs();
	
	List<String> retrieveRefIds(String sdReferenceId);
	
	SDInterbankRelationshipManagementRetrieveOutputModel retrieveSD(String sdReferenceId);
	
	CRBankRelationshipManagementPlanUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRBankRelationshipManagementPlanUpdateInputModel request);
	
	BQContactUpdateOutputModel updateContact(String sdReferenceId, String crReferenceId, String bqReferenceId, BQContactUpdateInputModel request);
	
}

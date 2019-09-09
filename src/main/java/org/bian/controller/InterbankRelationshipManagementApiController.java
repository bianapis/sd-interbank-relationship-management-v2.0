/**
 * @author Virtusa
 */
package org.bian.controller;

import java.util.List;
import org.bian.annotation.BianRestController;
import org.bian.annotation.BQ;
import org.bian.dto.BianRequest;
import org.bian.dto.BianResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.bian.dto.*;
import org.bian.service.*;
import org.bian.annotation.functionalpattern.Manage;

@BianRestController
public class InterbankRelationshipManagementApiController {

	@Autowired
	InterbankRelationshipManagementApiService service;
	
	@Manage.Activate
	public BianResponse<SDInterbankRelationshipManagementActivateOutputModel> activate(@RequestBody BianRequest<SDInterbankRelationshipManagementActivateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.activate(bianRequest.getData()));
	}
	
	@Manage.Configure
	public BianResponse<SDInterbankRelationshipManagementConfigureOutputModel> configure(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<SDInterbankRelationshipManagementConfigureInputModel> bianRequest) {
		return BianResponse.forSuccess(service.configure(sdReferenceId, bianRequest.getData()));
	}
	
	@Manage.Control
	public BianResponse<CRBankRelationshipManagementPlanControlOutputModel> control(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRBankRelationshipManagementPlanControlInputModel> bianRequest) {
		return BianResponse.forSuccess(service.control(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@Manage.Create
	public BianResponse<CRBankRelationshipManagementPlanCreateOutputModel> create(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<CRBankRelationshipManagementPlanCreateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.create(sdReferenceId, bianRequest.getData()));
	}
	
	@BQ("contact")
	@Manage.Create
	public BianResponse<BQContactCreateOutputModel> createContact(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<BQContactCreateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.createContact(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@Manage.Exchange
	public BianResponse<CRBankRelationshipManagementPlanExchangeOutputModel> exchange(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRBankRelationshipManagementPlanExchangeInputModel> bianRequest) {
		return BianResponse.forSuccess(service.exchange(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@Manage.Feedback
	public BianResponse<SDInterbankRelationshipManagementFeedbackOutputModel> feedback(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<SDInterbankRelationshipManagementFeedbackInputModel> bianRequest) {
		return BianResponse.forSuccess(service.feedback(sdReferenceId, bianRequest.getData()));
	}
	
	@Manage.Grant
	public BianResponse<CRBankRelationshipManagementPlanGrantOutputModel> grant(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRBankRelationshipManagementPlanGrantInputModel> bianRequest) {
		return BianResponse.forSuccess(service.grant(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("contact")
	@Manage.Request
	public BianResponse<BQContactRequestOutputModel> requestContact(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQContactRequestInputModel> bianRequest) {
		return BianResponse.forSuccess(service.requestContact(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@Manage.Request
	public BianResponse<CRBankRelationshipManagementPlanRequestOutputModel> request(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRBankRelationshipManagementPlanRequestInputModel> bianRequest) {
		return BianResponse.forSuccess(service.request(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("contact")
	@Manage.Retrieve
	public BianResponse<BQContactRetrieveOutputModel> retrieveContact(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveContact(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@Manage.Retrieve
	public BianResponse<CRBankRelationshipManagementPlanRetrieveOutputModel> retrieve(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId) {
		return BianResponse.forSuccess(service.retrieve(sdReferenceId, crReferenceId));
	}
	
	@Manage.RetrieveBQIds
	public BianResponse<List<String>> retrieveBQIds(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("behavior-qualifier") String behaviorQualifier) {
		return BianResponse.forSuccess(service.retrieveBQIds(sdReferenceId, crReferenceId, behaviorQualifier));
	}
	
	@Manage.RetrieveBQs
	public BianResponse<List<String>> retrieveBQs() {
		return BianResponse.forSuccess(service.retrieveBQs());
	}
	
	@Manage.RetrieveRefIds
	public BianResponse<List<String>> retrieveRefIds(@PathVariable("sd-reference-id") String sdReferenceId) {
		return BianResponse.forSuccess(service.retrieveRefIds(sdReferenceId));
	}
	
	@Manage.RetrieveSD
	public BianResponse<SDInterbankRelationshipManagementRetrieveOutputModel> retrieveSD(@PathVariable("sd-reference-id") String sdReferenceId) {
		return BianResponse.forSuccess(service.retrieveSD(sdReferenceId));
	}
	
	@Manage.Update
	public BianResponse<CRBankRelationshipManagementPlanUpdateOutputModel> update(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRBankRelationshipManagementPlanUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.update(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("contact")
	@Manage.Update
	public BianResponse<BQContactUpdateOutputModel> updateContact(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQContactUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateContact(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
}

package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRBankRelationshipManagementPlanExchangeInputModelBankRelationshipManagementPlanExchangeActionRequest;

import javax.validation.Valid;
  
/**
 * CRBankRelationshipManagementPlanExchangeInputModel
 */
public class CRBankRelationshipManagementPlanExchangeInputModel   {
  private String interbankRelationshipManagementServicingSessionReference = null;

  private String bankRelationshipManagementPlanInstanceReference = null;

  private Object bankRelationshipManagementPlanExchangeActionTaskRecord = null;

  private CRBankRelationshipManagementPlanExchangeInputModelBankRelationshipManagementPlanExchangeActionRequest bankRelationshipManagementPlanExchangeActionRequest = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return interbankRelationshipManagementServicingSessionReference
  **/

  public String getInterbankRelationshipManagementServicingSessionReference() {
    return interbankRelationshipManagementServicingSessionReference;
  }

  public void setInterbankRelationshipManagementServicingSessionReference(String interbankRelationshipManagementServicingSessionReference) {
    this.interbankRelationshipManagementServicingSessionReference = interbankRelationshipManagementServicingSessionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Bank Relationship Management Plan instance 
   * @return bankRelationshipManagementPlanInstanceReference
  **/

  public String getBankRelationshipManagementPlanInstanceReference() {
    return bankRelationshipManagementPlanInstanceReference;
  }

  public void setBankRelationshipManagementPlanInstanceReference(String bankRelationshipManagementPlanInstanceReference) {
    this.bankRelationshipManagementPlanInstanceReference = bankRelationshipManagementPlanInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record 
   * @return bankRelationshipManagementPlanExchangeActionTaskRecord
  **/

  public Object getBankRelationshipManagementPlanExchangeActionTaskRecord() {
    return bankRelationshipManagementPlanExchangeActionTaskRecord;
  }

  public void setBankRelationshipManagementPlanExchangeActionTaskRecord(Object bankRelationshipManagementPlanExchangeActionTaskRecord) {
    this.bankRelationshipManagementPlanExchangeActionTaskRecord = bankRelationshipManagementPlanExchangeActionTaskRecord;
  }


  /**
   * Get bankRelationshipManagementPlanExchangeActionRequest
   * @return bankRelationshipManagementPlanExchangeActionRequest
  **/

  public CRBankRelationshipManagementPlanExchangeInputModelBankRelationshipManagementPlanExchangeActionRequest getBankRelationshipManagementPlanExchangeActionRequest() {
    return bankRelationshipManagementPlanExchangeActionRequest;
  }

  public void setBankRelationshipManagementPlanExchangeActionRequest(CRBankRelationshipManagementPlanExchangeInputModelBankRelationshipManagementPlanExchangeActionRequest bankRelationshipManagementPlanExchangeActionRequest) {
    this.bankRelationshipManagementPlanExchangeActionRequest = bankRelationshipManagementPlanExchangeActionRequest;
  }


}


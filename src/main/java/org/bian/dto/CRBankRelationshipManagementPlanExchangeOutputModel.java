package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRBankRelationshipManagementPlanExchangeOutputModel
 */
public class CRBankRelationshipManagementPlanExchangeOutputModel   {
  private String bankRelationshipManagementPlanExchangeActionTaskReference = null;

  private Object bankRelationshipManagementPlanExchangeActionTaskRecord = null;

  private String bankRelationshipManagementPlanExchangeActionResponse = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Bank Relationship Management Plan instance exchange service call 
   * @return bankRelationshipManagementPlanExchangeActionTaskReference
  **/

  public String getBankRelationshipManagementPlanExchangeActionTaskReference() {
    return bankRelationshipManagementPlanExchangeActionTaskReference;
  }

  public void setBankRelationshipManagementPlanExchangeActionTaskReference(String bankRelationshipManagementPlanExchangeActionTaskReference) {
    this.bankRelationshipManagementPlanExchangeActionTaskReference = bankRelationshipManagementPlanExchangeActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the exchange action service response 
   * @return bankRelationshipManagementPlanExchangeActionResponse
  **/

  public String getBankRelationshipManagementPlanExchangeActionResponse() {
    return bankRelationshipManagementPlanExchangeActionResponse;
  }

  public void setBankRelationshipManagementPlanExchangeActionResponse(String bankRelationshipManagementPlanExchangeActionResponse) {
    this.bankRelationshipManagementPlanExchangeActionResponse = bankRelationshipManagementPlanExchangeActionResponse;
  }


}


package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRBankRelationshipManagementPlanControlOutputModel
 */
public class CRBankRelationshipManagementPlanControlOutputModel   {
  private String bankRelationshipManagementPlanControlActionTaskReference = null;

  private Object bankRelationshipManagementPlanControlActionTaskRecord = null;

  private String bankRelationshipManagementPlanControlActionResponse = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Bank Relationship Management Plan instance control processing service call 
   * @return bankRelationshipManagementPlanControlActionTaskReference
  **/

  public String getBankRelationshipManagementPlanControlActionTaskReference() {
    return bankRelationshipManagementPlanControlActionTaskReference;
  }

  public void setBankRelationshipManagementPlanControlActionTaskReference(String bankRelationshipManagementPlanControlActionTaskReference) {
    this.bankRelationshipManagementPlanControlActionTaskReference = bankRelationshipManagementPlanControlActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The processing control service call consolidated processing record 
   * @return bankRelationshipManagementPlanControlActionTaskRecord
  **/

  public Object getBankRelationshipManagementPlanControlActionTaskRecord() {
    return bankRelationshipManagementPlanControlActionTaskRecord;
  }

  public void setBankRelationshipManagementPlanControlActionTaskRecord(Object bankRelationshipManagementPlanControlActionTaskRecord) {
    this.bankRelationshipManagementPlanControlActionTaskRecord = bankRelationshipManagementPlanControlActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the control action service response 
   * @return bankRelationshipManagementPlanControlActionResponse
  **/

  public String getBankRelationshipManagementPlanControlActionResponse() {
    return bankRelationshipManagementPlanControlActionResponse;
  }

  public void setBankRelationshipManagementPlanControlActionResponse(String bankRelationshipManagementPlanControlActionResponse) {
    this.bankRelationshipManagementPlanControlActionResponse = bankRelationshipManagementPlanControlActionResponse;
  }


}


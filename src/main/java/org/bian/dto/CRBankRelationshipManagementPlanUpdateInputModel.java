package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRBankRelationshipManagementPlanUpdateInputModelBankRelationshipManagementPlanInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRBankRelationshipManagementPlanUpdateInputModel
 */
public class CRBankRelationshipManagementPlanUpdateInputModel   {
  private String interbankRelationshipManagementServicingSessionReference = null;

  private String bankRelationshipManagementPlanInstanceReference = null;

  private CRBankRelationshipManagementPlanUpdateInputModelBankRelationshipManagementPlanInstanceRecord bankRelationshipManagementPlanInstanceRecord = null;

  private Object bankRelationshipManagementPlanUpdateActionTaskRecord = null;

  private String updateActionRequest = null;


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
   * Get bankRelationshipManagementPlanInstanceRecord
   * @return bankRelationshipManagementPlanInstanceRecord
  **/

  public CRBankRelationshipManagementPlanUpdateInputModelBankRelationshipManagementPlanInstanceRecord getBankRelationshipManagementPlanInstanceRecord() {
    return bankRelationshipManagementPlanInstanceRecord;
  }

  public void setBankRelationshipManagementPlanInstanceRecord(CRBankRelationshipManagementPlanUpdateInputModelBankRelationshipManagementPlanInstanceRecord bankRelationshipManagementPlanInstanceRecord) {
    this.bankRelationshipManagementPlanInstanceRecord = bankRelationshipManagementPlanInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return bankRelationshipManagementPlanUpdateActionTaskRecord
  **/

  public Object getBankRelationshipManagementPlanUpdateActionTaskRecord() {
    return bankRelationshipManagementPlanUpdateActionTaskRecord;
  }

  public void setBankRelationshipManagementPlanUpdateActionTaskRecord(Object bankRelationshipManagementPlanUpdateActionTaskRecord) {
    this.bankRelationshipManagementPlanUpdateActionTaskRecord = bankRelationshipManagementPlanUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return updateActionRequest
  **/

  public String getUpdateActionRequest() {
    return updateActionRequest;
  }

  public void setUpdateActionRequest(String updateActionRequest) {
    this.updateActionRequest = updateActionRequest;
  }


}


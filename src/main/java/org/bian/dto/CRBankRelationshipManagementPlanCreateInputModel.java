package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRBankRelationshipManagementPlanCreateInputModelBankRelationshipManagementPlanInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRBankRelationshipManagementPlanCreateInputModel
 */
public class CRBankRelationshipManagementPlanCreateInputModel   {
  private String interbankRelationshipManagementServicingSessionReference = null;

  private Object bankRelationshipManagementPlanCreateActionRecord = null;

  private String bankRelationshipManagementPlanInstanceStatus = null;

  private CRBankRelationshipManagementPlanCreateInputModelBankRelationshipManagementPlanInstanceRecord bankRelationshipManagementPlanInstanceRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Create service call input and output record 
   * @return bankRelationshipManagementPlanCreateActionRecord
  **/

  public Object getBankRelationshipManagementPlanCreateActionRecord() {
    return bankRelationshipManagementPlanCreateActionRecord;
  }

  public void setBankRelationshipManagementPlanCreateActionRecord(Object bankRelationshipManagementPlanCreateActionRecord) {
    this.bankRelationshipManagementPlanCreateActionRecord = bankRelationshipManagementPlanCreateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Bank Relationship Management Plan instance (e.g. initialised, pending, active) 
   * @return bankRelationshipManagementPlanInstanceStatus
  **/

  public String getBankRelationshipManagementPlanInstanceStatus() {
    return bankRelationshipManagementPlanInstanceStatus;
  }

  public void setBankRelationshipManagementPlanInstanceStatus(String bankRelationshipManagementPlanInstanceStatus) {
    this.bankRelationshipManagementPlanInstanceStatus = bankRelationshipManagementPlanInstanceStatus;
  }


  /**
   * Get bankRelationshipManagementPlanInstanceRecord
   * @return bankRelationshipManagementPlanInstanceRecord
  **/

  public CRBankRelationshipManagementPlanCreateInputModelBankRelationshipManagementPlanInstanceRecord getBankRelationshipManagementPlanInstanceRecord() {
    return bankRelationshipManagementPlanInstanceRecord;
  }

  public void setBankRelationshipManagementPlanInstanceRecord(CRBankRelationshipManagementPlanCreateInputModelBankRelationshipManagementPlanInstanceRecord bankRelationshipManagementPlanInstanceRecord) {
    this.bankRelationshipManagementPlanInstanceRecord = bankRelationshipManagementPlanInstanceRecord;
  }


}


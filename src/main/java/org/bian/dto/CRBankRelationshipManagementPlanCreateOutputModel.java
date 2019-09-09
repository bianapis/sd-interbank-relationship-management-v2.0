package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRBankRelationshipManagementPlanCreateOutputModelBankRelationshipManagementPlanInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRBankRelationshipManagementPlanCreateOutputModel
 */
public class CRBankRelationshipManagementPlanCreateOutputModel   {
  private String bankRelationshipManagementPlanInstanceReference = null;

  private String bankRelationshipManagementPlanCreateActionReference = null;

  private Object bankRelationshipManagementPlanCreateActionRecord = null;

  private String bankRelationshipManagementPlanInstanceStatus = null;

  private CRBankRelationshipManagementPlanCreateOutputModelBankRelationshipManagementPlanInstanceRecord bankRelationshipManagementPlanInstanceRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Create service call 
   * @return bankRelationshipManagementPlanCreateActionReference
  **/

  public String getBankRelationshipManagementPlanCreateActionReference() {
    return bankRelationshipManagementPlanCreateActionReference;
  }

  public void setBankRelationshipManagementPlanCreateActionReference(String bankRelationshipManagementPlanCreateActionReference) {
    this.bankRelationshipManagementPlanCreateActionReference = bankRelationshipManagementPlanCreateActionReference;
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

  public CRBankRelationshipManagementPlanCreateOutputModelBankRelationshipManagementPlanInstanceRecord getBankRelationshipManagementPlanInstanceRecord() {
    return bankRelationshipManagementPlanInstanceRecord;
  }

  public void setBankRelationshipManagementPlanInstanceRecord(CRBankRelationshipManagementPlanCreateOutputModelBankRelationshipManagementPlanInstanceRecord bankRelationshipManagementPlanInstanceRecord) {
    this.bankRelationshipManagementPlanInstanceRecord = bankRelationshipManagementPlanInstanceRecord;
  }


}


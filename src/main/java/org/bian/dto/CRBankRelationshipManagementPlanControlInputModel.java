package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRBankRelationshipManagementPlanControlInputModelBankRelationshipManagementPlanControlActionRequest;

import javax.validation.Valid;
  
/**
 * CRBankRelationshipManagementPlanControlInputModel
 */
public class CRBankRelationshipManagementPlanControlInputModel   {
  private String interbankRelationshipManagementServicingSessionReference = null;

  private String bankRelationshipManagementPlanInstanceReference = null;

  private Object bankRelationshipManagementPlanControlActionTaskRecord = null;

  private CRBankRelationshipManagementPlanControlInputModelBankRelationshipManagementPlanControlActionRequest bankRelationshipManagementPlanControlActionRequest = null;


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
   * Get bankRelationshipManagementPlanControlActionRequest
   * @return bankRelationshipManagementPlanControlActionRequest
  **/

  public CRBankRelationshipManagementPlanControlInputModelBankRelationshipManagementPlanControlActionRequest getBankRelationshipManagementPlanControlActionRequest() {
    return bankRelationshipManagementPlanControlActionRequest;
  }

  public void setBankRelationshipManagementPlanControlActionRequest(CRBankRelationshipManagementPlanControlInputModelBankRelationshipManagementPlanControlActionRequest bankRelationshipManagementPlanControlActionRequest) {
    this.bankRelationshipManagementPlanControlActionRequest = bankRelationshipManagementPlanControlActionRequest;
  }


}


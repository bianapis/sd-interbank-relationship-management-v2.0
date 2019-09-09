package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRBankRelationshipManagementPlanRequestInputModelBankRelationshipManagementPlanInstanceRecord;
import org.bian.dto.CRBankRelationshipManagementPlanRequestInputModelRequestRecordType;

import javax.validation.Valid;
  
/**
 * CRBankRelationshipManagementPlanRequestInputModel
 */
public class CRBankRelationshipManagementPlanRequestInputModel   {
  private String interbankRelationshipManagementServicingSessionReference = null;

  private String bankRelationshipManagementPlanInstanceReference = null;

  private CRBankRelationshipManagementPlanRequestInputModelBankRelationshipManagementPlanInstanceRecord bankRelationshipManagementPlanInstanceRecord = null;

  private Object bankRelationshipManagementPlanRequestActionTaskRecord = null;

  private CRBankRelationshipManagementPlanRequestInputModelRequestRecordType requestRecordType = null;


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

  public CRBankRelationshipManagementPlanRequestInputModelBankRelationshipManagementPlanInstanceRecord getBankRelationshipManagementPlanInstanceRecord() {
    return bankRelationshipManagementPlanInstanceRecord;
  }

  public void setBankRelationshipManagementPlanInstanceRecord(CRBankRelationshipManagementPlanRequestInputModelBankRelationshipManagementPlanInstanceRecord bankRelationshipManagementPlanInstanceRecord) {
    this.bankRelationshipManagementPlanInstanceRecord = bankRelationshipManagementPlanInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return bankRelationshipManagementPlanRequestActionTaskRecord
  **/

  public Object getBankRelationshipManagementPlanRequestActionTaskRecord() {
    return bankRelationshipManagementPlanRequestActionTaskRecord;
  }

  public void setBankRelationshipManagementPlanRequestActionTaskRecord(Object bankRelationshipManagementPlanRequestActionTaskRecord) {
    this.bankRelationshipManagementPlanRequestActionTaskRecord = bankRelationshipManagementPlanRequestActionTaskRecord;
  }


  /**
   * Get requestRecordType
   * @return requestRecordType
  **/

  public CRBankRelationshipManagementPlanRequestInputModelRequestRecordType getRequestRecordType() {
    return requestRecordType;
  }

  public void setRequestRecordType(CRBankRelationshipManagementPlanRequestInputModelRequestRecordType requestRecordType) {
    this.requestRecordType = requestRecordType;
  }


}


package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQContactRequestInputModelContactInstanceRecord;
import org.bian.dto.CRBankRelationshipManagementPlanRequestInputModelRequestRecordType;

import javax.validation.Valid;
  
/**
 * BQContactRequestInputModel
 */
public class BQContactRequestInputModel   {
  private String bankRelationshipManagementPlanInstanceReference = null;

  private String contactInstanceReference = null;

  private BQContactRequestInputModelContactInstanceRecord contactInstanceRecord = null;

  private Object contactRequestActionTaskRecord = null;

  private CRBankRelationshipManagementPlanRequestInputModelRequestRecordType requestRecordType = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent Bank Relationship Management Plan instance 
   * @return bankRelationshipManagementPlanInstanceReference
  **/

  public String getBankRelationshipManagementPlanInstanceReference() {
    return bankRelationshipManagementPlanInstanceReference;
  }

  public void setBankRelationshipManagementPlanInstanceReference(String bankRelationshipManagementPlanInstanceReference) {
    this.bankRelationshipManagementPlanInstanceReference = bankRelationshipManagementPlanInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Contact instance 
   * @return contactInstanceReference
  **/

  public String getContactInstanceReference() {
    return contactInstanceReference;
  }

  public void setContactInstanceReference(String contactInstanceReference) {
    this.contactInstanceReference = contactInstanceReference;
  }


  /**
   * Get contactInstanceRecord
   * @return contactInstanceRecord
  **/

  public BQContactRequestInputModelContactInstanceRecord getContactInstanceRecord() {
    return contactInstanceRecord;
  }

  public void setContactInstanceRecord(BQContactRequestInputModelContactInstanceRecord contactInstanceRecord) {
    this.contactInstanceRecord = contactInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return contactRequestActionTaskRecord
  **/

  public Object getContactRequestActionTaskRecord() {
    return contactRequestActionTaskRecord;
  }

  public void setContactRequestActionTaskRecord(Object contactRequestActionTaskRecord) {
    this.contactRequestActionTaskRecord = contactRequestActionTaskRecord;
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


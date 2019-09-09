package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQContactUpdateInputModelContactInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQContactUpdateInputModel
 */
public class BQContactUpdateInputModel   {
  private String bankRelationshipManagementPlanInstanceReference = null;

  private String contactInstanceReference = null;

  private BQContactUpdateInputModelContactInstanceRecord contactInstanceRecord = null;

  private Object contactUpdateActionTaskRecord = null;

  private String contactUpdateActionRequest = null;


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

  public BQContactUpdateInputModelContactInstanceRecord getContactInstanceRecord() {
    return contactInstanceRecord;
  }

  public void setContactInstanceRecord(BQContactUpdateInputModelContactInstanceRecord contactInstanceRecord) {
    this.contactInstanceRecord = contactInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return contactUpdateActionTaskRecord
  **/

  public Object getContactUpdateActionTaskRecord() {
    return contactUpdateActionTaskRecord;
  }

  public void setContactUpdateActionTaskRecord(Object contactUpdateActionTaskRecord) {
    this.contactUpdateActionTaskRecord = contactUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return contactUpdateActionRequest
  **/

  public String getContactUpdateActionRequest() {
    return contactUpdateActionRequest;
  }

  public void setContactUpdateActionRequest(String contactUpdateActionRequest) {
    this.contactUpdateActionRequest = contactUpdateActionRequest;
  }


}


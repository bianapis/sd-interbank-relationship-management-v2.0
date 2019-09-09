package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQContactCreateInputModelContactInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQContactCreateInputModel
 */
public class BQContactCreateInputModel   {
  private String bankRelationshipManagementPlanInstanceReference = null;

  private Object contactInitiateActionRecord = null;

  private BQContactCreateInputModelContactInstanceRecord contactInstanceRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return contactInitiateActionRecord
  **/

  public Object getContactInitiateActionRecord() {
    return contactInitiateActionRecord;
  }

  public void setContactInitiateActionRecord(Object contactInitiateActionRecord) {
    this.contactInitiateActionRecord = contactInitiateActionRecord;
  }


  /**
   * Get contactInstanceRecord
   * @return contactInstanceRecord
  **/

  public BQContactCreateInputModelContactInstanceRecord getContactInstanceRecord() {
    return contactInstanceRecord;
  }

  public void setContactInstanceRecord(BQContactCreateInputModelContactInstanceRecord contactInstanceRecord) {
    this.contactInstanceRecord = contactInstanceRecord;
  }


}


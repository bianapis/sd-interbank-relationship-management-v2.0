package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQContactUpdateInputModelContactInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQContactUpdateOutputModel
 */
public class BQContactUpdateOutputModel   {
  private BQContactUpdateInputModelContactInstanceRecord contactInstanceRecord = null;

  private String contactUpdateActionTaskReference = null;

  private Object contactUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return contactUpdateActionTaskReference
  **/

  public String getContactUpdateActionTaskReference() {
    return contactUpdateActionTaskReference;
  }

  public void setContactUpdateActionTaskReference(String contactUpdateActionTaskReference) {
    this.contactUpdateActionTaskReference = contactUpdateActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the Update action service response 
   * @return updateResponseRecord
  **/

  public Object getUpdateResponseRecord() {
    return updateResponseRecord;
  }

  public void setUpdateResponseRecord(Object updateResponseRecord) {
    this.updateResponseRecord = updateResponseRecord;
  }


}


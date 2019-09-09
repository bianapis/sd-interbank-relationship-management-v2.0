package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRBankRelationshipManagementPlanUpdateInputModelBankRelationshipManagementPlanInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRBankRelationshipManagementPlanUpdateOutputModel
 */
public class CRBankRelationshipManagementPlanUpdateOutputModel   {
  private CRBankRelationshipManagementPlanUpdateInputModelBankRelationshipManagementPlanInstanceRecord bankRelationshipManagementPlanInstanceRecord = null;

  private String bankRelationshipManagementPlanUpdateActionTaskReference = null;

  private Object bankRelationshipManagementPlanUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return bankRelationshipManagementPlanUpdateActionTaskReference
  **/

  public String getBankRelationshipManagementPlanUpdateActionTaskReference() {
    return bankRelationshipManagementPlanUpdateActionTaskReference;
  }

  public void setBankRelationshipManagementPlanUpdateActionTaskReference(String bankRelationshipManagementPlanUpdateActionTaskReference) {
    this.bankRelationshipManagementPlanUpdateActionTaskReference = bankRelationshipManagementPlanUpdateActionTaskReference;
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


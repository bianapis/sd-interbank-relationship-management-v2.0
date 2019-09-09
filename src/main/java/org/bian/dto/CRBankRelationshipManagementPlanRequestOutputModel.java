package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRBankRelationshipManagementPlanRequestOutputModelBankRelationshipManagementPlanInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRBankRelationshipManagementPlanRequestOutputModel
 */
public class CRBankRelationshipManagementPlanRequestOutputModel   {
  private CRBankRelationshipManagementPlanRequestOutputModelBankRelationshipManagementPlanInstanceRecord bankRelationshipManagementPlanInstanceRecord = null;

  private String bankRelationshipManagementPlanRequestActionTaskReference = null;

  private Object bankRelationshipManagementPlanRequestActionTaskRecord = null;

  private String requestRecordReference = null;

  private Object requestResponseRecord = null;


  /**
   * Get bankRelationshipManagementPlanInstanceRecord
   * @return bankRelationshipManagementPlanInstanceRecord
  **/

  public CRBankRelationshipManagementPlanRequestOutputModelBankRelationshipManagementPlanInstanceRecord getBankRelationshipManagementPlanInstanceRecord() {
    return bankRelationshipManagementPlanInstanceRecord;
  }

  public void setBankRelationshipManagementPlanInstanceRecord(CRBankRelationshipManagementPlanRequestOutputModelBankRelationshipManagementPlanInstanceRecord bankRelationshipManagementPlanInstanceRecord) {
    this.bankRelationshipManagementPlanInstanceRecord = bankRelationshipManagementPlanInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Bank Relationship Management Plan instance request service call 
   * @return bankRelationshipManagementPlanRequestActionTaskReference
  **/

  public String getBankRelationshipManagementPlanRequestActionTaskReference() {
    return bankRelationshipManagementPlanRequestActionTaskReference;
  }

  public void setBankRelationshipManagementPlanRequestActionTaskReference(String bankRelationshipManagementPlanRequestActionTaskReference) {
    this.bankRelationshipManagementPlanRequestActionTaskReference = bankRelationshipManagementPlanRequestActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the service request record 
   * @return requestRecordReference
  **/

  public String getRequestRecordReference() {
    return requestRecordReference;
  }

  public void setRequestRecordReference(String requestRecordReference) {
    this.requestRecordReference = requestRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the request action service response 
   * @return requestResponseRecord
  **/

  public Object getRequestResponseRecord() {
    return requestResponseRecord;
  }

  public void setRequestResponseRecord(Object requestResponseRecord) {
    this.requestResponseRecord = requestResponseRecord;
  }


}


package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRBankRelationshipManagementPlanGrantOutputModelGrantRequestResponseRecord;

import javax.validation.Valid;
  
/**
 * CRBankRelationshipManagementPlanGrantOutputModel
 */
public class CRBankRelationshipManagementPlanGrantOutputModel   {
  private String bankRelationshipManagementPlanGrantActionTaskReference = null;

  private Object bankRelationshipManagementPlanGrantActionTaskRecord = null;

  private String grantRequestRecordReference = null;

  private CRBankRelationshipManagementPlanGrantOutputModelGrantRequestResponseRecord grantRequestResponseRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Bank Relationship Management Plan instance grant service call 
   * @return bankRelationshipManagementPlanGrantActionTaskReference
  **/

  public String getBankRelationshipManagementPlanGrantActionTaskReference() {
    return bankRelationshipManagementPlanGrantActionTaskReference;
  }

  public void setBankRelationshipManagementPlanGrantActionTaskReference(String bankRelationshipManagementPlanGrantActionTaskReference) {
    this.bankRelationshipManagementPlanGrantActionTaskReference = bankRelationshipManagementPlanGrantActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The grant service call consolidated processing record 
   * @return bankRelationshipManagementPlanGrantActionTaskRecord
  **/

  public Object getBankRelationshipManagementPlanGrantActionTaskRecord() {
    return bankRelationshipManagementPlanGrantActionTaskRecord;
  }

  public void setBankRelationshipManagementPlanGrantActionTaskRecord(Object bankRelationshipManagementPlanGrantActionTaskRecord) {
    this.bankRelationshipManagementPlanGrantActionTaskRecord = bankRelationshipManagementPlanGrantActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the grant request record 
   * @return grantRequestRecordReference
  **/

  public String getGrantRequestRecordReference() {
    return grantRequestRecordReference;
  }

  public void setGrantRequestRecordReference(String grantRequestRecordReference) {
    this.grantRequestRecordReference = grantRequestRecordReference;
  }


  /**
   * Get grantRequestResponseRecord
   * @return grantRequestResponseRecord
  **/

  public CRBankRelationshipManagementPlanGrantOutputModelGrantRequestResponseRecord getGrantRequestResponseRecord() {
    return grantRequestResponseRecord;
  }

  public void setGrantRequestResponseRecord(CRBankRelationshipManagementPlanGrantOutputModelGrantRequestResponseRecord grantRequestResponseRecord) {
    this.grantRequestResponseRecord = grantRequestResponseRecord;
  }


}


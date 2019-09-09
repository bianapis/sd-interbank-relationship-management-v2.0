package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRBankRelationshipManagementPlanGrantInputModelGrantRequestInputRecord;

import javax.validation.Valid;
  
/**
 * CRBankRelationshipManagementPlanGrantInputModel
 */
public class CRBankRelationshipManagementPlanGrantInputModel   {
  private String interbankRelationshipManagementServicingSessionReference = null;

  private String bankRelationshipManagementPlanInstanceReference = null;

  private Object bankRelationshipManagementPlanGrantActionTaskRecord = null;

  private String grantRequestRecordType = null;

  private CRBankRelationshipManagementPlanGrantInputModelGrantRequestInputRecord grantRequestInputRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Grant request type (e.g. access permission) 
   * @return grantRequestRecordType
  **/

  public String getGrantRequestRecordType() {
    return grantRequestRecordType;
  }

  public void setGrantRequestRecordType(String grantRequestRecordType) {
    this.grantRequestRecordType = grantRequestRecordType;
  }


  /**
   * Get grantRequestInputRecord
   * @return grantRequestInputRecord
  **/

  public CRBankRelationshipManagementPlanGrantInputModelGrantRequestInputRecord getGrantRequestInputRecord() {
    return grantRequestInputRecord;
  }

  public void setGrantRequestInputRecord(CRBankRelationshipManagementPlanGrantInputModelGrantRequestInputRecord grantRequestInputRecord) {
    this.grantRequestInputRecord = grantRequestInputRecord;
  }


}


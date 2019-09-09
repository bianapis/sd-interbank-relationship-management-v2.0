package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRBankRelationshipManagementPlanRetrieveOutputModelBankRelationshipManagementPlanInstanceAnalysis;
import org.bian.dto.CRBankRelationshipManagementPlanRetrieveOutputModelBankRelationshipManagementPlanInstanceRecord;
import org.bian.dto.CRBankRelationshipManagementPlanRetrieveOutputModelBankRelationshipManagementPlanInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRBankRelationshipManagementPlanRetrieveOutputModel
 */
public class CRBankRelationshipManagementPlanRetrieveOutputModel   {
  private CRBankRelationshipManagementPlanRetrieveOutputModelBankRelationshipManagementPlanInstanceRecord bankRelationshipManagementPlanInstanceRecord = null;

  private String bankRelationshipManagementPlanRetrieveActionTaskReference = null;

  private Object bankRelationshipManagementPlanRetrieveActionTaskRecord = null;

  private String bankRelationshipManagementPlanRetrieveActionResponse = null;

  private CRBankRelationshipManagementPlanRetrieveOutputModelBankRelationshipManagementPlanInstanceReportRecord bankRelationshipManagementPlanInstanceReportRecord = null;

  private CRBankRelationshipManagementPlanRetrieveOutputModelBankRelationshipManagementPlanInstanceAnalysis bankRelationshipManagementPlanInstanceAnalysis = null;


  /**
   * Get bankRelationshipManagementPlanInstanceRecord
   * @return bankRelationshipManagementPlanInstanceRecord
  **/

  public CRBankRelationshipManagementPlanRetrieveOutputModelBankRelationshipManagementPlanInstanceRecord getBankRelationshipManagementPlanInstanceRecord() {
    return bankRelationshipManagementPlanInstanceRecord;
  }

  public void setBankRelationshipManagementPlanInstanceRecord(CRBankRelationshipManagementPlanRetrieveOutputModelBankRelationshipManagementPlanInstanceRecord bankRelationshipManagementPlanInstanceRecord) {
    this.bankRelationshipManagementPlanInstanceRecord = bankRelationshipManagementPlanInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Bank Relationship Management Plan instance retrieve service call 
   * @return bankRelationshipManagementPlanRetrieveActionTaskReference
  **/

  public String getBankRelationshipManagementPlanRetrieveActionTaskReference() {
    return bankRelationshipManagementPlanRetrieveActionTaskReference;
  }

  public void setBankRelationshipManagementPlanRetrieveActionTaskReference(String bankRelationshipManagementPlanRetrieveActionTaskReference) {
    this.bankRelationshipManagementPlanRetrieveActionTaskReference = bankRelationshipManagementPlanRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return bankRelationshipManagementPlanRetrieveActionTaskRecord
  **/

  public Object getBankRelationshipManagementPlanRetrieveActionTaskRecord() {
    return bankRelationshipManagementPlanRetrieveActionTaskRecord;
  }

  public void setBankRelationshipManagementPlanRetrieveActionTaskRecord(Object bankRelationshipManagementPlanRetrieveActionTaskRecord) {
    this.bankRelationshipManagementPlanRetrieveActionTaskRecord = bankRelationshipManagementPlanRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return bankRelationshipManagementPlanRetrieveActionResponse
  **/

  public String getBankRelationshipManagementPlanRetrieveActionResponse() {
    return bankRelationshipManagementPlanRetrieveActionResponse;
  }

  public void setBankRelationshipManagementPlanRetrieveActionResponse(String bankRelationshipManagementPlanRetrieveActionResponse) {
    this.bankRelationshipManagementPlanRetrieveActionResponse = bankRelationshipManagementPlanRetrieveActionResponse;
  }


  /**
   * Get bankRelationshipManagementPlanInstanceReportRecord
   * @return bankRelationshipManagementPlanInstanceReportRecord
  **/

  public CRBankRelationshipManagementPlanRetrieveOutputModelBankRelationshipManagementPlanInstanceReportRecord getBankRelationshipManagementPlanInstanceReportRecord() {
    return bankRelationshipManagementPlanInstanceReportRecord;
  }

  public void setBankRelationshipManagementPlanInstanceReportRecord(CRBankRelationshipManagementPlanRetrieveOutputModelBankRelationshipManagementPlanInstanceReportRecord bankRelationshipManagementPlanInstanceReportRecord) {
    this.bankRelationshipManagementPlanInstanceReportRecord = bankRelationshipManagementPlanInstanceReportRecord;
  }


  /**
   * Get bankRelationshipManagementPlanInstanceAnalysis
   * @return bankRelationshipManagementPlanInstanceAnalysis
  **/

  public CRBankRelationshipManagementPlanRetrieveOutputModelBankRelationshipManagementPlanInstanceAnalysis getBankRelationshipManagementPlanInstanceAnalysis() {
    return bankRelationshipManagementPlanInstanceAnalysis;
  }

  public void setBankRelationshipManagementPlanInstanceAnalysis(CRBankRelationshipManagementPlanRetrieveOutputModelBankRelationshipManagementPlanInstanceAnalysis bankRelationshipManagementPlanInstanceAnalysis) {
    this.bankRelationshipManagementPlanInstanceAnalysis = bankRelationshipManagementPlanInstanceAnalysis;
  }


}


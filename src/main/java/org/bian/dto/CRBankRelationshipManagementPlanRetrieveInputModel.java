package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRBankRelationshipManagementPlanRetrieveInputModelBankRelationshipManagementPlanInstanceAnalysis;
import org.bian.dto.CRBankRelationshipManagementPlanRetrieveInputModelBankRelationshipManagementPlanInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRBankRelationshipManagementPlanRetrieveInputModel
 */
public class CRBankRelationshipManagementPlanRetrieveInputModel   {
  private Object bankRelationshipManagementPlanRetrieveActionTaskRecord = null;

  private String bankRelationshipManagementPlanRetrieveActionRequest = null;

  private CRBankRelationshipManagementPlanRetrieveInputModelBankRelationshipManagementPlanInstanceReportRecord bankRelationshipManagementPlanInstanceReportRecord = null;

  private CRBankRelationshipManagementPlanRetrieveInputModelBankRelationshipManagementPlanInstanceAnalysis bankRelationshipManagementPlanInstanceAnalysis = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return bankRelationshipManagementPlanRetrieveActionRequest
  **/

  public String getBankRelationshipManagementPlanRetrieveActionRequest() {
    return bankRelationshipManagementPlanRetrieveActionRequest;
  }

  public void setBankRelationshipManagementPlanRetrieveActionRequest(String bankRelationshipManagementPlanRetrieveActionRequest) {
    this.bankRelationshipManagementPlanRetrieveActionRequest = bankRelationshipManagementPlanRetrieveActionRequest;
  }


  /**
   * Get bankRelationshipManagementPlanInstanceReportRecord
   * @return bankRelationshipManagementPlanInstanceReportRecord
  **/

  public CRBankRelationshipManagementPlanRetrieveInputModelBankRelationshipManagementPlanInstanceReportRecord getBankRelationshipManagementPlanInstanceReportRecord() {
    return bankRelationshipManagementPlanInstanceReportRecord;
  }

  public void setBankRelationshipManagementPlanInstanceReportRecord(CRBankRelationshipManagementPlanRetrieveInputModelBankRelationshipManagementPlanInstanceReportRecord bankRelationshipManagementPlanInstanceReportRecord) {
    this.bankRelationshipManagementPlanInstanceReportRecord = bankRelationshipManagementPlanInstanceReportRecord;
  }


  /**
   * Get bankRelationshipManagementPlanInstanceAnalysis
   * @return bankRelationshipManagementPlanInstanceAnalysis
  **/

  public CRBankRelationshipManagementPlanRetrieveInputModelBankRelationshipManagementPlanInstanceAnalysis getBankRelationshipManagementPlanInstanceAnalysis() {
    return bankRelationshipManagementPlanInstanceAnalysis;
  }

  public void setBankRelationshipManagementPlanInstanceAnalysis(CRBankRelationshipManagementPlanRetrieveInputModelBankRelationshipManagementPlanInstanceAnalysis bankRelationshipManagementPlanInstanceAnalysis) {
    this.bankRelationshipManagementPlanInstanceAnalysis = bankRelationshipManagementPlanInstanceAnalysis;
  }


}


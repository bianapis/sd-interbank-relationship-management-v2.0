package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRBankRelationshipManagementPlanRetrieveOutputModelBankRelationshipManagementPlanInstanceAnalysis
 */
public class CRBankRelationshipManagementPlanRetrieveOutputModelBankRelationshipManagementPlanInstanceAnalysis   {
  private String bankRelationshipManagementPlanInstanceAnalysisData = null;

  private String bankRelationshipManagementPlanInstanceAnalysisReportType = null;

  private Object bankRelationshipManagementPlanInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return bankRelationshipManagementPlanInstanceAnalysisData
  **/

  public String getBankRelationshipManagementPlanInstanceAnalysisData() {
    return bankRelationshipManagementPlanInstanceAnalysisData;
  }

  public void setBankRelationshipManagementPlanInstanceAnalysisData(String bankRelationshipManagementPlanInstanceAnalysisData) {
    this.bankRelationshipManagementPlanInstanceAnalysisData = bankRelationshipManagementPlanInstanceAnalysisData;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return bankRelationshipManagementPlanInstanceAnalysisReportType
  **/

  public String getBankRelationshipManagementPlanInstanceAnalysisReportType() {
    return bankRelationshipManagementPlanInstanceAnalysisReportType;
  }

  public void setBankRelationshipManagementPlanInstanceAnalysisReportType(String bankRelationshipManagementPlanInstanceAnalysisReportType) {
    this.bankRelationshipManagementPlanInstanceAnalysisReportType = bankRelationshipManagementPlanInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return bankRelationshipManagementPlanInstanceAnalysisReport
  **/

  public Object getBankRelationshipManagementPlanInstanceAnalysisReport() {
    return bankRelationshipManagementPlanInstanceAnalysisReport;
  }

  public void setBankRelationshipManagementPlanInstanceAnalysisReport(Object bankRelationshipManagementPlanInstanceAnalysisReport) {
    this.bankRelationshipManagementPlanInstanceAnalysisReport = bankRelationshipManagementPlanInstanceAnalysisReport;
  }


}


package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRBankRelationshipManagementPlanRetrieveInputModelBankRelationshipManagementPlanInstanceAnalysis
 */
public class CRBankRelationshipManagementPlanRetrieveInputModelBankRelationshipManagementPlanInstanceAnalysis   {
  private String bankRelationshipManagementPlanInstanceAnalysisReference = null;

  private String bankRelationshipManagementPlanInstanceAnalysisReportType = null;

  private String bankRelationshipManagementPlanInstanceAnalysisParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return bankRelationshipManagementPlanInstanceAnalysisReference
  **/

  public String getBankRelationshipManagementPlanInstanceAnalysisReference() {
    return bankRelationshipManagementPlanInstanceAnalysisReference;
  }

  public void setBankRelationshipManagementPlanInstanceAnalysisReference(String bankRelationshipManagementPlanInstanceAnalysisReference) {
    this.bankRelationshipManagementPlanInstanceAnalysisReference = bankRelationshipManagementPlanInstanceAnalysisReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return bankRelationshipManagementPlanInstanceAnalysisParameters
  **/

  public String getBankRelationshipManagementPlanInstanceAnalysisParameters() {
    return bankRelationshipManagementPlanInstanceAnalysisParameters;
  }

  public void setBankRelationshipManagementPlanInstanceAnalysisParameters(String bankRelationshipManagementPlanInstanceAnalysisParameters) {
    this.bankRelationshipManagementPlanInstanceAnalysisParameters = bankRelationshipManagementPlanInstanceAnalysisParameters;
  }


}


package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRBankRelationshipManagementPlanRetrieveInputModelBankRelationshipManagementPlanInstanceReportRecord
 */
public class CRBankRelationshipManagementPlanRetrieveInputModelBankRelationshipManagementPlanInstanceReportRecord   {
  private String bankRelationshipManagementPlanInstanceReportReference = null;

  private String bankRelationshipManagementPlanInstanceReportType = null;

  private String bankRelationshipManagementPlanInstanceReportParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return bankRelationshipManagementPlanInstanceReportReference
  **/

  public String getBankRelationshipManagementPlanInstanceReportReference() {
    return bankRelationshipManagementPlanInstanceReportReference;
  }

  public void setBankRelationshipManagementPlanInstanceReportReference(String bankRelationshipManagementPlanInstanceReportReference) {
    this.bankRelationshipManagementPlanInstanceReportReference = bankRelationshipManagementPlanInstanceReportReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return bankRelationshipManagementPlanInstanceReportType
  **/

  public String getBankRelationshipManagementPlanInstanceReportType() {
    return bankRelationshipManagementPlanInstanceReportType;
  }

  public void setBankRelationshipManagementPlanInstanceReportType(String bankRelationshipManagementPlanInstanceReportType) {
    this.bankRelationshipManagementPlanInstanceReportType = bankRelationshipManagementPlanInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return bankRelationshipManagementPlanInstanceReportParameters
  **/

  public String getBankRelationshipManagementPlanInstanceReportParameters() {
    return bankRelationshipManagementPlanInstanceReportParameters;
  }

  public void setBankRelationshipManagementPlanInstanceReportParameters(String bankRelationshipManagementPlanInstanceReportParameters) {
    this.bankRelationshipManagementPlanInstanceReportParameters = bankRelationshipManagementPlanInstanceReportParameters;
  }


}


package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRBankRelationshipManagementPlanRetrieveOutputModelBankRelationshipManagementPlanInstanceReportRecord
 */
public class CRBankRelationshipManagementPlanRetrieveOutputModelBankRelationshipManagementPlanInstanceReportRecord   {
  private String bankRelationshipManagementPlanInstanceReportData = null;

  private String bankRelationshipManagementPlanInstanceReportType = null;

  private Object bankRelationshipManagementPlanInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return bankRelationshipManagementPlanInstanceReportData
  **/

  public String getBankRelationshipManagementPlanInstanceReportData() {
    return bankRelationshipManagementPlanInstanceReportData;
  }

  public void setBankRelationshipManagementPlanInstanceReportData(String bankRelationshipManagementPlanInstanceReportData) {
    this.bankRelationshipManagementPlanInstanceReportData = bankRelationshipManagementPlanInstanceReportData;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return bankRelationshipManagementPlanInstanceReport
  **/

  public Object getBankRelationshipManagementPlanInstanceReport() {
    return bankRelationshipManagementPlanInstanceReport;
  }

  public void setBankRelationshipManagementPlanInstanceReport(Object bankRelationshipManagementPlanInstanceReport) {
    this.bankRelationshipManagementPlanInstanceReport = bankRelationshipManagementPlanInstanceReport;
  }


}


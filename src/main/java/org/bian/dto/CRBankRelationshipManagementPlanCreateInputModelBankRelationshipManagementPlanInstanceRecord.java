package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRBankRelationshipManagementPlanCreateInputModelBankRelationshipManagementPlanInstanceRecord
 */
public class CRBankRelationshipManagementPlanCreateInputModelBankRelationshipManagementPlanInstanceRecord   {
  private String bankReference = null;

  private String bankDetails = null;

  private String employeeBusinessUnitReference = null;

  private String bankRelationshipType = null;

  private String bankRelationshipDescription = null;

  private String bankContactDetails = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the associated bank 
   * @return bankReference
  **/

  public String getBankReference() {
    return bankReference;
  }

  public void setBankReference(String bankReference) {
    this.bankReference = bankReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Key features and details of the bank (e.g. business/segment profile) 
   * @return bankDetails
  **/

  public String getBankDetails() {
    return bankDetails;
  }

  public void setBankDetails(String bankDetails) {
    this.bankDetails = bankDetails;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: The assigned individual or business unit for the relationship 
   * @return employeeBusinessUnitReference
  **/

  public String getEmployeeBusinessUnitReference() {
    return employeeBusinessUnitReference;
  }

  public void setEmployeeBusinessUnitReference(String employeeBusinessUnitReference) {
    this.employeeBusinessUnitReference = employeeBusinessUnitReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of relationship with the bank (e.g. trading partner, joint venture partner) 
   * @return bankRelationshipType
  **/

  public String getBankRelationshipType() {
    return bankRelationshipType;
  }

  public void setBankRelationshipType(String bankRelationshipType) {
    this.bankRelationshipType = bankRelationshipType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: A description of the relationship, outlining roles and expectations as appropriate 
   * @return bankRelationshipDescription
  **/

  public String getBankRelationshipDescription() {
    return bankRelationshipDescription;
  }

  public void setBankRelationshipDescription(String bankRelationshipDescription) {
    this.bankRelationshipDescription = bankRelationshipDescription;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Defines the role and contact details for bank representatives 
   * @return bankContactDetails
  **/

  public String getBankContactDetails() {
    return bankContactDetails;
  }

  public void setBankContactDetails(String bankContactDetails) {
    this.bankContactDetails = bankContactDetails;
  }


}


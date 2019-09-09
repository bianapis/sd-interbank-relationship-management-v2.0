package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQContactUpdateInputModelContactInstanceRecordBankRelationshipContactRecord
 */
public class BQContactUpdateInputModelContactInstanceRecordBankRelationshipContactRecord   {
  private String bankRelationshipContactDate = null;

  private String employeeReference = null;

  private String bankRelationshipContactType = null;

  private String bankRelationshipContactResult = null;

  private String documentDirectoryEntryInstanceReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::DateTime  general-info: The date time and location of the contact 
   * @return bankRelationshipContactDate
  **/

  public String getBankRelationshipContactDate() {
    return bankRelationshipContactDate;
  }

  public void setBankRelationshipContactDate(String bankRelationshipContactDate) {
    this.bankRelationshipContactDate = bankRelationshipContactDate;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the employee(s) in attendance 
   * @return employeeReference
  **/

  public String getEmployeeReference() {
    return employeeReference;
  }

  public void setEmployeeReference(String employeeReference) {
    this.employeeReference = employeeReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The reason and or purpose for the contact (e.g. review, issue, product sales, advice, customer enquiry) 
   * @return bankRelationshipContactType
  **/

  public String getBankRelationshipContactType() {
    return bankRelationshipContactType;
  }

  public void setBankRelationshipContactType(String bankRelationshipContactType) {
    this.bankRelationshipContactType = bankRelationshipContactType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The result of the contact, including follow up tasks 
   * @return bankRelationshipContactResult
  **/

  public String getBankRelationshipContactResult() {
    return bankRelationshipContactResult;
  }

  public void setBankRelationshipContactResult(String bankRelationshipContactResult) {
    this.bankRelationshipContactResult = bankRelationshipContactResult;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to associated documents 
   * @return documentDirectoryEntryInstanceReference
  **/

  public String getDocumentDirectoryEntryInstanceReference() {
    return documentDirectoryEntryInstanceReference;
  }

  public void setDocumentDirectoryEntryInstanceReference(String documentDirectoryEntryInstanceReference) {
    this.documentDirectoryEntryInstanceReference = documentDirectoryEntryInstanceReference;
  }


}


package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQContactCreateInputModelContactInstanceRecord
 */
public class BQContactCreateInputModelContactInstanceRecord   {
  private String bankRelationshipContactHistory = null;

  private String bankRelationshipContactSchedule = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Records the timing, purpose, details and impact of customer contacts 
   * @return bankRelationshipContactHistory
  **/

  public String getBankRelationshipContactHistory() {
    return bankRelationshipContactHistory;
  }

  public void setBankRelationshipContactHistory(String bankRelationshipContactHistory) {
    this.bankRelationshipContactHistory = bankRelationshipContactHistory;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The schedule of past and planned customer contacts 
   * @return bankRelationshipContactSchedule
  **/

  public String getBankRelationshipContactSchedule() {
    return bankRelationshipContactSchedule;
  }

  public void setBankRelationshipContactSchedule(String bankRelationshipContactSchedule) {
    this.bankRelationshipContactSchedule = bankRelationshipContactSchedule;
  }


}


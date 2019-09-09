package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQContactRequestInputModelContactInstanceRecordBankRelationshipContactRecord;

import javax.validation.Valid;
  
/**
 * BQContactRequestInputModelContactInstanceRecord
 */
public class BQContactRequestInputModelContactInstanceRecord   {
  private BQContactRequestInputModelContactInstanceRecordBankRelationshipContactRecord bankRelationshipContactRecord = null;


  /**
   * Get bankRelationshipContactRecord
   * @return bankRelationshipContactRecord
  **/

  public BQContactRequestInputModelContactInstanceRecordBankRelationshipContactRecord getBankRelationshipContactRecord() {
    return bankRelationshipContactRecord;
  }

  public void setBankRelationshipContactRecord(BQContactRequestInputModelContactInstanceRecordBankRelationshipContactRecord bankRelationshipContactRecord) {
    this.bankRelationshipContactRecord = bankRelationshipContactRecord;
  }


}


package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQContactUpdateInputModelContactInstanceRecordBankRelationshipContactRecord;

import javax.validation.Valid;
  
/**
 * BQContactUpdateInputModelContactInstanceRecord
 */
public class BQContactUpdateInputModelContactInstanceRecord   {
  private BQContactUpdateInputModelContactInstanceRecordBankRelationshipContactRecord bankRelationshipContactRecord = null;


  /**
   * Get bankRelationshipContactRecord
   * @return bankRelationshipContactRecord
  **/

  public BQContactUpdateInputModelContactInstanceRecordBankRelationshipContactRecord getBankRelationshipContactRecord() {
    return bankRelationshipContactRecord;
  }

  public void setBankRelationshipContactRecord(BQContactUpdateInputModelContactInstanceRecordBankRelationshipContactRecord bankRelationshipContactRecord) {
    this.bankRelationshipContactRecord = bankRelationshipContactRecord;
  }


}


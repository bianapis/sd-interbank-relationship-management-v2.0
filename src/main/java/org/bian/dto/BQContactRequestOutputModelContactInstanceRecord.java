package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQContactRequestOutputModelContactInstanceRecordBankRelationshipContactRecord;

import javax.validation.Valid;
  
/**
 * BQContactRequestOutputModelContactInstanceRecord
 */
public class BQContactRequestOutputModelContactInstanceRecord   {
  private BQContactRequestOutputModelContactInstanceRecordBankRelationshipContactRecord bankRelationshipContactRecord = null;


  /**
   * Get bankRelationshipContactRecord
   * @return bankRelationshipContactRecord
  **/

  public BQContactRequestOutputModelContactInstanceRecordBankRelationshipContactRecord getBankRelationshipContactRecord() {
    return bankRelationshipContactRecord;
  }

  public void setBankRelationshipContactRecord(BQContactRequestOutputModelContactInstanceRecordBankRelationshipContactRecord bankRelationshipContactRecord) {
    this.bankRelationshipContactRecord = bankRelationshipContactRecord;
  }


}


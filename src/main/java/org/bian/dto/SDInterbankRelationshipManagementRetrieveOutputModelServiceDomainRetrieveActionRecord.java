package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDInterbankRelationshipManagementRetrieveOutputModelServiceDomainRetrieveActionRecordControlRecordPortfolioAnalysis;
import org.bian.dto.SDInterbankRelationshipManagementRetrieveOutputModelServiceDomainRetrieveActionRecordServiceDomainActivityAnalysis;
import org.bian.dto.SDInterbankRelationshipManagementRetrieveOutputModelServiceDomainRetrieveActionRecordServiceDomainPerformanceAnalysis;

import javax.validation.Valid;
  
/**
 * SDInterbankRelationshipManagementRetrieveOutputModelServiceDomainRetrieveActionRecord
 */
public class SDInterbankRelationshipManagementRetrieveOutputModelServiceDomainRetrieveActionRecord   {
  private SDInterbankRelationshipManagementRetrieveOutputModelServiceDomainRetrieveActionRecordServiceDomainActivityAnalysis serviceDomainActivityAnalysis = null;

  private SDInterbankRelationshipManagementRetrieveOutputModelServiceDomainRetrieveActionRecordServiceDomainPerformanceAnalysis serviceDomainPerformanceAnalysis = null;

  private SDInterbankRelationshipManagementRetrieveOutputModelServiceDomainRetrieveActionRecordControlRecordPortfolioAnalysis controlRecordPortfolioAnalysis = null;


  /**
   * Get serviceDomainActivityAnalysis
   * @return serviceDomainActivityAnalysis
  **/

  public SDInterbankRelationshipManagementRetrieveOutputModelServiceDomainRetrieveActionRecordServiceDomainActivityAnalysis getServiceDomainActivityAnalysis() {
    return serviceDomainActivityAnalysis;
  }

  public void setServiceDomainActivityAnalysis(SDInterbankRelationshipManagementRetrieveOutputModelServiceDomainRetrieveActionRecordServiceDomainActivityAnalysis serviceDomainActivityAnalysis) {
    this.serviceDomainActivityAnalysis = serviceDomainActivityAnalysis;
  }


  /**
   * Get serviceDomainPerformanceAnalysis
   * @return serviceDomainPerformanceAnalysis
  **/

  public SDInterbankRelationshipManagementRetrieveOutputModelServiceDomainRetrieveActionRecordServiceDomainPerformanceAnalysis getServiceDomainPerformanceAnalysis() {
    return serviceDomainPerformanceAnalysis;
  }

  public void setServiceDomainPerformanceAnalysis(SDInterbankRelationshipManagementRetrieveOutputModelServiceDomainRetrieveActionRecordServiceDomainPerformanceAnalysis serviceDomainPerformanceAnalysis) {
    this.serviceDomainPerformanceAnalysis = serviceDomainPerformanceAnalysis;
  }


  /**
   * Get controlRecordPortfolioAnalysis
   * @return controlRecordPortfolioAnalysis
  **/

  public SDInterbankRelationshipManagementRetrieveOutputModelServiceDomainRetrieveActionRecordControlRecordPortfolioAnalysis getControlRecordPortfolioAnalysis() {
    return controlRecordPortfolioAnalysis;
  }

  public void setControlRecordPortfolioAnalysis(SDInterbankRelationshipManagementRetrieveOutputModelServiceDomainRetrieveActionRecordControlRecordPortfolioAnalysis controlRecordPortfolioAnalysis) {
    this.controlRecordPortfolioAnalysis = controlRecordPortfolioAnalysis;
  }


}


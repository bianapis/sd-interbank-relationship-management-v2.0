package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDInterbankRelationshipManagementRetrieveInputModelServiceDomainRetrieveActionRecordControlRecordPortfolioAnalysis;
import org.bian.dto.SDInterbankRelationshipManagementRetrieveInputModelServiceDomainRetrieveActionRecordServiceDomainActivityAnalysis;
import org.bian.dto.SDInterbankRelationshipManagementRetrieveInputModelServiceDomainRetrieveActionRecordServiceDomainPerformanceAnalysis;

import javax.validation.Valid;
  
/**
 * SDInterbankRelationshipManagementRetrieveInputModelServiceDomainRetrieveActionRecord
 */
public class SDInterbankRelationshipManagementRetrieveInputModelServiceDomainRetrieveActionRecord   {
  private SDInterbankRelationshipManagementRetrieveInputModelServiceDomainRetrieveActionRecordServiceDomainActivityAnalysis serviceDomainActivityAnalysis = null;

  private SDInterbankRelationshipManagementRetrieveInputModelServiceDomainRetrieveActionRecordServiceDomainPerformanceAnalysis serviceDomainPerformanceAnalysis = null;

  private SDInterbankRelationshipManagementRetrieveInputModelServiceDomainRetrieveActionRecordControlRecordPortfolioAnalysis controlRecordPortfolioAnalysis = null;


  /**
   * Get serviceDomainActivityAnalysis
   * @return serviceDomainActivityAnalysis
  **/

  public SDInterbankRelationshipManagementRetrieveInputModelServiceDomainRetrieveActionRecordServiceDomainActivityAnalysis getServiceDomainActivityAnalysis() {
    return serviceDomainActivityAnalysis;
  }

  public void setServiceDomainActivityAnalysis(SDInterbankRelationshipManagementRetrieveInputModelServiceDomainRetrieveActionRecordServiceDomainActivityAnalysis serviceDomainActivityAnalysis) {
    this.serviceDomainActivityAnalysis = serviceDomainActivityAnalysis;
  }


  /**
   * Get serviceDomainPerformanceAnalysis
   * @return serviceDomainPerformanceAnalysis
  **/

  public SDInterbankRelationshipManagementRetrieveInputModelServiceDomainRetrieveActionRecordServiceDomainPerformanceAnalysis getServiceDomainPerformanceAnalysis() {
    return serviceDomainPerformanceAnalysis;
  }

  public void setServiceDomainPerformanceAnalysis(SDInterbankRelationshipManagementRetrieveInputModelServiceDomainRetrieveActionRecordServiceDomainPerformanceAnalysis serviceDomainPerformanceAnalysis) {
    this.serviceDomainPerformanceAnalysis = serviceDomainPerformanceAnalysis;
  }


  /**
   * Get controlRecordPortfolioAnalysis
   * @return controlRecordPortfolioAnalysis
  **/

  public SDInterbankRelationshipManagementRetrieveInputModelServiceDomainRetrieveActionRecordControlRecordPortfolioAnalysis getControlRecordPortfolioAnalysis() {
    return controlRecordPortfolioAnalysis;
  }

  public void setControlRecordPortfolioAnalysis(SDInterbankRelationshipManagementRetrieveInputModelServiceDomainRetrieveActionRecordControlRecordPortfolioAnalysis controlRecordPortfolioAnalysis) {
    this.controlRecordPortfolioAnalysis = controlRecordPortfolioAnalysis;
  }


}


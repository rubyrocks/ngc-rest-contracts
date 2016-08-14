package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;




/**
 * Contract
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-08-14T19:33:03.884Z")

public class Contract   {
  private Long contractId = null;

  private String contractName = null;

  private String businessNumber = null;

  private String auctionAccessNumber = null;

  private String contractActivationDate = null;

  private Boolean isBuyer = null;

  private Boolean isSeller = null;

  private String tag = null;

  public Contract contractId(Long contractId) {
    this.contractId = contractId;
    return this;
  }

   /**
   * Get contractId
   * @return contractId
  **/
  @ApiModelProperty(required = true, value = "")
  public Long getContractId() {
    return contractId;
  }

  public void setContractId(Long contractId) {
    this.contractId = contractId;
  }

  public Contract contractName(String contractName) {
    this.contractName = contractName;
    return this;
  }

   /**
   * Get contractName
   * @return contractName
  **/
  @ApiModelProperty(required = true, value = "")
  public String getContractName() {
    return contractName;
  }

  public void setContractName(String contractName) {
    this.contractName = contractName;
  }

  public Contract businessNumber(String businessNumber) {
    this.businessNumber = businessNumber;
    return this;
  }

   /**
   * Get businessNumber
   * @return businessNumber
  **/
  @ApiModelProperty(required = true, value = "")
  public String getBusinessNumber() {
    return businessNumber;
  }

  public void setBusinessNumber(String businessNumber) {
    this.businessNumber = businessNumber;
  }

  public Contract auctionAccessNumber(String auctionAccessNumber) {
    this.auctionAccessNumber = auctionAccessNumber;
    return this;
  }

   /**
   * Get auctionAccessNumber
   * @return auctionAccessNumber
  **/
  @ApiModelProperty(required = true, value = "")
  public String getAuctionAccessNumber() {
    return auctionAccessNumber;
  }

  public void setAuctionAccessNumber(String auctionAccessNumber) {
    this.auctionAccessNumber = auctionAccessNumber;
  }

  public Contract contractActivationDate(String contractActivationDate) {
    this.contractActivationDate = contractActivationDate;
    return this;
  }

   /**
   * Get contractActivationDate
   * @return contractActivationDate
  **/
  @ApiModelProperty(required = true, value = "")
  public String getContractActivationDate() {
    return contractActivationDate;
  }

  public void setContractActivationDate(String contractActivationDate) {
    this.contractActivationDate = contractActivationDate;
  }

  public Contract isBuyer(Boolean isBuyer) {
    this.isBuyer = isBuyer;
    return this;
  }

   /**
   * Get isBuyer
   * @return isBuyer
  **/
  @ApiModelProperty(required = true, value = "")
  public Boolean getIsBuyer() {
    return isBuyer;
  }

  public void setIsBuyer(Boolean isBuyer) {
    this.isBuyer = isBuyer;
  }

  public Contract isSeller(Boolean isSeller) {
    this.isSeller = isSeller;
    return this;
  }

   /**
   * Get isSeller
   * @return isSeller
  **/
  @ApiModelProperty(required = true, value = "")
  public Boolean getIsSeller() {
    return isSeller;
  }

  public void setIsSeller(Boolean isSeller) {
    this.isSeller = isSeller;
  }

  public Contract tag(String tag) {
    this.tag = tag;
    return this;
  }

   /**
   * Get tag
   * @return tag
  **/
  @ApiModelProperty(value = "")
  public String getTag() {
    return tag;
  }

  public void setTag(String tag) {
    this.tag = tag;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Contract contract = (Contract) o;
    return Objects.equals(this.contractId, contract.contractId) &&
        Objects.equals(this.contractName, contract.contractName) &&
        Objects.equals(this.businessNumber, contract.businessNumber) &&
        Objects.equals(this.auctionAccessNumber, contract.auctionAccessNumber) &&
        Objects.equals(this.contractActivationDate, contract.contractActivationDate) &&
        Objects.equals(this.isBuyer, contract.isBuyer) &&
        Objects.equals(this.isSeller, contract.isSeller) &&
        Objects.equals(this.tag, contract.tag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contractId, contractName, businessNumber, auctionAccessNumber, contractActivationDate, isBuyer, isSeller, tag);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Contract {\n");
    
    sb.append("    contractId: ").append(toIndentedString(contractId)).append("\n");
    sb.append("    contractName: ").append(toIndentedString(contractName)).append("\n");
    sb.append("    businessNumber: ").append(toIndentedString(businessNumber)).append("\n");
    sb.append("    auctionAccessNumber: ").append(toIndentedString(auctionAccessNumber)).append("\n");
    sb.append("    contractActivationDate: ").append(toIndentedString(contractActivationDate)).append("\n");
    sb.append("    isBuyer: ").append(toIndentedString(isBuyer)).append("\n");
    sb.append("    isSeller: ").append(toIndentedString(isSeller)).append("\n");
    sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


/*
 * CyberSource Flex API
 * Simple PAN tokenization service
 *
 * OpenAPI spec version: 0.0.1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package Model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * V2payoutsProcessingInformationPayoutsOptions
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-09-22T07:56:07.186+05:30")
public class V2payoutsProcessingInformationPayoutsOptions {
  @SerializedName("acquirerMerchantId")
  private String acquirerMerchantId = null;

  @SerializedName("acquirerBin")
  private String acquirerBin = null;

  @SerializedName("retrievalReferenceNumber")
  private String retrievalReferenceNumber = null;

  @SerializedName("accountFundingReferenceId")
  private String accountFundingReferenceId = null;

  public V2payoutsProcessingInformationPayoutsOptions acquirerMerchantId(String acquirerMerchantId) {
    this.acquirerMerchantId = acquirerMerchantId;
    return this;
  }

   /**
   * This field identifies the card acceptor for defining the point of service terminal in both local and interchange environments. An acquirer-assigned code identifying the card acceptor for the transaction.  Depending on the acquirer and merchant billing and reporting requirements, the code can represent a merchant, a specific merchant location, or a specific merchant location terminal. Acquiring Institution Identification Code uniquely identifies the merchant. The value from the original is required in any subsequent messages, including reversals, chargebacks, and representments. * Applicable only for CTV for Payouts. 
   * @return acquirerMerchantId
  **/
  @ApiModelProperty(value = "This field identifies the card acceptor for defining the point of service terminal in both local and interchange environments. An acquirer-assigned code identifying the card acceptor for the transaction.  Depending on the acquirer and merchant billing and reporting requirements, the code can represent a merchant, a specific merchant location, or a specific merchant location terminal. Acquiring Institution Identification Code uniquely identifies the merchant. The value from the original is required in any subsequent messages, including reversals, chargebacks, and representments. * Applicable only for CTV for Payouts. ")
  public String getAcquirerMerchantId() {
    return acquirerMerchantId;
  }

  public void setAcquirerMerchantId(String acquirerMerchantId) {
    this.acquirerMerchantId = acquirerMerchantId;
  }

  public V2payoutsProcessingInformationPayoutsOptions acquirerBin(String acquirerBin) {
    this.acquirerBin = acquirerBin;
    return this;
  }

   /**
   * This code identifies the financial institution acting as the acquirer of this customer transaction. The acquirer is the member or system user that signed the merchant or ADM or dispensed cash.  This number is usually Visa-assigned. * Applicable only for CTV for Payouts. 
   * @return acquirerBin
  **/
  @ApiModelProperty(value = "This code identifies the financial institution acting as the acquirer of this customer transaction. The acquirer is the member or system user that signed the merchant or ADM or dispensed cash.  This number is usually Visa-assigned. * Applicable only for CTV for Payouts. ")
  public String getAcquirerBin() {
    return acquirerBin;
  }

  public void setAcquirerBin(String acquirerBin) {
    this.acquirerBin = acquirerBin;
  }

  public V2payoutsProcessingInformationPayoutsOptions retrievalReferenceNumber(String retrievalReferenceNumber) {
    this.retrievalReferenceNumber = retrievalReferenceNumber;
    return this;
  }

   /**
   * This field contains a number that is used with other data elements as a key to identify and track all messages related to a given cardholder transaction; that is, to a given transaction set. * Applicable only for CTV for Payouts. 
   * @return retrievalReferenceNumber
  **/
  @ApiModelProperty(value = "This field contains a number that is used with other data elements as a key to identify and track all messages related to a given cardholder transaction; that is, to a given transaction set. * Applicable only for CTV for Payouts. ")
  public String getRetrievalReferenceNumber() {
    return retrievalReferenceNumber;
  }

  public void setRetrievalReferenceNumber(String retrievalReferenceNumber) {
    this.retrievalReferenceNumber = retrievalReferenceNumber;
  }

  public V2payoutsProcessingInformationPayoutsOptions accountFundingReferenceId(String accountFundingReferenceId) {
    this.accountFundingReferenceId = accountFundingReferenceId;
    return this;
  }

   /**
   * Visa-generated transaction identifier (TID) that is unique for each original authorization and financial request. * Applicable only for CTV for Payouts. 
   * @return accountFundingReferenceId
  **/
  @ApiModelProperty(value = "Visa-generated transaction identifier (TID) that is unique for each original authorization and financial request. * Applicable only for CTV for Payouts. ")
  public String getAccountFundingReferenceId() {
    return accountFundingReferenceId;
  }

  public void setAccountFundingReferenceId(String accountFundingReferenceId) {
    this.accountFundingReferenceId = accountFundingReferenceId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V2payoutsProcessingInformationPayoutsOptions v2payoutsProcessingInformationPayoutsOptions = (V2payoutsProcessingInformationPayoutsOptions) o;
    return Objects.equals(this.acquirerMerchantId, v2payoutsProcessingInformationPayoutsOptions.acquirerMerchantId) &&
        Objects.equals(this.acquirerBin, v2payoutsProcessingInformationPayoutsOptions.acquirerBin) &&
        Objects.equals(this.retrievalReferenceNumber, v2payoutsProcessingInformationPayoutsOptions.retrievalReferenceNumber) &&
        Objects.equals(this.accountFundingReferenceId, v2payoutsProcessingInformationPayoutsOptions.accountFundingReferenceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(acquirerMerchantId, acquirerBin, retrievalReferenceNumber, accountFundingReferenceId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V2payoutsProcessingInformationPayoutsOptions {\n");
    
    sb.append("    acquirerMerchantId: ").append(toIndentedString(acquirerMerchantId)).append("\n");
    sb.append("    acquirerBin: ").append(toIndentedString(acquirerBin)).append("\n");
    sb.append("    retrievalReferenceNumber: ").append(toIndentedString(retrievalReferenceNumber)).append("\n");
    sb.append("    accountFundingReferenceId: ").append(toIndentedString(accountFundingReferenceId)).append("\n");
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


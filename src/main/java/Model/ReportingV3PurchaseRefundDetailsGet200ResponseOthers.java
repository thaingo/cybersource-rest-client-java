/*
 * CyberSource Merged Spec
 * All CyberSource API specs merged together. These are available at https://developer.cybersource.com/api/reference/api-reference.html
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
 * Other Merchant Details Values.
 */
@ApiModel(description = "Other Merchant Details Values.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-12-09T12:23:03.938+05:30")
public class ReportingV3PurchaseRefundDetailsGet200ResponseOthers {
  @SerializedName("requestId")
  private String requestId = null;

  @SerializedName("merchantData1")
  private String merchantData1 = null;

  @SerializedName("merchantData2")
  private String merchantData2 = null;

  @SerializedName("merchantData3")
  private String merchantData3 = null;

  @SerializedName("merchantData4")
  private String merchantData4 = null;

  @SerializedName("firstName")
  private String firstName = null;

  @SerializedName("lastName")
  private String lastName = null;

  public ReportingV3PurchaseRefundDetailsGet200ResponseOthers requestId(String requestId) {
    this.requestId = requestId;
    return this;
  }

   /**
   * An unique identification number assigned by CyberSource to identify the submitted request.
   * @return requestId
  **/
  @ApiModelProperty(example = "12345678901234567890123456", value = "An unique identification number assigned by CyberSource to identify the submitted request.")
  public String getRequestId() {
    return requestId;
  }

  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }

  public ReportingV3PurchaseRefundDetailsGet200ResponseOthers merchantData1(String merchantData1) {
    this.merchantData1 = merchantData1;
    return this;
  }

   /**
   * Merchant Defined Data
   * @return merchantData1
  **/
  @ApiModelProperty(example = "Merchant Defined Data", value = "Merchant Defined Data")
  public String getMerchantData1() {
    return merchantData1;
  }

  public void setMerchantData1(String merchantData1) {
    this.merchantData1 = merchantData1;
  }

  public ReportingV3PurchaseRefundDetailsGet200ResponseOthers merchantData2(String merchantData2) {
    this.merchantData2 = merchantData2;
    return this;
  }

   /**
   * Merchant Defined Data
   * @return merchantData2
  **/
  @ApiModelProperty(example = "Merchant Defined Data", value = "Merchant Defined Data")
  public String getMerchantData2() {
    return merchantData2;
  }

  public void setMerchantData2(String merchantData2) {
    this.merchantData2 = merchantData2;
  }

  public ReportingV3PurchaseRefundDetailsGet200ResponseOthers merchantData3(String merchantData3) {
    this.merchantData3 = merchantData3;
    return this;
  }

   /**
   * Merchant Defined Data
   * @return merchantData3
  **/
  @ApiModelProperty(example = "Merchant Defined Data", value = "Merchant Defined Data")
  public String getMerchantData3() {
    return merchantData3;
  }

  public void setMerchantData3(String merchantData3) {
    this.merchantData3 = merchantData3;
  }

  public ReportingV3PurchaseRefundDetailsGet200ResponseOthers merchantData4(String merchantData4) {
    this.merchantData4 = merchantData4;
    return this;
  }

   /**
   * Merchant Defined Data
   * @return merchantData4
  **/
  @ApiModelProperty(example = "Merchant Defined Data", value = "Merchant Defined Data")
  public String getMerchantData4() {
    return merchantData4;
  }

  public void setMerchantData4(String merchantData4) {
    this.merchantData4 = merchantData4;
  }

  public ReportingV3PurchaseRefundDetailsGet200ResponseOthers firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

   /**
   * First Name
   * @return firstName
  **/
  @ApiModelProperty(example = "First Name", value = "First Name")
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public ReportingV3PurchaseRefundDetailsGet200ResponseOthers lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

   /**
   * Last Name
   * @return lastName
  **/
  @ApiModelProperty(example = "Last Name", value = "Last Name")
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportingV3PurchaseRefundDetailsGet200ResponseOthers reportingV3PurchaseRefundDetailsGet200ResponseOthers = (ReportingV3PurchaseRefundDetailsGet200ResponseOthers) o;
    return Objects.equals(this.requestId, reportingV3PurchaseRefundDetailsGet200ResponseOthers.requestId) &&
        Objects.equals(this.merchantData1, reportingV3PurchaseRefundDetailsGet200ResponseOthers.merchantData1) &&
        Objects.equals(this.merchantData2, reportingV3PurchaseRefundDetailsGet200ResponseOthers.merchantData2) &&
        Objects.equals(this.merchantData3, reportingV3PurchaseRefundDetailsGet200ResponseOthers.merchantData3) &&
        Objects.equals(this.merchantData4, reportingV3PurchaseRefundDetailsGet200ResponseOthers.merchantData4) &&
        Objects.equals(this.firstName, reportingV3PurchaseRefundDetailsGet200ResponseOthers.firstName) &&
        Objects.equals(this.lastName, reportingV3PurchaseRefundDetailsGet200ResponseOthers.lastName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestId, merchantData1, merchantData2, merchantData3, merchantData4, firstName, lastName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportingV3PurchaseRefundDetailsGet200ResponseOthers {\n");
    
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("    merchantData1: ").append(toIndentedString(merchantData1)).append("\n");
    sb.append("    merchantData2: ").append(toIndentedString(merchantData2)).append("\n");
    sb.append("    merchantData3: ").append(toIndentedString(merchantData3)).append("\n");
    sb.append("    merchantData4: ").append(toIndentedString(merchantData4)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
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


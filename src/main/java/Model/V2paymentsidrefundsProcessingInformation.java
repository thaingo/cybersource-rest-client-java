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
import Model.V2paymentsidrefundsProcessingInformationRecurringOptions;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * V2paymentsidrefundsProcessingInformation
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-09-22T07:56:07.186+05:30")
public class V2paymentsidrefundsProcessingInformation {
  @SerializedName("paymentSolution")
  private String paymentSolution = null;

  @SerializedName("reconciliationId")
  private String reconciliationId = null;

  @SerializedName("linkId")
  private String linkId = null;

  @SerializedName("reportGroup")
  private String reportGroup = null;

  @SerializedName("visaCheckoutId")
  private String visaCheckoutId = null;

  @SerializedName("purchaseLevel")
  private String purchaseLevel = null;

  @SerializedName("recurringOptions")
  private V2paymentsidrefundsProcessingInformationRecurringOptions recurringOptions = null;

  public V2paymentsidrefundsProcessingInformation paymentSolution(String paymentSolution) {
    this.paymentSolution = paymentSolution;
    return this;
  }

   /**
   * Type of digital payment solution that is being used for the transaction. Possible Values:   - **visacheckout**: Visa Checkout.  - **001**: Apple Pay.  - **005**: Masterpass. Required for Masterpass transactions on OmniPay Direct.  - **006**: Android Pay.  - **008**: Samsung Pay. 
   * @return paymentSolution
  **/
  @ApiModelProperty(value = "Type of digital payment solution that is being used for the transaction. Possible Values:   - **visacheckout**: Visa Checkout.  - **001**: Apple Pay.  - **005**: Masterpass. Required for Masterpass transactions on OmniPay Direct.  - **006**: Android Pay.  - **008**: Samsung Pay. ")
  public String getPaymentSolution() {
    return paymentSolution;
  }

  public void setPaymentSolution(String paymentSolution) {
    this.paymentSolution = paymentSolution;
  }

  public V2paymentsidrefundsProcessingInformation reconciliationId(String reconciliationId) {
    this.reconciliationId = reconciliationId;
    return this;
  }

   /**
   * Please check with Cybersource customer support to see if your merchant account is configured correctly so you can include this field in your request. * For Payouts: max length for FDCCompass is String (22). 
   * @return reconciliationId
  **/
  @ApiModelProperty(value = "Please check with Cybersource customer support to see if your merchant account is configured correctly so you can include this field in your request. * For Payouts: max length for FDCCompass is String (22). ")
  public String getReconciliationId() {
    return reconciliationId;
  }

  public void setReconciliationId(String reconciliationId) {
    this.reconciliationId = reconciliationId;
  }

  public V2paymentsidrefundsProcessingInformation linkId(String linkId) {
    this.linkId = linkId;
    return this;
  }

   /**
   * Value that links the current payment request to the original request. Set this value to the ID that was returned in the reply message from the original payment request.  This value is used for:   - Partial authorizations.  - Split shipments. 
   * @return linkId
  **/
  @ApiModelProperty(value = "Value that links the current payment request to the original request. Set this value to the ID that was returned in the reply message from the original payment request.  This value is used for:   - Partial authorizations.  - Split shipments. ")
  public String getLinkId() {
    return linkId;
  }

  public void setLinkId(String linkId) {
    this.linkId = linkId;
  }

  public V2paymentsidrefundsProcessingInformation reportGroup(String reportGroup) {
    this.reportGroup = reportGroup;
    return this;
  }

   /**
   * Attribute that lets you define custom grouping for your processor reports. This field is supported only for **Litle**. 
   * @return reportGroup
  **/
  @ApiModelProperty(value = "Attribute that lets you define custom grouping for your processor reports. This field is supported only for **Litle**. ")
  public String getReportGroup() {
    return reportGroup;
  }

  public void setReportGroup(String reportGroup) {
    this.reportGroup = reportGroup;
  }

  public V2paymentsidrefundsProcessingInformation visaCheckoutId(String visaCheckoutId) {
    this.visaCheckoutId = visaCheckoutId;
    return this;
  }

   /**
   * Identifier for the **Visa Checkout** order. Visa Checkout provides a unique order ID for every transaction in the Visa Checkout **callID** field. 
   * @return visaCheckoutId
  **/
  @ApiModelProperty(value = "Identifier for the **Visa Checkout** order. Visa Checkout provides a unique order ID for every transaction in the Visa Checkout **callID** field. ")
  public String getVisaCheckoutId() {
    return visaCheckoutId;
  }

  public void setVisaCheckoutId(String visaCheckoutId) {
    this.visaCheckoutId = visaCheckoutId;
  }

  public V2paymentsidrefundsProcessingInformation purchaseLevel(String purchaseLevel) {
    this.purchaseLevel = purchaseLevel;
    return this;
  }

   /**
   * Set this field to 3 to indicate that the request includes Level III data.
   * @return purchaseLevel
  **/
  @ApiModelProperty(value = "Set this field to 3 to indicate that the request includes Level III data.")
  public String getPurchaseLevel() {
    return purchaseLevel;
  }

  public void setPurchaseLevel(String purchaseLevel) {
    this.purchaseLevel = purchaseLevel;
  }

  public V2paymentsidrefundsProcessingInformation recurringOptions(V2paymentsidrefundsProcessingInformationRecurringOptions recurringOptions) {
    this.recurringOptions = recurringOptions;
    return this;
  }

   /**
   * Get recurringOptions
   * @return recurringOptions
  **/
  @ApiModelProperty(value = "")
  public V2paymentsidrefundsProcessingInformationRecurringOptions getRecurringOptions() {
    return recurringOptions;
  }

  public void setRecurringOptions(V2paymentsidrefundsProcessingInformationRecurringOptions recurringOptions) {
    this.recurringOptions = recurringOptions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V2paymentsidrefundsProcessingInformation v2paymentsidrefundsProcessingInformation = (V2paymentsidrefundsProcessingInformation) o;
    return Objects.equals(this.paymentSolution, v2paymentsidrefundsProcessingInformation.paymentSolution) &&
        Objects.equals(this.reconciliationId, v2paymentsidrefundsProcessingInformation.reconciliationId) &&
        Objects.equals(this.linkId, v2paymentsidrefundsProcessingInformation.linkId) &&
        Objects.equals(this.reportGroup, v2paymentsidrefundsProcessingInformation.reportGroup) &&
        Objects.equals(this.visaCheckoutId, v2paymentsidrefundsProcessingInformation.visaCheckoutId) &&
        Objects.equals(this.purchaseLevel, v2paymentsidrefundsProcessingInformation.purchaseLevel) &&
        Objects.equals(this.recurringOptions, v2paymentsidrefundsProcessingInformation.recurringOptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentSolution, reconciliationId, linkId, reportGroup, visaCheckoutId, purchaseLevel, recurringOptions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V2paymentsidrefundsProcessingInformation {\n");
    
    sb.append("    paymentSolution: ").append(toIndentedString(paymentSolution)).append("\n");
    sb.append("    reconciliationId: ").append(toIndentedString(reconciliationId)).append("\n");
    sb.append("    linkId: ").append(toIndentedString(linkId)).append("\n");
    sb.append("    reportGroup: ").append(toIndentedString(reportGroup)).append("\n");
    sb.append("    visaCheckoutId: ").append(toIndentedString(visaCheckoutId)).append("\n");
    sb.append("    purchaseLevel: ").append(toIndentedString(purchaseLevel)).append("\n");
    sb.append("    recurringOptions: ").append(toIndentedString(recurringOptions)).append("\n");
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


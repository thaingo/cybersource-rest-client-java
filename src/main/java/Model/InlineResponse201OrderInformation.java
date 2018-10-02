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
import Model.InlineResponse201OrderInformationAmountDetails;
import Model.InlineResponse201OrderInformationInvoiceDetails;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * InlineResponse201OrderInformation
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-09-22T07:56:07.186+05:30")
public class InlineResponse201OrderInformation {
  @SerializedName("amountDetails")
  private InlineResponse201OrderInformationAmountDetails amountDetails = null;

  @SerializedName("invoiceDetails")
  private InlineResponse201OrderInformationInvoiceDetails invoiceDetails = null;

  public InlineResponse201OrderInformation amountDetails(InlineResponse201OrderInformationAmountDetails amountDetails) {
    this.amountDetails = amountDetails;
    return this;
  }

   /**
   * Get amountDetails
   * @return amountDetails
  **/
  @ApiModelProperty(value = "")
  public InlineResponse201OrderInformationAmountDetails getAmountDetails() {
    return amountDetails;
  }

  public void setAmountDetails(InlineResponse201OrderInformationAmountDetails amountDetails) {
    this.amountDetails = amountDetails;
  }

  public InlineResponse201OrderInformation invoiceDetails(InlineResponse201OrderInformationInvoiceDetails invoiceDetails) {
    this.invoiceDetails = invoiceDetails;
    return this;
  }

   /**
   * Get invoiceDetails
   * @return invoiceDetails
  **/
  @ApiModelProperty(value = "")
  public InlineResponse201OrderInformationInvoiceDetails getInvoiceDetails() {
    return invoiceDetails;
  }

  public void setInvoiceDetails(InlineResponse201OrderInformationInvoiceDetails invoiceDetails) {
    this.invoiceDetails = invoiceDetails;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse201OrderInformation inlineResponse201OrderInformation = (InlineResponse201OrderInformation) o;
    return Objects.equals(this.amountDetails, inlineResponse201OrderInformation.amountDetails) &&
        Objects.equals(this.invoiceDetails, inlineResponse201OrderInformation.invoiceDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amountDetails, invoiceDetails);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse201OrderInformation {\n");
    
    sb.append("    amountDetails: ").append(toIndentedString(amountDetails)).append("\n");
    sb.append("    invoiceDetails: ").append(toIndentedString(invoiceDetails)).append("\n");
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


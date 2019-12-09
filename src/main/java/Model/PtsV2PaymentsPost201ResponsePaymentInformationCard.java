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
 * PtsV2PaymentsPost201ResponsePaymentInformationCard
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-12-09T12:23:03.938+05:30")
public class PtsV2PaymentsPost201ResponsePaymentInformationCard {
  @SerializedName("suffix")
  private String suffix = null;

  public PtsV2PaymentsPost201ResponsePaymentInformationCard suffix(String suffix) {
    this.suffix = suffix;
    return this;
  }

   /**
   * Last four digits of the cardholder’s account number. This field is returned only for tokenized transactions. You can use this value on the receipt that you give to the cardholder.  **Note** This field is returned only for CyberSource through VisaNet and FDC Nashville Global.  #### CyberSource through VisaNet The value for this field corresponds to the following data in the TC 33 capture file: - Record: CP01 TCRB - Position: 85 - Field: American Express last 4 PAN return indicator. 
   * @return suffix
  **/
  @ApiModelProperty(value = "Last four digits of the cardholder’s account number. This field is returned only for tokenized transactions. You can use this value on the receipt that you give to the cardholder.  **Note** This field is returned only for CyberSource through VisaNet and FDC Nashville Global.  #### CyberSource through VisaNet The value for this field corresponds to the following data in the TC 33 capture file: - Record: CP01 TCRB - Position: 85 - Field: American Express last 4 PAN return indicator. ")
  public String getSuffix() {
    return suffix;
  }

  public void setSuffix(String suffix) {
    this.suffix = suffix;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PtsV2PaymentsPost201ResponsePaymentInformationCard ptsV2PaymentsPost201ResponsePaymentInformationCard = (PtsV2PaymentsPost201ResponsePaymentInformationCard) o;
    return Objects.equals(this.suffix, ptsV2PaymentsPost201ResponsePaymentInformationCard.suffix);
  }

  @Override
  public int hashCode() {
    return Objects.hash(suffix);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PtsV2PaymentsPost201ResponsePaymentInformationCard {\n");
    
    sb.append("    suffix: ").append(toIndentedString(suffix)).append("\n");
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


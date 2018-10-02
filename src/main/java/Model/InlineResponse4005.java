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
import Model.InlineResponse201ErrorInformationDetails;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * InlineResponse4005
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-09-22T07:56:07.186+05:30")
public class InlineResponse4005 {
  @SerializedName("submitTimeUtc")
  private String submitTimeUtc = null;

  @SerializedName("status")
  private String status = null;

  /**
   * The reason of the status. 
   */
  @JsonAdapter(ReasonEnum.Adapter.class)
  public enum ReasonEnum {
    MISSING_FIELD("MISSING_FIELD"),
    
    INVALID_DATA("INVALID_DATA"),
    
    DUPLICATE_REQUEST("DUPLICATE_REQUEST"),
    
    INVALID_MERCHANT_CONFIGURATION("INVALID_MERCHANT_CONFIGURATION"),
    
    INVALID_AMOUNT("INVALID_AMOUNT"),
    
    DEBIT_CARD_USEAGE_EXCEEDD_LIMIT("DEBIT_CARD_USEAGE_EXCEEDD_LIMIT");

    private String value;

    ReasonEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ReasonEnum fromValue(String text) {
      for (ReasonEnum b : ReasonEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ReasonEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ReasonEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ReasonEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ReasonEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("reason")
  private ReasonEnum reason = null;

  @SerializedName("message")
  private String message = null;

  @SerializedName("details")
  private List<InlineResponse201ErrorInformationDetails> details = null;

  public InlineResponse4005 submitTimeUtc(String submitTimeUtc) {
    this.submitTimeUtc = submitTimeUtc;
    return this;
  }

   /**
   * Time of request in UTC. &#x60;Format: YYYY-MM-DDThh:mm:ssZ&#x60;  Example 2016-08-11T22:47:57Z equals August 11, 2016, at 22:47:57 (10:47:57 p.m.). The T separates the date and the time. The Z indicates UTC. 
   * @return submitTimeUtc
  **/
  @ApiModelProperty(value = "Time of request in UTC. `Format: YYYY-MM-DDThh:mm:ssZ`  Example 2016-08-11T22:47:57Z equals August 11, 2016, at 22:47:57 (10:47:57 p.m.). The T separates the date and the time. The Z indicates UTC. ")
  public String getSubmitTimeUtc() {
    return submitTimeUtc;
  }

  public void setSubmitTimeUtc(String submitTimeUtc) {
    this.submitTimeUtc = submitTimeUtc;
  }

  public InlineResponse4005 status(String status) {
    this.status = status;
    return this;
  }

   /**
   * The status of the submitted transaction.
   * @return status
  **/
  @ApiModelProperty(value = "The status of the submitted transaction.")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public InlineResponse4005 reason(ReasonEnum reason) {
    this.reason = reason;
    return this;
  }

   /**
   * The reason of the status. 
   * @return reason
  **/
  @ApiModelProperty(value = "The reason of the status. ")
  public ReasonEnum getReason() {
    return reason;
  }

  public void setReason(ReasonEnum reason) {
    this.reason = reason;
  }

  public InlineResponse4005 message(String message) {
    this.message = message;
    return this;
  }

   /**
   * The detail message related to the status and reason listed above. Possible value is:    - Your aggregator or acquirer is not accepting transactions from you at this time.   - Your aggregator or acquirer is not accepting this transaction.   - CyberSource declined the request because the credit card has expired. You might also receive this value if     the expiration date you provided does not match the date the issuing bank has on file.   - The bank declined the transaction.   - The merchant reference number for this authorization request matches the merchant reference number of     another authorization request that you sent within the past 15 minutes. Resend the request with a unique     merchant reference number.   - The credit card number did not pass CyberSource basic checks.   - Data provided is not consistent with the request. For example, you requested a product with negative cost.   - The request is missing a required field. 
   * @return message
  **/
  @ApiModelProperty(value = "The detail message related to the status and reason listed above. Possible value is:    - Your aggregator or acquirer is not accepting transactions from you at this time.   - Your aggregator or acquirer is not accepting this transaction.   - CyberSource declined the request because the credit card has expired. You might also receive this value if     the expiration date you provided does not match the date the issuing bank has on file.   - The bank declined the transaction.   - The merchant reference number for this authorization request matches the merchant reference number of     another authorization request that you sent within the past 15 minutes. Resend the request with a unique     merchant reference number.   - The credit card number did not pass CyberSource basic checks.   - Data provided is not consistent with the request. For example, you requested a product with negative cost.   - The request is missing a required field. ")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public InlineResponse4005 details(List<InlineResponse201ErrorInformationDetails> details) {
    this.details = details;
    return this;
  }

  public InlineResponse4005 addDetailsItem(InlineResponse201ErrorInformationDetails detailsItem) {
    if (this.details == null) {
      this.details = new ArrayList<InlineResponse201ErrorInformationDetails>();
    }
    this.details.add(detailsItem);
    return this;
  }

   /**
   * Get details
   * @return details
  **/
  @ApiModelProperty(value = "")
  public List<InlineResponse201ErrorInformationDetails> getDetails() {
    return details;
  }

  public void setDetails(List<InlineResponse201ErrorInformationDetails> details) {
    this.details = details;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse4005 inlineResponse4005 = (InlineResponse4005) o;
    return Objects.equals(this.submitTimeUtc, inlineResponse4005.submitTimeUtc) &&
        Objects.equals(this.status, inlineResponse4005.status) &&
        Objects.equals(this.reason, inlineResponse4005.reason) &&
        Objects.equals(this.message, inlineResponse4005.message) &&
        Objects.equals(this.details, inlineResponse4005.details);
  }

  @Override
  public int hashCode() {
    return Objects.hash(submitTimeUtc, status, reason, message, details);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse4005 {\n");
    
    sb.append("    submitTimeUtc: ").append(toIndentedString(submitTimeUtc)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
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


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
 * Riskv1authenticationresultsConsumerAuthenticationInformation
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-12-16T17:43:55.224+05:30")
public class Riskv1authenticationresultsConsumerAuthenticationInformation {
  @SerializedName("acsRenderingType")
  private String acsRenderingType = null;

  @SerializedName("acsTransactionId")
  private String acsTransactionId = null;

  @SerializedName("authenticationTransactionId")
  private String authenticationTransactionId = null;

  @SerializedName("authenticationType")
  private String authenticationType = null;

  @SerializedName("challengeCancelCode")
  private String challengeCancelCode = null;

  @SerializedName("effectiveAuthenticationType")
  private String effectiveAuthenticationType = null;

  @SerializedName("directoryServerErrorCode")
  private String directoryServerErrorCode = null;

  @SerializedName("directoryServerErrorDescription")
  private String directoryServerErrorDescription = null;

  @SerializedName("interactionCounter")
  private String interactionCounter = null;

  @SerializedName("signedParesStatusReason")
  private String signedParesStatusReason = null;

  @SerializedName("sdkTransactionId")
  private String sdkTransactionId = null;

  @SerializedName("signedPares")
  private String signedPares = null;

  @SerializedName("threeDSServerTransactionId")
  private String threeDSServerTransactionId = null;

  @SerializedName("whiteListStatus")
  private String whiteListStatus = null;

  @SerializedName("whiteListStatusSource")
  private String whiteListStatusSource = null;

  public Riskv1authenticationresultsConsumerAuthenticationInformation acsRenderingType(String acsRenderingType) {
    this.acsRenderingType = acsRenderingType;
    return this;
  }

   /**
   * Identifies the UI Type the ACS will use to complete the challenge. **NOTE**: Only available for App transactions using the Cardinal Mobile SDK. 
   * @return acsRenderingType
  **/
  @ApiModelProperty(value = "Identifies the UI Type the ACS will use to complete the challenge. **NOTE**: Only available for App transactions using the Cardinal Mobile SDK. ")
  public String getAcsRenderingType() {
    return acsRenderingType;
  }

  public void setAcsRenderingType(String acsRenderingType) {
    this.acsRenderingType = acsRenderingType;
  }

  public Riskv1authenticationresultsConsumerAuthenticationInformation acsTransactionId(String acsTransactionId) {
    this.acsTransactionId = acsTransactionId;
    return this;
  }

   /**
   * Unique transaction identifier assigned by the ACS to identify a single transaction. 
   * @return acsTransactionId
  **/
  @ApiModelProperty(value = "Unique transaction identifier assigned by the ACS to identify a single transaction. ")
  public String getAcsTransactionId() {
    return acsTransactionId;
  }

  public void setAcsTransactionId(String acsTransactionId) {
    this.acsTransactionId = acsTransactionId;
  }

  public Riskv1authenticationresultsConsumerAuthenticationInformation authenticationTransactionId(String authenticationTransactionId) {
    this.authenticationTransactionId = authenticationTransactionId;
    return this;
  }

   /**
   * Payer authentication transaction identifier passed to link the check enrollment and validate authentication messages. **Note**: Required for Standard integration for enroll service. Required for Hybrid integration for validate service. 
   * @return authenticationTransactionId
  **/
  @ApiModelProperty(value = "Payer authentication transaction identifier passed to link the check enrollment and validate authentication messages. **Note**: Required for Standard integration for enroll service. Required for Hybrid integration for validate service. ")
  public String getAuthenticationTransactionId() {
    return authenticationTransactionId;
  }

  public void setAuthenticationTransactionId(String authenticationTransactionId) {
    this.authenticationTransactionId = authenticationTransactionId;
  }

  public Riskv1authenticationresultsConsumerAuthenticationInformation authenticationType(String authenticationType) {
    this.authenticationType = authenticationType;
    return this;
  }

   /**
   * Indicates the type of authentication that will be used to challenge the card holder.  Possible Values:  01 - Static  02 - Dynamic  03 - OOB (Out of Band)  04 - Decoupled **NOTE**:  EMV 3-D Secure version 2.1.0 supports values 01-03.  Version 2.2.0 supports values 01-04.  Decoupled authentication is not supported at this time. 
   * @return authenticationType
  **/
  @ApiModelProperty(value = "Indicates the type of authentication that will be used to challenge the card holder.  Possible Values:  01 - Static  02 - Dynamic  03 - OOB (Out of Band)  04 - Decoupled **NOTE**:  EMV 3-D Secure version 2.1.0 supports values 01-03.  Version 2.2.0 supports values 01-04.  Decoupled authentication is not supported at this time. ")
  public String getAuthenticationType() {
    return authenticationType;
  }

  public void setAuthenticationType(String authenticationType) {
    this.authenticationType = authenticationType;
  }

  public Riskv1authenticationresultsConsumerAuthenticationInformation challengeCancelCode(String challengeCancelCode) {
    this.challengeCancelCode = challengeCancelCode;
    return this;
  }

   /**
   * An indicator as to why the transaction was canceled. Possible Values:  - &#x60;01&#x60;: Cardholder selected Cancel. - &#x60;02&#x60;: Reserved for future EMVCo use (values invalid until defined by EMVCo). - &#x60;03&#x60;: Transaction Timed Out—Decoupled Authentication - &#x60;04&#x60;: Transaction timed out at ACS—other timeouts - &#x60;05&#x60;: Transaction Timed out at ACS - First CReq not received by ACS - &#x60;06&#x60;: Transaction Error - &#x60;07&#x60;: Unknown - &#x60;08&#x60;: Transaction Timed Out at SDK 
   * @return challengeCancelCode
  **/
  @ApiModelProperty(value = "An indicator as to why the transaction was canceled. Possible Values:  - `01`: Cardholder selected Cancel. - `02`: Reserved for future EMVCo use (values invalid until defined by EMVCo). - `03`: Transaction Timed Out—Decoupled Authentication - `04`: Transaction timed out at ACS—other timeouts - `05`: Transaction Timed out at ACS - First CReq not received by ACS - `06`: Transaction Error - `07`: Unknown - `08`: Transaction Timed Out at SDK ")
  public String getChallengeCancelCode() {
    return challengeCancelCode;
  }

  public void setChallengeCancelCode(String challengeCancelCode) {
    this.challengeCancelCode = challengeCancelCode;
  }

  public Riskv1authenticationresultsConsumerAuthenticationInformation effectiveAuthenticationType(String effectiveAuthenticationType) {
    this.effectiveAuthenticationType = effectiveAuthenticationType;
    return this;
  }

   /**
   * This field describes the type of 3DS transaction flow that took place.  It can be one of three possible flows; CH - Challenge FR - Frictionless FD - Frictionless with delegation, (challenge not generated by the issuer but by the scheme on behalf of the issuer). 
   * @return effectiveAuthenticationType
  **/
  @ApiModelProperty(value = "This field describes the type of 3DS transaction flow that took place.  It can be one of three possible flows; CH - Challenge FR - Frictionless FD - Frictionless with delegation, (challenge not generated by the issuer but by the scheme on behalf of the issuer). ")
  public String getEffectiveAuthenticationType() {
    return effectiveAuthenticationType;
  }

  public void setEffectiveAuthenticationType(String effectiveAuthenticationType) {
    this.effectiveAuthenticationType = effectiveAuthenticationType;
  }

  public Riskv1authenticationresultsConsumerAuthenticationInformation directoryServerErrorCode(String directoryServerErrorCode) {
    this.directoryServerErrorCode = directoryServerErrorCode;
    return this;
  }

   /**
   * The directory server error code indicating a problem with this transaction. 
   * @return directoryServerErrorCode
  **/
  @ApiModelProperty(value = "The directory server error code indicating a problem with this transaction. ")
  public String getDirectoryServerErrorCode() {
    return directoryServerErrorCode;
  }

  public void setDirectoryServerErrorCode(String directoryServerErrorCode) {
    this.directoryServerErrorCode = directoryServerErrorCode;
  }

  public Riskv1authenticationresultsConsumerAuthenticationInformation directoryServerErrorDescription(String directoryServerErrorDescription) {
    this.directoryServerErrorDescription = directoryServerErrorDescription;
    return this;
  }

   /**
   * Directory server text and additional detail about the error for this transaction. 
   * @return directoryServerErrorDescription
  **/
  @ApiModelProperty(value = "Directory server text and additional detail about the error for this transaction. ")
  public String getDirectoryServerErrorDescription() {
    return directoryServerErrorDescription;
  }

  public void setDirectoryServerErrorDescription(String directoryServerErrorDescription) {
    this.directoryServerErrorDescription = directoryServerErrorDescription;
  }

  public Riskv1authenticationresultsConsumerAuthenticationInformation interactionCounter(String interactionCounter) {
    this.interactionCounter = interactionCounter;
    return this;
  }

   /**
   * Indicates the number of authentication cycles attempted by the cardholder and is tracked by the Issuing Banks ACS.Example: if customer gets the challenge window and enter in their one time password and hit submit then that interaction counter should just be 1. When customer gets the challenge window and the bank asks if they want to have the one time password  sent to their phone or their email and they have to choose before going to the next screen to enter in their one time password then this interaction count would be 2. One for the selection of how they want the one time password delivered and another with them actually entering in the one time password and hitting the submit button. 
   * @return interactionCounter
  **/
  @ApiModelProperty(value = "Indicates the number of authentication cycles attempted by the cardholder and is tracked by the Issuing Banks ACS.Example: if customer gets the challenge window and enter in their one time password and hit submit then that interaction counter should just be 1. When customer gets the challenge window and the bank asks if they want to have the one time password  sent to their phone or their email and they have to choose before going to the next screen to enter in their one time password then this interaction count would be 2. One for the selection of how they want the one time password delivered and another with them actually entering in the one time password and hitting the submit button. ")
  public String getInteractionCounter() {
    return interactionCounter;
  }

  public void setInteractionCounter(String interactionCounter) {
    this.interactionCounter = interactionCounter;
  }

  public Riskv1authenticationresultsConsumerAuthenticationInformation signedParesStatusReason(String signedParesStatusReason) {
    this.signedParesStatusReason = signedParesStatusReason;
    return this;
  }

   /**
   * Provides additional information as to why the PAResStatus has a specific value. 
   * @return signedParesStatusReason
  **/
  @ApiModelProperty(value = "Provides additional information as to why the PAResStatus has a specific value. ")
  public String getSignedParesStatusReason() {
    return signedParesStatusReason;
  }

  public void setSignedParesStatusReason(String signedParesStatusReason) {
    this.signedParesStatusReason = signedParesStatusReason;
  }

  public Riskv1authenticationresultsConsumerAuthenticationInformation sdkTransactionId(String sdkTransactionId) {
    this.sdkTransactionId = sdkTransactionId;
    return this;
  }

   /**
   * SDK unique transaction identifier that is generated on each new transaction. 
   * @return sdkTransactionId
  **/
  @ApiModelProperty(value = "SDK unique transaction identifier that is generated on each new transaction. ")
  public String getSdkTransactionId() {
    return sdkTransactionId;
  }

  public void setSdkTransactionId(String sdkTransactionId) {
    this.sdkTransactionId = sdkTransactionId;
  }

  public Riskv1authenticationresultsConsumerAuthenticationInformation signedPares(String signedPares) {
    this.signedPares = signedPares;
    return this;
  }

   /**
   * Payer authentication result (PARes) message returned by the card-issuing bank. If you need to show proof of enrollment checking, you may need to decrypt and parse the string for the information required by the payment card company. For more information, see \&quot;Storing Payer Authentication Data,\&quot; page 160. Important The value is in base64. You must remove all carriage returns and line feeds before adding the PARes to the request. 
   * @return signedPares
  **/
  @ApiModelProperty(required = true, value = "Payer authentication result (PARes) message returned by the card-issuing bank. If you need to show proof of enrollment checking, you may need to decrypt and parse the string for the information required by the payment card company. For more information, see \"Storing Payer Authentication Data,\" page 160. Important The value is in base64. You must remove all carriage returns and line feeds before adding the PARes to the request. ")
  public String getSignedPares() {
    return signedPares;
  }

  public void setSignedPares(String signedPares) {
    this.signedPares = signedPares;
  }

  public Riskv1authenticationresultsConsumerAuthenticationInformation threeDSServerTransactionId(String threeDSServerTransactionId) {
    this.threeDSServerTransactionId = threeDSServerTransactionId;
    return this;
  }

   /**
   * Unique transaction identifier assigned by the 3DS Server to identify a single transaction. 
   * @return threeDSServerTransactionId
  **/
  @ApiModelProperty(value = "Unique transaction identifier assigned by the 3DS Server to identify a single transaction. ")
  public String getThreeDSServerTransactionId() {
    return threeDSServerTransactionId;
  }

  public void setThreeDSServerTransactionId(String threeDSServerTransactionId) {
    this.threeDSServerTransactionId = threeDSServerTransactionId;
  }

  public Riskv1authenticationresultsConsumerAuthenticationInformation whiteListStatus(String whiteListStatus) {
    this.whiteListStatus = whiteListStatus;
    return this;
  }

   /**
   * Enables the communication of trusted beneficiary/whitelist status between the ACS, the DS and the 3DS Requestor.  Possible Values:  Y - 3DS Requestor is whitelisted by cardholder  N - 3DS Requestor is not whitelisted by cardholder 
   * @return whiteListStatus
  **/
  @ApiModelProperty(value = "Enables the communication of trusted beneficiary/whitelist status between the ACS, the DS and the 3DS Requestor.  Possible Values:  Y - 3DS Requestor is whitelisted by cardholder  N - 3DS Requestor is not whitelisted by cardholder ")
  public String getWhiteListStatus() {
    return whiteListStatus;
  }

  public void setWhiteListStatus(String whiteListStatus) {
    this.whiteListStatus = whiteListStatus;
  }

  public Riskv1authenticationresultsConsumerAuthenticationInformation whiteListStatusSource(String whiteListStatusSource) {
    this.whiteListStatusSource = whiteListStatusSource;
    return this;
  }

   /**
   * This data element will be populated by the system setting Whitelist Status. Possible Values: 01 - 3DS/ Server/ 02 – DS/03 - ACS 
   * @return whiteListStatusSource
  **/
  @ApiModelProperty(value = "This data element will be populated by the system setting Whitelist Status. Possible Values: 01 - 3DS/ Server/ 02 – DS/03 - ACS ")
  public String getWhiteListStatusSource() {
    return whiteListStatusSource;
  }

  public void setWhiteListStatusSource(String whiteListStatusSource) {
    this.whiteListStatusSource = whiteListStatusSource;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Riskv1authenticationresultsConsumerAuthenticationInformation riskv1authenticationresultsConsumerAuthenticationInformation = (Riskv1authenticationresultsConsumerAuthenticationInformation) o;
    return Objects.equals(this.acsRenderingType, riskv1authenticationresultsConsumerAuthenticationInformation.acsRenderingType) &&
        Objects.equals(this.acsTransactionId, riskv1authenticationresultsConsumerAuthenticationInformation.acsTransactionId) &&
        Objects.equals(this.authenticationTransactionId, riskv1authenticationresultsConsumerAuthenticationInformation.authenticationTransactionId) &&
        Objects.equals(this.authenticationType, riskv1authenticationresultsConsumerAuthenticationInformation.authenticationType) &&
        Objects.equals(this.challengeCancelCode, riskv1authenticationresultsConsumerAuthenticationInformation.challengeCancelCode) &&
        Objects.equals(this.effectiveAuthenticationType, riskv1authenticationresultsConsumerAuthenticationInformation.effectiveAuthenticationType) &&
        Objects.equals(this.directoryServerErrorCode, riskv1authenticationresultsConsumerAuthenticationInformation.directoryServerErrorCode) &&
        Objects.equals(this.directoryServerErrorDescription, riskv1authenticationresultsConsumerAuthenticationInformation.directoryServerErrorDescription) &&
        Objects.equals(this.interactionCounter, riskv1authenticationresultsConsumerAuthenticationInformation.interactionCounter) &&
        Objects.equals(this.signedParesStatusReason, riskv1authenticationresultsConsumerAuthenticationInformation.signedParesStatusReason) &&
        Objects.equals(this.sdkTransactionId, riskv1authenticationresultsConsumerAuthenticationInformation.sdkTransactionId) &&
        Objects.equals(this.signedPares, riskv1authenticationresultsConsumerAuthenticationInformation.signedPares) &&
        Objects.equals(this.threeDSServerTransactionId, riskv1authenticationresultsConsumerAuthenticationInformation.threeDSServerTransactionId) &&
        Objects.equals(this.whiteListStatus, riskv1authenticationresultsConsumerAuthenticationInformation.whiteListStatus) &&
        Objects.equals(this.whiteListStatusSource, riskv1authenticationresultsConsumerAuthenticationInformation.whiteListStatusSource);
  }

  @Override
  public int hashCode() {
    return Objects.hash(acsRenderingType, acsTransactionId, authenticationTransactionId, authenticationType, challengeCancelCode, effectiveAuthenticationType, directoryServerErrorCode, directoryServerErrorDescription, interactionCounter, signedParesStatusReason, sdkTransactionId, signedPares, threeDSServerTransactionId, whiteListStatus, whiteListStatusSource);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Riskv1authenticationresultsConsumerAuthenticationInformation {\n");
    
    sb.append("    acsRenderingType: ").append(toIndentedString(acsRenderingType)).append("\n");
    sb.append("    acsTransactionId: ").append(toIndentedString(acsTransactionId)).append("\n");
    sb.append("    authenticationTransactionId: ").append(toIndentedString(authenticationTransactionId)).append("\n");
    sb.append("    authenticationType: ").append(toIndentedString(authenticationType)).append("\n");
    sb.append("    challengeCancelCode: ").append(toIndentedString(challengeCancelCode)).append("\n");
    sb.append("    effectiveAuthenticationType: ").append(toIndentedString(effectiveAuthenticationType)).append("\n");
    sb.append("    directoryServerErrorCode: ").append(toIndentedString(directoryServerErrorCode)).append("\n");
    sb.append("    directoryServerErrorDescription: ").append(toIndentedString(directoryServerErrorDescription)).append("\n");
    sb.append("    interactionCounter: ").append(toIndentedString(interactionCounter)).append("\n");
    sb.append("    signedParesStatusReason: ").append(toIndentedString(signedParesStatusReason)).append("\n");
    sb.append("    sdkTransactionId: ").append(toIndentedString(sdkTransactionId)).append("\n");
    sb.append("    signedPares: ").append(toIndentedString(signedPares)).append("\n");
    sb.append("    threeDSServerTransactionId: ").append(toIndentedString(threeDSServerTransactionId)).append("\n");
    sb.append("    whiteListStatus: ").append(toIndentedString(whiteListStatus)).append("\n");
    sb.append("    whiteListStatusSource: ").append(toIndentedString(whiteListStatusSource)).append("\n");
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


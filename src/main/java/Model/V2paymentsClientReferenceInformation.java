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
 * V2paymentsClientReferenceInformation
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-09-22T07:56:07.186+05:30")
public class V2paymentsClientReferenceInformation {
  @SerializedName("code")
  private String code = null;

  @SerializedName("transactionId")
  private String transactionId = null;

  @SerializedName("comments")
  private String comments = null;

  public V2paymentsClientReferenceInformation code(String code) {
    this.code = code;
    return this;
  }

   /**
   * Client-generated order reference or tracking number. CyberSource recommends that you send a unique value for each transaction so that you can perform meaningful searches for the transaction. 
   * @return code
  **/
  @ApiModelProperty(value = "Client-generated order reference or tracking number. CyberSource recommends that you send a unique value for each transaction so that you can perform meaningful searches for the transaction. ")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public V2paymentsClientReferenceInformation transactionId(String transactionId) {
    this.transactionId = transactionId;
    return this;
  }

   /**
   * Identifier that you assign to the transaction. See \&quot;Merchant-Initiated Reversals and Voids,\&quot; page 176 
   * @return transactionId
  **/
  @ApiModelProperty(value = "Identifier that you assign to the transaction. See \"Merchant-Initiated Reversals and Voids,\" page 176 ")
  public String getTransactionId() {
    return transactionId;
  }

  public void setTransactionId(String transactionId) {
    this.transactionId = transactionId;
  }

  public V2paymentsClientReferenceInformation comments(String comments) {
    this.comments = comments;
    return this;
  }

   /**
   * Comments
   * @return comments
  **/
  @ApiModelProperty(value = "Comments")
  public String getComments() {
    return comments;
  }

  public void setComments(String comments) {
    this.comments = comments;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V2paymentsClientReferenceInformation v2paymentsClientReferenceInformation = (V2paymentsClientReferenceInformation) o;
    return Objects.equals(this.code, v2paymentsClientReferenceInformation.code) &&
        Objects.equals(this.transactionId, v2paymentsClientReferenceInformation.transactionId) &&
        Objects.equals(this.comments, v2paymentsClientReferenceInformation.comments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, transactionId, comments);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V2paymentsClientReferenceInformation {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
    sb.append("    comments: ").append(toIndentedString(comments)).append("\n");
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


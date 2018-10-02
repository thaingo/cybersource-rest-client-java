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
import Model.InlineResponse201LinksSelf;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * InlineResponse201Links
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-09-22T07:56:07.186+05:30")
public class InlineResponse201Links {
  @SerializedName("self")
  private InlineResponse201LinksSelf self = null;

  @SerializedName("reversal")
  private InlineResponse201LinksSelf reversal = null;

  @SerializedName("capture")
  private InlineResponse201LinksSelf capture = null;

  public InlineResponse201Links self(InlineResponse201LinksSelf self) {
    this.self = self;
    return this;
  }

   /**
   * Get self
   * @return self
  **/
  @ApiModelProperty(value = "")
  public InlineResponse201LinksSelf getSelf() {
    return self;
  }

  public void setSelf(InlineResponse201LinksSelf self) {
    this.self = self;
  }

  public InlineResponse201Links reversal(InlineResponse201LinksSelf reversal) {
    this.reversal = reversal;
    return this;
  }

   /**
   * Get reversal
   * @return reversal
  **/
  @ApiModelProperty(value = "")
  public InlineResponse201LinksSelf getReversal() {
    return reversal;
  }

  public void setReversal(InlineResponse201LinksSelf reversal) {
    this.reversal = reversal;
  }

  public InlineResponse201Links capture(InlineResponse201LinksSelf capture) {
    this.capture = capture;
    return this;
  }

   /**
   * Get capture
   * @return capture
  **/
  @ApiModelProperty(value = "")
  public InlineResponse201LinksSelf getCapture() {
    return capture;
  }

  public void setCapture(InlineResponse201LinksSelf capture) {
    this.capture = capture;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse201Links inlineResponse201Links = (InlineResponse201Links) o;
    return Objects.equals(this.self, inlineResponse201Links.self) &&
        Objects.equals(this.reversal, inlineResponse201Links.reversal) &&
        Objects.equals(this.capture, inlineResponse201Links.capture);
  }

  @Override
  public int hashCode() {
    return Objects.hash(self, reversal, capture);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse201Links {\n");
    
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    reversal: ").append(toIndentedString(reversal)).append("\n");
    sb.append("    capture: ").append(toIndentedString(capture)).append("\n");
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


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
import Model.TssV2TransactionsGet200ResponseProcessorInformationProcessor;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * TssV2TransactionsPost201ResponseEmbeddedProcessorInformation
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-11-08T03:47:28.632+05:30")
public class TssV2TransactionsPost201ResponseEmbeddedProcessorInformation {
  @SerializedName("processor")
  private TssV2TransactionsGet200ResponseProcessorInformationProcessor processor = null;

  public TssV2TransactionsPost201ResponseEmbeddedProcessorInformation processor(TssV2TransactionsGet200ResponseProcessorInformationProcessor processor) {
    this.processor = processor;
    return this;
  }

   /**
   * Get processor
   * @return processor
  **/
  @ApiModelProperty(value = "")
  public TssV2TransactionsGet200ResponseProcessorInformationProcessor getProcessor() {
    return processor;
  }

  public void setProcessor(TssV2TransactionsGet200ResponseProcessorInformationProcessor processor) {
    this.processor = processor;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TssV2TransactionsPost201ResponseEmbeddedProcessorInformation tssV2TransactionsPost201ResponseEmbeddedProcessorInformation = (TssV2TransactionsPost201ResponseEmbeddedProcessorInformation) o;
    return Objects.equals(this.processor, tssV2TransactionsPost201ResponseEmbeddedProcessorInformation.processor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(processor);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TssV2TransactionsPost201ResponseEmbeddedProcessorInformation {\n");
    
    sb.append("    processor: ").append(toIndentedString(processor)).append("\n");
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

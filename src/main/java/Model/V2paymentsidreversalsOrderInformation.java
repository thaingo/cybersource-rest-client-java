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
import Model.V2paymentsidreversalsOrderInformationLineItems;
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
 * V2paymentsidreversalsOrderInformation
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-09-22T07:56:07.186+05:30")
public class V2paymentsidreversalsOrderInformation {
  @SerializedName("lineItems")
  private List<V2paymentsidreversalsOrderInformationLineItems> lineItems = null;

  public V2paymentsidreversalsOrderInformation lineItems(List<V2paymentsidreversalsOrderInformationLineItems> lineItems) {
    this.lineItems = lineItems;
    return this;
  }

  public V2paymentsidreversalsOrderInformation addLineItemsItem(V2paymentsidreversalsOrderInformationLineItems lineItemsItem) {
    if (this.lineItems == null) {
      this.lineItems = new ArrayList<V2paymentsidreversalsOrderInformationLineItems>();
    }
    this.lineItems.add(lineItemsItem);
    return this;
  }

   /**
   * Get lineItems
   * @return lineItems
  **/
  @ApiModelProperty(value = "")
  public List<V2paymentsidreversalsOrderInformationLineItems> getLineItems() {
    return lineItems;
  }

  public void setLineItems(List<V2paymentsidreversalsOrderInformationLineItems> lineItems) {
    this.lineItems = lineItems;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V2paymentsidreversalsOrderInformation v2paymentsidreversalsOrderInformation = (V2paymentsidreversalsOrderInformation) o;
    return Objects.equals(this.lineItems, v2paymentsidreversalsOrderInformation.lineItems);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lineItems);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V2paymentsidreversalsOrderInformation {\n");
    
    sb.append("    lineItems: ").append(toIndentedString(lineItems)).append("\n");
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


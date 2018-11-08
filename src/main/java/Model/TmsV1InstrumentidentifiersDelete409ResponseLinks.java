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
import Model.TmsV1InstrumentidentifiersDelete409ResponseLinksPaymentInstruments;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * TmsV1InstrumentidentifiersDelete409ResponseLinks
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-11-08T03:47:28.632+05:30")
public class TmsV1InstrumentidentifiersDelete409ResponseLinks {
  @SerializedName("paymentInstruments")
  private TmsV1InstrumentidentifiersDelete409ResponseLinksPaymentInstruments paymentInstruments = null;

  public TmsV1InstrumentidentifiersDelete409ResponseLinks paymentInstruments(TmsV1InstrumentidentifiersDelete409ResponseLinksPaymentInstruments paymentInstruments) {
    this.paymentInstruments = paymentInstruments;
    return this;
  }

   /**
   * Get paymentInstruments
   * @return paymentInstruments
  **/
  @ApiModelProperty(value = "")
  public TmsV1InstrumentidentifiersDelete409ResponseLinksPaymentInstruments getPaymentInstruments() {
    return paymentInstruments;
  }

  public void setPaymentInstruments(TmsV1InstrumentidentifiersDelete409ResponseLinksPaymentInstruments paymentInstruments) {
    this.paymentInstruments = paymentInstruments;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TmsV1InstrumentidentifiersDelete409ResponseLinks tmsV1InstrumentidentifiersDelete409ResponseLinks = (TmsV1InstrumentidentifiersDelete409ResponseLinks) o;
    return Objects.equals(this.paymentInstruments, tmsV1InstrumentidentifiersDelete409ResponseLinks.paymentInstruments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentInstruments);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TmsV1InstrumentidentifiersDelete409ResponseLinks {\n");
    
    sb.append("    paymentInstruments: ").append(toIndentedString(paymentInstruments)).append("\n");
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

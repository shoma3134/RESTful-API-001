package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Products
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-04-18T21:49:50.671Z[GMT]")
public class Products   {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("title")
  private String title = null;

  @JsonProperty("image")
  private byte[] image = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("price")
  private Long price = null;

  public Products id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Products title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Get title
   * @return title
  **/
  @ApiModelProperty(example = "pen", required = true, value = "")
  @NotNull

@Size(max=100)   public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Products image(byte[] image) {
    this.image = image;
    return this;
  }

  /**
   * Base64-encoded contents of image
   * @return image
  **/
  @ApiModelProperty(value = "Base64-encoded contents of image")

  public byte[] getImage() {
    return image;
  }

  public void setImage(byte[] image) {
    this.image = image;
  }

  public Products description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(example = "black ballpoint pen.", value = "")

@Size(max=500)   public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Products price(Long price) {
    this.price = price;
    return this;
  }

  /**
   * Get price
   * @return price
  **/
  @ApiModelProperty(example = "108", required = true, value = "")
  @NotNull

  public Long getPrice() {
    return price;
  }

  public void setPrice(Long price) {
    this.price = price;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Products products = (Products) o;
    return Objects.equals(this.id, products.id) &&
        Objects.equals(this.title, products.title) &&
        Objects.equals(this.image, products.image) &&
        Objects.equals(this.description, products.description) &&
        Objects.equals(this.price, products.price);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, title, image, description, price);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Products {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
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

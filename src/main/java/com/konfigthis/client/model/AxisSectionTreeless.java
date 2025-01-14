/*
 * Organization structure API
 * Welcome on the documentation for the Organization Structure API 
 *
 * The version of the OpenAPI document: 1.0
 * Contact: developers@lucca.fr
 *
 * NOTE: This class is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */


package com.konfigthis.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.net.URI;
import org.openapitools.jackson.nullable.JsonNullable;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import org.apache.commons.lang3.StringUtils;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.konfigthis.client.JSON;

/**
 * AxisSectionTreeless
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class AxisSectionTreeless {
  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private Object description = null;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private URI url;

  public static final String SERIALIZED_NAME_CODE = "code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private String code;

  public static final String SERIALIZED_NAME_MULTILINGUAL_NAME = "multilingualName";
  @SerializedName(SERIALIZED_NAME_MULTILINGUAL_NAME)
  private String multilingualName;

  public static final String SERIALIZED_NAME_OWNER_ID = "ownerId";
  @SerializedName(SERIALIZED_NAME_OWNER_ID)
  private Object ownerId = null;

  public static final String SERIALIZED_NAME_START_ON = "startOn";
  @SerializedName(SERIALIZED_NAME_START_ON)
  private Object startOn = null;

  public static final String SERIALIZED_NAME_END_ON = "endOn";
  @SerializedName(SERIALIZED_NAME_END_ON)
  private Object endOn = null;

  public static final String SERIALIZED_NAME_ACTIVE = "active";
  @SerializedName(SERIALIZED_NAME_ACTIVE)
  private Boolean active = true;

  public static final String SERIALIZED_NAME_AXIS_ID = "axisId";
  @SerializedName(SERIALIZED_NAME_AXIS_ID)
  private Integer axisId;

  public AxisSectionTreeless() {
  }

  
  public AxisSectionTreeless(
     String name, 
     URI url, 
     Object startOn
  ) {
    this();
    this.name = name;
    this.url = url;
    this.startOn = startOn;
  }

  public AxisSectionTreeless description(Object description) {
    
    
    
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getDescription() {
    return description;
  }


  public void setDescription(Object description) {
    
    
    
    this.description = description;
  }


  public AxisSectionTreeless id(Integer id) {
    if (id != null && id < 1) {
      throw new IllegalArgumentException("Invalid value for id. Must be greater than or equal to 1.");
    }
    
    
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * minimum: 1
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getId() {
    return id;
  }


  public void setId(Integer id) {
    if (id != null && id < 1) {
      throw new IllegalArgumentException("Invalid value for id. Must be greater than or equal to 1.");
    }
    
    
    this.id = id;
  }


   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getName() {
    return name;
  }




   /**
   * Get url
   * @return url
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public URI getUrl() {
    return url;
  }




  public AxisSectionTreeless code(String code) {
    
    
    
    
    this.code = code;
    return this;
  }

   /**
   * Get code
   * @return code
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getCode() {
    return code;
  }


  public void setCode(String code) {
    
    
    
    this.code = code;
  }


  public AxisSectionTreeless multilingualName(String multilingualName) {
    
    
    
    
    this.multilingualName = multilingualName;
    return this;
  }

   /**
   * Get multilingualName
   * @return multilingualName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getMultilingualName() {
    return multilingualName;
  }


  public void setMultilingualName(String multilingualName) {
    
    
    
    this.multilingualName = multilingualName;
  }


  public AxisSectionTreeless ownerId(Object ownerId) {
    
    
    
    
    this.ownerId = ownerId;
    return this;
  }

   /**
   * Get ownerId
   * @return ownerId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getOwnerId() {
    return ownerId;
  }


  public void setOwnerId(Object ownerId) {
    
    
    
    this.ownerId = ownerId;
  }


   /**
   * Get startOn
   * @return startOn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getStartOn() {
    return startOn;
  }




  public AxisSectionTreeless endOn(Object endOn) {
    
    
    
    
    this.endOn = endOn;
    return this;
  }

   /**
   * Get endOn
   * @return endOn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getEndOn() {
    return endOn;
  }


  public void setEndOn(Object endOn) {
    
    
    
    this.endOn = endOn;
  }


  public AxisSectionTreeless active(Boolean active) {
    
    
    
    
    this.active = active;
    return this;
  }

   /**
   * Get active
   * @return active
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "")

  public Boolean getActive() {
    return active;
  }


  public void setActive(Boolean active) {
    
    
    
    this.active = active;
  }


  public AxisSectionTreeless axisId(Integer axisId) {
    
    
    
    
    this.axisId = axisId;
    return this;
  }

   /**
   * Get axisId
   * @return axisId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getAxisId() {
    return axisId;
  }


  public void setAxisId(Integer axisId) {
    
    
    
    this.axisId = axisId;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key name of the property
   * @param value value of the property
   * @return the AxisSectionTreeless instance itself
   */
  public AxisSectionTreeless putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return a map of objects
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key name of the property
   * @return an object
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AxisSectionTreeless axisSectionTreeless = (AxisSectionTreeless) o;
    return Objects.equals(this.description, axisSectionTreeless.description) &&
        Objects.equals(this.id, axisSectionTreeless.id) &&
        Objects.equals(this.name, axisSectionTreeless.name) &&
        Objects.equals(this.url, axisSectionTreeless.url) &&
        Objects.equals(this.code, axisSectionTreeless.code) &&
        Objects.equals(this.multilingualName, axisSectionTreeless.multilingualName) &&
        Objects.equals(this.ownerId, axisSectionTreeless.ownerId) &&
        Objects.equals(this.startOn, axisSectionTreeless.startOn) &&
        Objects.equals(this.endOn, axisSectionTreeless.endOn) &&
        Objects.equals(this.active, axisSectionTreeless.active) &&
        Objects.equals(this.axisId, axisSectionTreeless.axisId)&&
        Objects.equals(this.additionalProperties, axisSectionTreeless.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, id, name, url, code, multilingualName, ownerId, startOn, endOn, active, axisId, additionalProperties);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AxisSectionTreeless {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    multilingualName: ").append(toIndentedString(multilingualName)).append("\n");
    sb.append("    ownerId: ").append(toIndentedString(ownerId)).append("\n");
    sb.append("    startOn: ").append(toIndentedString(startOn)).append("\n");
    sb.append("    endOn: ").append(toIndentedString(endOn)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    axisId: ").append(toIndentedString(axisId)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("description");
    openapiFields.add("id");
    openapiFields.add("name");
    openapiFields.add("url");
    openapiFields.add("code");
    openapiFields.add("multilingualName");
    openapiFields.add("ownerId");
    openapiFields.add("startOn");
    openapiFields.add("endOn");
    openapiFields.add("active");
    openapiFields.add("axisId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("code");
    openapiRequiredFields.add("multilingualName");
    openapiRequiredFields.add("axisId");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AxisSectionTreeless
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!AxisSectionTreeless.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AxisSectionTreeless is not found in the empty JSON string", AxisSectionTreeless.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : AxisSectionTreeless.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("url") != null && !jsonObj.get("url").isJsonNull()) && !jsonObj.get("url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("url").toString()));
      }
      if (!jsonObj.get("code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("code").toString()));
      }
      if (!jsonObj.get("multilingualName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `multilingualName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("multilingualName").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AxisSectionTreeless.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AxisSectionTreeless' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AxisSectionTreeless> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AxisSectionTreeless.class));

       return (TypeAdapter<T>) new TypeAdapter<AxisSectionTreeless>() {
           @Override
           public void write(JsonWriter out, AxisSectionTreeless value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additonal properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   obj.add(entry.getKey(), gson.toJsonTree(entry.getValue()).getAsJsonObject());
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public AxisSectionTreeless read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AxisSectionTreeless instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else if (entry.getValue().isJsonArray()) {
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), List.class));
                 } else { // JSON object
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AxisSectionTreeless given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AxisSectionTreeless
  * @throws IOException if the JSON string is invalid with respect to AxisSectionTreeless
  */
  public static AxisSectionTreeless fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AxisSectionTreeless.class);
  }

 /**
  * Convert an instance of AxisSectionTreeless to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


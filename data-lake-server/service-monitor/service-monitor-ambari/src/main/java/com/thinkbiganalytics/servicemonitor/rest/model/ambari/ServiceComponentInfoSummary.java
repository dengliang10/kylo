package com.thinkbiganalytics.servicemonitor.rest.model.ambari;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Generated;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
                       "items"
                   })
public class ServiceComponentInfoSummary {

  @JsonProperty("items")
  private List<ServiceComponentInfoItem> items = new ArrayList<ServiceComponentInfoItem>();
  @JsonIgnore
  private Map<String, Object> additionalProperties = new HashMap<String, Object>();

  /**
   * @return The items
   */
  @JsonProperty("items")
  public List<ServiceComponentInfoItem> getItems() {
    return items;
  }

  /**
   * @param items The items
   */
  @JsonProperty("items")
  public void setItems(List<ServiceComponentInfoItem> items) {
    this.items = items;
  }

  @JsonAnyGetter
  public Map<String, Object> getAdditionalProperties() {
    return this.additionalProperties;
  }

  @JsonAnySetter
  public void setAdditionalProperty(String name, Object value) {
    this.additionalProperties.put(name, value);
  }


}

package org.jyoti.jsonpath.dev.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Description",
    "Region",
    "Countries"
})
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class CountryResponse {

    @JsonProperty("Description")
    private String description;
    @JsonProperty("Region")
    private String region;
    @JsonProperty("Countries")
    private List<Country> countries = null;

   


}

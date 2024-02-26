package com.lib.borrower.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data@AllArgsConstructor@NoArgsConstructor
public class BorrowerModel {
    @JsonProperty("first_name")
    private String firstName;
    @JsonProperty("last_name")
    private String lastName;
    @JsonProperty("user_name")
    private String userName;
    @JsonProperty("email")
    private String Email;
    @JsonProperty("first_name")
    private String addressLine1;
    @JsonProperty("first_name")
    private String addressLine2;
    @JsonProperty("first_name")
    private String addressLine3;
    @JsonProperty("first_name")
    private String country;
    @JsonProperty("first_name")
    private String phoneNumber;


}

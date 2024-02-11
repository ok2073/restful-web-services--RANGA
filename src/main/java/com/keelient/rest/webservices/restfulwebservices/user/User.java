package com.keelient.rest.webservices.restfulwebservices.user;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Size;
import lombok.*;


import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User {

    private Integer id;
    @Size(min=2, message = "name should have at least two characters")
    @JsonProperty("user_name")
    private String name;
    @Past(message = "birth data should be in the past")
    @JsonProperty("birth_date")
    private LocalDate birthDate;

}

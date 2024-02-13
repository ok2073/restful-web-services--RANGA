package com.keelient.rest.webservices.restfulwebservices.user;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Post {
    @Id
    @GeneratedValue
    private Integer id;


    /*
    * FetchType.LAZY: The User object is not loaded initially when you fetch a Post.
    * Instead, the retrieval occurs only when you specifically access the user field of the Post
    * object.
    */
    @ManyToOne(fetch =FetchType.LAZY)
    @JsonIgnore
    private User user;

    @Size(min = 10)
    private String description;
}

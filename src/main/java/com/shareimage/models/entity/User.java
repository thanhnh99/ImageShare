package com.shareimage.models.entity;


import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@Document(collection = "users")
public class User {

    @Id
    private String id;


    @Field
    private String name;

    @Field
    private String email;
}

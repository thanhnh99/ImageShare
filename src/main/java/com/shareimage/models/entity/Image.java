package com.shareimage.models.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;

@Data
@Document(collection = "images")
public class Image {
    @Id
    private String id;

    @Field
    private  String email;

    @Field
    private String path;

    @Field
    private List<String> tags;

    @Field
    private  List<String> comments_id;

    @Field
    private String title;


}

package com.shareimage.models.entity;


import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@Document(collection = "comment")
public class Comment {
    @Id
    private String id;

    @Field
    private Long user_id;

    @Field
    private Long image_id;

    @Field
    private String content;
}

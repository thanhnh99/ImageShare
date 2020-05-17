package com.shareimage.models.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@Document(collection = "notification")
public class Notification {
    @Id
    private String id;

    @Field
    private String user_id;

    @Field
    private String image_id;

    @Field
    private String content;

}

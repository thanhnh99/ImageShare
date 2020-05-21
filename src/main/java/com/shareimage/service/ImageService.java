package com.shareimage.service;

import com.shareimage.models.entity.Image;
import com.shareimage.models.request.ImageRequest;
import com.shareimage.models.response.ResponseBase;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class ImageService{
    public ResponseBase addImage (@RequestBody ImageRequest request)
    {
        return new ResponseBase();
    }
}

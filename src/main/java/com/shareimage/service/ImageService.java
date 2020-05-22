package com.shareimage.service;

import com.shareimage.models.request.PostRequest;
import com.shareimage.models.response.ResponseBase;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class ImageService{
    public ResponseBase addImage (@RequestBody PostRequest request)
    {
        return new ResponseBase();
    }
}

package com.shareimage.models.request;


import lombok.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ImageRequest {
    private MultipartFile image ;
    private List<String> tags;
    private String title;
}

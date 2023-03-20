package com.example.test.Controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@RestController
public class FileController {

    @PostMapping("/upload")
    public String up(String nickname, MultipartFile photo, HttpServletRequest request)throws IOException
    {
        System.out.println(nickname);

        System.out.println(photo.getOriginalFilename());
        System.out.println(photo.getContentType());

        String path=request.getServletContext().getRealPath("/upload/");
        System.out.println(path);
        saveFile(photo,path);
    }

    private void saveFile(MultipartFile photo, String path) {

    }
}

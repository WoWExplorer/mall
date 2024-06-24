package com.mall.controller;

import com.mall.entity.vo.ResultVo;
import com.mall.utils.FileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/file")
public class FileController {
    @Autowired
    private FileService fileService;

    /**
     * 公共上传接口
     */
    @PostMapping("/common")
    public ResultVo<?> common(@RequestParam("file") MultipartFile file, @RequestParam("type") String type) {
        return 	fileService.fileUpload(file, "/common", type);
    }


    /**
     * 公共上传接口
     */
    @PostMapping("/banner")
    public ResultVo<?> banner(@RequestParam("file") MultipartFile file) {
        return 	fileService.fileUpload(file, "/banner", "img");
    }


}

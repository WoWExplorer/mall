package com.mall.utils;

import cn.hutool.core.io.FileUtil;
import cn.hutool.core.io.file.FileNameUtil;
import cn.hutool.core.util.IdUtil;
import cn.hutool.core.util.ObjectUtil;
import com.mall.entity.vo.ResultVo;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Component
public class FileService {
    public static final long DEFAULT_MAX_SIZE = 10 * 1024 * 1024;
    private static final String[] ALLOWED_EXTENSIONS = new String[] {"jpg", "jpeg", "png", "gif"};
    public ResultVo<?> fileUpload(MultipartFile file, String path, String type) {
        if (file.isEmpty()) {
            return ResultVo.fail(201, "文件不能为空");
        }

        System.out.println(file.getSize() + "文件大小" + DEFAULT_MAX_SIZE);
        if (file.getSize() > DEFAULT_MAX_SIZE) {
            return ResultVo.fail(202, "文件不能超过10MB");
        }

        String extName = FileNameUtil.extName(file.getOriginalFilename());

        if (!Objects.equals("img", type)) {
            if (ObjectUtil.contains(ALLOWED_EXTENSIONS, extName)) {
                return ResultVo.fail(201,"文件类型不符");
            }
        }


        Path pathDir = Paths.get("");

        String resultFilePath = "";

        if (!path.isEmpty()) {
            pathDir = Paths.get("/uploads/"+ path + "/" + extName);
            resultFilePath = "/uploads/"+ path + "/" + extName;
        } else {
            pathDir = Paths.get("/uploads/"+ extName);
            resultFilePath = "/uploads/"+ extName;
        }


        if (!Files.exists(pathDir)) {
            FileUtil.mkdir(pathDir);
        }

        String simpleUUID = IdUtil.simpleUUID();

        Path filePath = Paths.get(pathDir+ "/" + simpleUUID + "." + extName);
        resultFilePath = resultFilePath + "/" + simpleUUID + "." + extName;

        try {
            byte[] bytes = file.getBytes();
            Files.write(filePath, bytes);

            return ResultVo.success(200, resultFilePath,"上传成功！");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println(e + "==============");
            return ResultVo.fail("上传失败");
        }

    }
}

/**
 * 
 */
package com.archermind.springBoot.web;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
public class AudioUpload extends BaseController {
	// 文件上传的目录,支持配置文件配置路径
	@Value("${spring.http.file.archermind.uploadFolder}")
	private String UPLOADED_FOLDER;

	@PostMapping("/audio-upload")
	public String singleFileUpload(HttpServletRequest request, @RequestParam("audioFile") MultipartFile file,
			@RequestParam("userId") String userId) {
		if (file.isEmpty()) {
			return "failed!file is null.";
		}

		try {
			// 检查session
			// super.checkSession(request);

			// 如果目录不存在就创建目录
			String directory = UPLOADED_FOLDER + "\\audio";
			File mkdir = new File(directory);
			if (!mkdir.exists()) {
				mkdir.mkdirs();
			}
			// 写入文件
			byte[] bytes = file.getBytes();
			Path path = Paths.get(directory + "\\" + file.getOriginalFilename());
			Files.write(path, bytes);

			return "You successfully uploaded";

		} catch (IOException e) {

			return e.getMessage();

		} catch (Exception e) {

			return e.getMessage();
		}

	}

}

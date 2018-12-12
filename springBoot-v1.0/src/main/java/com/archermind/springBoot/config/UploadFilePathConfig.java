/**
 * 
 */
package com.archermind.springBoot.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @author Administrator
 *
 */
@Configuration
public class UploadFilePathConfig extends WebMvcConfigurerAdapter {
	@Value("${spring.http.file.archermind.staticAccessPath}")
	private String staticAccessPath;
	@Value("${spring.http.file.archermind.uploadFolder}")
	private String uploadFolder;

	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler(staticAccessPath).addResourceLocations("file:" + uploadFolder);
	}

}

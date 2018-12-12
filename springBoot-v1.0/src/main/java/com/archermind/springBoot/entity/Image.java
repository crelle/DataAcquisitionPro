/**
 * 
 */
package com.archermind.springBoot.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author Administrator
 *
 */
@Entity
public class Image {

	@Id
	@GeneratedValue
	private String id;
	
	@Column(nullable = false)
	private String fileName;
	
	@Column(nullable = false)
	private String filePath;
	
	private String optTime;
	
	private String userId;
	
	private String taskId;

	public Image(String id, String fileName, String filePath, String optTime, String userId, String taskId) {
		super();
		this.id = id;
		this.fileName = fileName;
		this.filePath = filePath;
		this.optTime = optTime;
		this.userId = userId;
		this.taskId = taskId;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getFilePath() {
		return filePath;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

	public String getOptTime() {
		return optTime;
	}

	public void setOptTime(String optTime) {
		this.optTime = optTime;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getTaskId() {
		return taskId;
	}

	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}
	
	
}

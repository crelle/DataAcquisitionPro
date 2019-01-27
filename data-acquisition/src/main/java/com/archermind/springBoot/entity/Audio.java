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
public class Audio {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	private String id;
	
	@Column(nullable = false)
	private String content;
	
	@Column(nullable = false)
	private String fileName;
	
	@Column(nullable = false)
	private String filePath;
	
	private String optTime;
	
	private String userId;
	
	private String taskId;
	
	private String lengthAudioTime;

	public Audio(String id, String content, String fileName, String filePath, String optTime, String userId,
			String taskId, String lengthAudioTime) {
		super();
		this.id = id;
		this.content = content;
		this.fileName = fileName;
		this.filePath = filePath;
		this.optTime = optTime;
		this.userId = userId;
		this.taskId = taskId;
		this.lengthAudioTime = lengthAudioTime;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
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

	public String getLengthAudioTime() {
		return lengthAudioTime;
	}

	public void setLengthAudioTime(String lengthAudioTime) {
		this.lengthAudioTime = lengthAudioTime;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
	
}

/**
 * 
 */
package com.archermind.springBoot.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author Administrator
 *
 */
@Entity
public class Task implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	private String id;

	@Column(nullable = false)
	private String totalCount;
	
	private String recordCount;
	
	@Column(nullable = false)
	private String content;
	
	@Column(nullable = false)
	private String type;
	
	private String status;
	
	@Column(nullable = false)
	private String description;
	
	private String require;

	public Task(String id, String totalCount, String recordCount, String content, String type, String status,
			String description, String require) {
		super();
		this.id = id;
		this.totalCount = totalCount;
		this.recordCount = recordCount;
		this.content = content;
		this.type = type;
		this.status = status;
		this.description = description;
		this.require = require;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(String totalCount) {
		this.totalCount = totalCount;
	}

	public String getRecordCount() {
		return recordCount;
	}

	public void setRecordCount(String recordCount) {
		this.recordCount = "0";
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = "0";
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getRequire() {
		return require;
	}

	public void setRequire(String require) {
		this.require = require;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
	
}

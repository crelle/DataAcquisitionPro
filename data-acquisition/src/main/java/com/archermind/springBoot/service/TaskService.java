/**
 * 
 */
package com.archermind.springBoot.service;

import java.util.List;

import com.archermind.springBoot.entity.Task;

/**
 * @author Administrator
 *
 */
public interface TaskService {
	Task findById(String taskId);

	List<Task> findByStatus(String status);
}

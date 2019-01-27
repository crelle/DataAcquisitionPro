
package com.archermind.springBoot.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.archermind.springBoot.entity.Task;

/**
 * @author Administrator
 *
 */
public interface TaskRepository extends JpaRepository<Task, Long> {
	
	Task findById(String taskId);
	
	List<Task> findByStatus(String status);
	
}

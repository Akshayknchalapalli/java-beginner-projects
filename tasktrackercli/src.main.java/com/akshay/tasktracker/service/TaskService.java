package com.akshay.tasktracker.service;

import java.util.List;

import com.akshay.tasktracker.model.Task;
import com.akshay.tasktracker.model.TaskStatus;

public interface TaskService {
	
	void addTask(String description);
	void updateTask(int id , String descripion);
	void deleteTask(int id);
	void markInProgressTask(int id);
	void markDoneTask(int id);
	
	List<Task> listAllTasks();
	
	List<Task> listTaskByStatus(TaskStatus status);
	
	void printAllTasks(List<Task> tasks);
}

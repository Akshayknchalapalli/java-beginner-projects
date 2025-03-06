package com.akshay.tasktracker.repository;

import java.util.List;

import com.akshay.tasktracker.model.Task;

public interface TaskRepository {
	List<Task> loadTasks();
	void saveTasks(List<Task> tasks);
}

package com.task.entities;

import java.time.LocalDate;

public class TaskManager {

	private int taskId;
	private int counter=1;
	private String taskName;
	private String description;
	private LocalDate taskdate;
	private Status status;
	private boolean active;
	
	
	public TaskManager(String taskName, String description, LocalDate taskdate, Status status,
			boolean active) {
		super();
		this.taskId=counter++;
		this.taskName = taskName;
		this.description = description;
		this.taskdate = taskdate;
		this.status = status;
		this.active = active;
	}

	public TaskManager(int taskid2) {
		// TODO Auto-generated constructor stub
	}


	public int getCounter() {
		return counter;
	}


	public String getTaskName() {
		return taskName;
	}


	public String getDescription() {
		return description;
	}


	public LocalDate getTaskdate() {
		return taskdate;
	}


	public Status getStatus() {
		return status;
	}


	public boolean isActive() {
		return active;
	}


	public void setCounter(int counter) {
		this.counter = counter;
	}


	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public void setTaskdate(LocalDate taskdate) {
		this.taskdate = taskdate;
	}


	public void setStatus(Status status) {
		this.status = status;
	}


	public void setActive(boolean active) {
		this.active = active;
	}
	
	
	
	
	
	
	
}

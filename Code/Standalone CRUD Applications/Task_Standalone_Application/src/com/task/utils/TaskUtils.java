package com.task.utils;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.task.entities.Status;
import com.task.entities.TaskManager;
import com.task.exception.TaskException;

public class TaskUtils {
	
	//Populated List for Data Testing
	public static List<TaskManager> populatedTaskList()
	{
		TaskManager t1 = new TaskManager("t1", "abc", LocalDate.parse("2023-05-05"), Status.INPROGRESS, false);
		TaskManager t2 = new TaskManager("t2", "sd", LocalDate.parse("2023-05-08"), Status.COMPLETED, true);
		
		List<TaskManager> task = new ArrayList<>();
		task.add(t1);
		task.add(t2);
		
		return task;
	}
	
	//Create/Add Task
	public static TaskManager addTask(String taskName, String description, String taskdate, String status,
			boolean active)
	{
		LocalDate tDate  = LocalDate.parse(taskdate);
		Status status1 = Status.valueOf(status);
		
		return new TaskManager(taskName, description, tDate, status1, active);
		
	}
	
	//Remove Task
	public static void remove(int taskid,List<TaskManager> list) throws TaskException
	{
		TaskManager task = new TaskManager(taskid);
		int index=list.indexOf(task);
		if(index==-1)
		{
			throw new TaskException("Remove failed");
		}
		list.remove(index);
	}
	
	//Update Task
	public static void update(String status, List<TaskManager> list)
	{
		Status status1 = Status.valueOf(status);
		for(TaskManager t : list)
		{
			t.setStatus(status1);
		}
	}
	
	//Display all pending tasks
	public static void pendingTasks(List<TaskManager> list)
	{
		for(TaskManager t : list)
		{
			if(t.getStatus().equals(Status.PENDING))
			{
				System.out.println(t);
			}
		}
	}
	
	//Display all pending tasks for today
	public static void pendingTasksToday(List<TaskManager> list)
	{
		for(TaskManager t : list)
		{
			if(t.getStatus().equals(Status.PENDING) && t.getTaskdate().equals(LocalDate.now()))
			{
				System.out.println(t);
			}
		}
	}
	
	//Display all tasks sorted by taskDate   
	public static void sortTaskByDate(List<TaskManager> list)
	{
		list.sort((t1,t2)->t1.getTaskdate().compareTo(t2.getTaskdate()));
		list.forEach((t)->System.out.println(t));
	}
}

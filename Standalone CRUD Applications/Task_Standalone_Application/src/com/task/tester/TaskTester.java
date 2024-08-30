package com.task.tester;

import java.util.ArrayList;
import java.util.Scanner;

import com.task.entities.TaskManager;
import com.task.utils.TaskUtils;

import static com.task.utils.TaskUtils.*;

public class TaskTester {

	public static void main(String[] args)
	{
		try(Scanner sc = new Scanner(System.in))
		{
			boolean exit = false;
			
			ArrayList<TaskManager> task = new ArrayList<>();
			
			while(!exit)
			{
				System.out.println("Choose a Option");
				System.out.println("1.Add New Task\n "
						+ "2.Delete a Task\n"
						+ "3.Update Task Status\n"
						+ "4.Display all Pending Tasks\n"
						+ "5.Display all pending tasks for today\n"
						+ "6.Display all Tasks sorted by taskDate");
				switch(sc.nextInt())
				{
					case 1://Add
						
						TaskManager t = TaskUtils.addTask(sc.next(), sc.next(), sc.next(), sc.next(), exit);
						task.add(t);
						System.out.println("Added");
						break;
					case 2://Delete
						remove(sc.nextInt(), task);
						System.out.println();
						break;
					case 3://Update
						System.out.println("Enter the Status");
						update(sc.next(), task);
						break;
					case 4://Display Pending Tasks
						System.out.println("Display all Pending Tasks");
						pendingTasks(task);
						break;
					case 5://Display Pending Tasks by Today
						System.out.println("Display all Pending Tasks of Today");
						pendingTasksToday(task);
					case 6://Sort Task By Date
						System.out.println("Display all Tasks Sorted by Task Date");
						sortTaskByDate(task);
				}
			}
			
		}
		catch (Exception e) 
		{
			e.getStackTrace();
		}
	}
}

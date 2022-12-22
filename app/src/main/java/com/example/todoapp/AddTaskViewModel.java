package com.example.todoapp;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import com.example.todoapp.Database.AppDatabase;
import com.example.todoapp.Database.TaskEntry;
import com.example.todoapp.Database.TasksRepository;

public class AddTaskViewModel extends ViewModel {

    private LiveData<TaskEntry> task;
    private final TasksRepository tasksRepository;

    public AddTaskViewModel(AppDatabase database, int taskId) {
        // task = database.taskDao().loadTaskById(taskId);
        tasksRepository = new TasksRepository(database);
        task = tasksRepository.getloadTaskById(taskId);
    }

    public LiveData<TaskEntry> getTask() {
        return task;
    }

    public void updateTask(TaskEntry task) {
        tasksRepository.updateTaskById(task);
    }
}


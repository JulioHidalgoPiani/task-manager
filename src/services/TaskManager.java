package services;

import models.Task;

import java.util.ArrayList;
import java.util.List;

public class TaskManager {

    private List<Task> taskList;

    public TaskManager() {
        taskList = new ArrayList<>();
    }

    public void addTask(Task task) {
        taskList.add(task);
    }

    public void deleteTask(String id) {
        taskList.removeIf(t -> t.getId().equals(id));
    }

    public void modifyTask(Task task) {
        for (Task t : taskList) {
            if(t.getId().equals(task.getId())) {
                t.setDescription(task.getDescription());
                t.setComplete(task.isComplete());
            }
        }
    }

    public List<Task> retrieveTasks () {
        return taskList;
    }
}

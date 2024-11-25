import models.Task;
import persistence.FileTasks;
import services.TaskManager;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TaskManager taskManager = new TaskManager();

        try {
            taskManager = new TaskManager();
            taskManager.retrieveTasks().addAll(FileTasks.loadTasks());
        } catch (IOException e) {
            System.out.println("Error loading tasks.");
        }

        boolean exit = false;
        while (!exit) {
            System.out.println("\n-- Task Manager System --");
            System.out.println("1. List Tasks");
            System.out.println("2. Create Task");
            System.out.println("3. Update Task");
            System.out.println("4. Delete Task");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    for (Task task : taskManager.retrieveTasks()) {
                        System.out.println(task);
                    }
                    break;
                case 2:
                    System.out.print("Enter task ID: ");
                    String id = scanner.nextLine();
                    System.out.print("Enter description: ");
                    String description = scanner.nextLine();
                    Task newTask = new Task(id, description, false);
                    taskManager.addTask(newTask);
                    break;
                case 3:
                    System.out.print("Enter task ID for update: ");
                    id = scanner.nextLine();
                    System.out.print("Enter new description: ");
                    description = scanner.nextLine();
                    System.out.print("Is complete? (true/false): ");
                    boolean complete = scanner.nextBoolean();
                    taskManager.modifyTask(new Task(id, description, complete));
                    break;
                case 4:
                    System.out.print("Enter task ID to delete: ");
                    id = scanner.nextLine();
                    taskManager.deleteTask(id);
                    break;
                case 5:
                    exit = true;
                    break;
                default:
                    System.out.println("No valid option.");
            }
            try {
                FileTasks.saveTasks(taskManager.retrieveTasks());
            } catch (IOException e) {
                System.out.println("Error saving tasks.");
            }
        }
    }
}
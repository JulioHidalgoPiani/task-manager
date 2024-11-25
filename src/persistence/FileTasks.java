package persistence;

import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;
import models.Task;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileTasks {
    private static final String FILE_PATH = "tasks.json";
    private static ObjectMapper objectMapper = new ObjectMapper();

    public static void saveTasks(List<Task> tasks) throws IOException {
        objectMapper.writeValue(new File(FILE_PATH), tasks);
    }

    public static List<Task> loadTasks() throws IOException {
        File file = new File(FILE_PATH);
        if (file.exists()) {
            return objectMapper.readValue(file, objectMapper.getTypeFactory().constructCollectionType(List.class, Task.class));
        }
        return new ArrayList<>();
    }
}

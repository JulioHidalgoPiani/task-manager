package models;

public class Task {
    private String id;
    private String description;
    private boolean isComplete;

    public Task() {
    }

    public Task(String id, String description, boolean isComplete) {
        this.id = id;
        this.description = description;
        this.isComplete = isComplete;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isComplete() {
        return isComplete;
    }

    public void setComplete(boolean complete) {
        isComplete = complete;
    }

    @Override
    public String toString() {
        return "model.Task{" +
                "id='" + id + '\'' +
                ", description='" + description + '\'' +
                ", isComplete=" + isComplete +
                '}';
    }
}

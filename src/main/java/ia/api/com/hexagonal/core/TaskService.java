package ia.api.com.hexagonal.core.service;

import ia.api.com.hexagonal.core.domain.Task;
import ia.api.com.hexagonal.core.ports.TaskRepositoryPort;
import ia.api.com.hexagonal.core.ports.TaskServicePort;
import java.util.List;

public class TaskService implements TaskServicePort {

    private final TaskRepositoryPort taskRepositoryPort;

    public TaskService(TaskRepositoryPort taskRepositoryPort) {
        this.taskRepositoryPort = taskRepositoryPort;
    }

    @Override
    public Task createTask(Task task) {

        return taskRepositoryPort.createTask(task);
    }

    @Override
    public List<Task> findAllTask() {
        return taskRepositoryPort.findAllTask();
    }
}

package ia.api.com.hexagonal.domain.service;

import ia.api.com.hexagonal.domain.Task;
import ia.api.com.hexagonal.domain.ports.TaskRepositoryPort;
import ia.api.com.hexagonal.domain.ports.TaskServicePort;

import java.util.List;
public class TaskService implements TaskServicePort {

    private final TaskRepositoryPort taskRepositoryPort;

    public TaskService(TaskRepositoryPort taskRepositoryPort) {
        this.taskRepositoryPort = taskRepositoryPort;
    }

    @Override
    public Task saveTask(Task task) {
        return taskRepositoryPort.saveTask(task);
    }

    @Override
    public List<Task> findAllTask() {
        return taskRepositoryPort.findAllTask();
    }
}

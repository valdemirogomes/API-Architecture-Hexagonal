package ia.api.com.hexagonal.domain.service;

import ia.api.com.hexagonal.domain.Task;
import ia.api.com.hexagonal.domain.ports.TaskServicePort;

import java.util.List;

public class TaskService implements TaskServicePort {
    @Override
    public Task saveTask(Task task) {
        return null;
    }

    @Override
    public List<Task> findAllTask() {
        return List.of();
    }
}

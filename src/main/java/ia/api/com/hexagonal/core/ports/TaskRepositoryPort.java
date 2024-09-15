package ia.api.com.hexagonal.core.ports;

import ia.api.com.hexagonal.core.domain.Task;

import java.util.List;

public interface TaskRepositoryPort {
    Task createTask(Task task);
    List<Task> findAllTask();
}

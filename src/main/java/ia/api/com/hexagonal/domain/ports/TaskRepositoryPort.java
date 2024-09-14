package ia.api.com.hexagonal.domain.ports;

import ia.api.com.hexagonal.domain.Task;

import java.util.List;

public interface TaskRepositoryPort {
    Task saveTask(Task task);
    List<Task> findAllTask();
}

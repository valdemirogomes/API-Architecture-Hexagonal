package ia.api.com.hexagonal.domain.ports;

import ia.api.com.hexagonal.domain.Task;

import java.util.List;

public interface TaskServicePort {
    Task saveTask(Task task);
    List<Task> findAllTask();

}

package ia.api.com.hexagonal.adapter.repository;

import ia.api.com.hexagonal.adapter.entities.TaskEntity;
import ia.api.com.hexagonal.core.domain.Task;
import ia.api.com.hexagonal.core.ports.TaskRepositoryPort;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;
import java.util.List;
import java.util.stream.Collectors;

@Component
@AllArgsConstructor
public class TaskRepositoryAdapter implements TaskRepositoryPort {

    private final TaskRepository taskRepository;
    private final ModelMapper modelMapper;

    @Override
    public Task createTask(Task task) {
        TaskEntity entity = modelMapper.map(task, TaskEntity.class);
        TaskEntity taskEntity = taskRepository.save(entity);
        return modelMapper.map(taskEntity,Task.class);
    }

    @Override
    public List<Task> findAllTask() {
        List<TaskEntity> taskEntities=  taskRepository.findAll();
        return taskEntities
                .stream()
                .map(taskEntity -> modelMapper.map(taskEntity,Task.class))
                .collect(Collectors.toList());

    }
}

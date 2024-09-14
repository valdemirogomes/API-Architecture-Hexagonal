package ia.api.com.hexagonal.adapter.repository;

import ia.api.com.hexagonal.adapter.entities.TaskEntity;
import ia.api.com.hexagonal.domain.Task;
import ia.api.com.hexagonal.domain.ports.TaskRepositoryPort;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@AllArgsConstructor
public class TaskRepositoryPortImpl implements TaskRepositoryPort {

    private final TaskRepository taskRepository;
    private final ModelMapper modelMapper;

    @Override
    public Task saveTask(Task task) {
        TaskEntity entity = modelMapper.map(task, TaskEntity.class);
        TaskEntity taskEntity = taskRepository.save(entity);
        return modelMapper.map(taskEntity,Task.class);
    }

    @Override
    public List<Task> findAllTask() {
        return List.of();
    }
}

package ia.api.com.hexagonal.repository;

import ia.api.com.hexagonal.adapter.entities.TaskEntity;
import ia.api.com.hexagonal.adapter.repository.TaskRepository;
import ia.api.com.hexagonal.adapter.repository.TaskRepositoryAdapter;
import ia.api.com.hexagonal.core.domain.Task;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.modelmapper.ModelMapper;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;


@ExtendWith(MockitoExtension.class)
public class TaskRepositoryAdapterTest {
    @InjectMocks
    TaskRepositoryAdapter taskRepositoryAdapter;


    @Mock
    TaskRepository taskRepository;

    @Mock
    ModelMapper modelMapper;


    Task task;
    TaskEntity taskEntity;

    @BeforeEach
    public void setUP(){
      task  = new Task(1,"3443097","code refector",true);
      taskEntity = modelMapper.map(task,TaskEntity.class);

    }

    @Test
    void deveCriarUmaEntity(){
        when(taskRepository.save(taskEntity)).thenReturn(taskEntity);
        Task result = taskRepositoryAdapter.createTask(task);
        assertEquals(result,taskEntity);

    }
}

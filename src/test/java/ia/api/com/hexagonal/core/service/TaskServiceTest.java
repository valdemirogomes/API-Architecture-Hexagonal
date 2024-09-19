package ia.api.com.hexagonal.core.service;

import ia.api.com.hexagonal.core.TaskService;
import ia.api.com.hexagonal.core.domain.Task;
import ia.api.com.hexagonal.core.ports.TaskRepositoryPort;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class TaskServiceTest {
    @InjectMocks
    TaskService taskService;

    @Mock
    TaskRepositoryPort taskRepositoryPort;

    Task task;

    @BeforeEach
    public void setUP(){
        task = new Task(1,"876556","Implementar metodo de salvar", true);

    }
    @Test
    void youMustCreateTask(){
        when(taskRepositoryPort.createTask(task)).thenReturn(task);
        Task result= taskService.createTask(task);
        assertNotNull(result);
        assertEquals(task,result);
    }
}

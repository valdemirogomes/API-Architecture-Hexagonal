package ia.api.com.hexagonal.adapter.controller;

import ia.api.com.hexagonal.domain.Task;
import ia.api.com.hexagonal.domain.ports.TaskServicePort;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("task")
@AllArgsConstructor
public class TaskController {
    private final TaskServicePort taskServicePort;

    @PostMapping
    public Task createTask(@RequestBody Task task){
        return taskServicePort.saveTask(task);
    }
}

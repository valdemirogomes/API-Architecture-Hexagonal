package ia.api.com.hexagonal.adapter.controller;

import ia.api.com.hexagonal.core.domain.Task;
import ia.api.com.hexagonal.core.ports.TaskServicePort;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("task")
@AllArgsConstructor
public class TaskController {
    private final TaskServicePort taskServicePort;

    @PostMapping
    public ResponseEntity<Task> createTask(@RequestBody Task task){
        return ResponseEntity.ok(taskServicePort.createTask(task));
    }
    @GetMapping
    public ResponseEntity<List<Task>> listTak(){
        return ResponseEntity.ok(taskServicePort.findAllTask());

    }
}

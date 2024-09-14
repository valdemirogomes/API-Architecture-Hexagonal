package ia.api.com.hexagonal.adapter.repository;


import ia.api.com.hexagonal.adapter.entities.TaskEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<TaskEntity, Long> {
}

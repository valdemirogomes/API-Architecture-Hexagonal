package ia.api.com.hexagonal.adapter.infra;

import ia.api.com.hexagonal.core.ports.TaskRepositoryPort;
import ia.api.com.hexagonal.core.ports.TaskServicePort;
import ia.api.com.hexagonal.core.TaskService;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeansConfig {
    @Bean
    public ModelMapper modelMapper(){
        return new ModelMapper();
    }
    @Bean
    public TaskServicePort taskServicePort(TaskRepositoryPort taskRepositoryPort){
        return new TaskService(taskRepositoryPort);
    }
}

package ia.api.com.hexagonal.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.fasterxml.jackson.databind.SerializationFeature;
import ia.api.com.hexagonal.adapter.controller.TaskController;
import ia.api.com.hexagonal.core.domain.Task;
import ia.api.com.hexagonal.core.ports.TaskServicePort;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;


import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;

@ExtendWith(MockitoExtension.class)
public class TaskControllerTest {
    @InjectMocks
    TaskController taskController;

    @Mock
    TaskServicePort taskServicePort;

    MockMvc mockMvc;

    Task task;

    @BeforeEach
    public void setUP(){
    mockMvc = MockMvcBuilders.standaloneSetup(taskController).build();
    task  = new Task(1,"3443097","code refector",true);


    }
    @Test
    public void criarTaskViaPost() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(SerializationFeature.WRAP_ROOT_VALUE, false);
        ObjectWriter ow = mapper.writer().withDefaultPrettyPrinter();
        String requestJson=ow.writeValueAsString(task );

          mockMvc.perform(post("/task")
                .contentType(MediaType.APPLICATION_JSON)
                .content(requestJson)
              ).andExpect(MockMvcResultMatchers.status().isOk());
    }
    @Test
    public void deveBuscarTodasAsTaskViaGet() throws Exception {
        //ObjectMapper mapper = new ObjectMapper();
        //mapper.configure(SerializationFeature.WRAP_ROOT_VALUE, false);
        //ObjectWriter ow = mapper.writer().withDefaultPrettyPrinter();
       // String requestJson=ow.writeValueAsString(task );

        mockMvc.perform(get("/task")
                //.contentType(MediaType.APPLICATION_JSON)
                //.content(requestJson)
        ).andExpect(MockMvcResultMatchers.status().isOk());
    }
}

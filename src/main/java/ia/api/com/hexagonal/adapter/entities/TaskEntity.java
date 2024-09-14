package ia.api.com.hexagonal.adapter.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "tb-task")
public class TaskEntity {
    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private String description;
    private  Boolean done;
}

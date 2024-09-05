package ia.api.com.hexagonal.domain;

public class Task {
    private Integer id;
    private String name;
    private String description;
    private  Boolean done;
    
    public Task(String description, Boolean done, String name, Integer id) {
        this.description = description;
        this.done = done;
        this.name = name;
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Boolean getDone() {
        return done;
    }

    public void setDone(Boolean done) {
        this.done = done;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

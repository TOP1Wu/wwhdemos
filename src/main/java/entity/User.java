package entity;

import lombok.Data;

@Data
public class User {
    private Long Id;
    private String name;
    private Integer age;
    private String email;
}

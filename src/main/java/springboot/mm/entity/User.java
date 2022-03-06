package springboot.mm.entity;

import lombok.Data;

import javax.persistence.SecondaryTable;

@Data
public class User {
    private String userId;
    private String password;
}

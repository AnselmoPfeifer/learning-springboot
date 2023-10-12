package com.anselmopfeifer.task.users;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class UserModel {
    private String username;
    private String name;
    private String password;
}

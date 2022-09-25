package com.E.A.ws.user;


import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Data
@Entity
@Table(name="users")
public class User {

    @Id
    @GeneratedValue
    private long id;


    @NotNull(message = "{hoaxify.constraint.username.NotNull.message}")
    @Size(min = 3, max = 255)
    @UniqueUsername
    private String username;

    @NotNull
    @Size(min = 3, max = 255)
    private String nickName;

    @NotNull
    @Pattern(regexp = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d).*$", message="{hoaxify.constrain.password.Pattern.message}")
    @Size(min = 8, max = 255)
    private String password;

}

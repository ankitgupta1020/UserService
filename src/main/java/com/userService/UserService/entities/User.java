package com.userService.UserService.entities;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "user_micro")
public class User {

    @Id
    @Column(name= "ID")
    private String userId;
    @Column(name= "NAME")
    private String name;
    @Column(name= "EMAIL_ID")
    private String email;
    @Column(name= "ABOUT")
    private String about;

    @Transient
    private List<Rating> rating = new ArrayList<>();
}

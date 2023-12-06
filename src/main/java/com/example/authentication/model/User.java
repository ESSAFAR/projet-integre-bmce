package com.example.authentication.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Collection;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User {
    @Id
    private String username;
    private String password;
    @ManyToOne(fetch = FetchType.EAGER,targetEntity = Role.class,cascade = CascadeType.PERSIST)
    private Role role;
}

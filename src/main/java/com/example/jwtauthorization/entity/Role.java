package com.example.jwtauthorization.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
@Setter
@Getter
@Entity
@NoArgsConstructor
@Table(name = "roles")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Enumerated(EnumType.STRING)
    @Column (name = "role_name", nullable = false)
    private String roleName;

    public enum RoleName{
        ROLE_USER, ROLE_MODERATOR, ROLE_ADMIN
    }

}

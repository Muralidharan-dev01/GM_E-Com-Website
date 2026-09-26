package com.ecommerce.project.model;

import jakarta.persistence.*;

@Entity
@Table(name ="Roles")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Role_Id")
    private Integer roleId;

    @Enumerated(EnumType.STRING)
    @Column(length = 20, name = "Role_Name")
    private AppRole roleName;

    public Role(AppRole roleName) {
        this.roleName = roleName;
    }

    public Role() {

    }
}

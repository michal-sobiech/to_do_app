package com.michal_sobiech.to_do_app.to_do_app.database.database_classes;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;  

@Entity(name = "users")
@Table(name = "users")
public class User {

    @Id
    @Column(
        name = "id"
    )
    @SequenceGenerator(
        name = "userIdSeq",
        sequenceName = "user_id_seq",
        initialValue = 1,
        allocationSize = 1
    )
    public Long id;

    @Column(
        name = "name"
    )
    public String name;

    @Column(
        name = "surname"
    )
    public String surname;

    @Column(
        name = "email"
    )
    public String email;

    @Column(
        name = "password"
    )
    public String password;
}

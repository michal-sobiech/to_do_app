package com.michal_sobiech.to_do_app.to_do_app.database.database_classes;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;  

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
    @GeneratedValue(generator = "userIdSeq")
    @Setter
    @Getter
    private Long id;

    @Column(
        name = "name"
    )
    @Setter
    @Getter
    private String name;

    @Column(
        name = "surname"
    )
    @Setter
    @Getter
    private String surname;

    @Column(
        name = "email"
    )
    @Setter
    @Getter
    private String email;

    @Column(
        name = "password"
    )
    @Setter
    @Getter
    private String password;

    public User(String name, String surname, String email, String password) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.password = password;
    }
}

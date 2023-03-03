package com.michal_sobiech.to_do_app.to_do_app.database;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.michal_sobiech.to_do_app.to_do_app.database.database_classes.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {}

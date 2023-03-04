package com.michal_sobiech.to_do_app.to_do_app.database.repositories;

import com.michal_sobiech.to_do_app.to_do_app.database.database_classes.ToDoEntry;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ToDoEntryRepository extends JpaRepository<ToDoEntry, Long> {}

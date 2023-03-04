package com.michal_sobiech.to_do_app.to_do_app.database.database_classes;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import lombok.Getter;
import lombok.Setter;
import java.util.Date;

import com.michal_sobiech.to_do_app.to_do_app.PriorityLevel;


@Entity(name = "to_do_entries")
@Table(name = "to_do_entries")
public class ToDoEntry {
    
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
        name = "title"
    )
    @Getter
    @Setter
    private String title;

    @Column(
        name = "description"
    )
    @Getter
    @Setter
    private String description;

    @Column(
        name = "date_due"
    )
    @Temporal(TemporalType.TIMESTAMP)
    @Getter
    @Setter
    private Date dateDue;

    @Column(
        name = "priority_level"
    )
    @Enumerated(EnumType.ORDINAL)
    @Getter
    @Setter
    private PriorityLevel priorityLevel;

}

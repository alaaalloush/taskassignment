package org.redischool.models;

import lombok.*;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "ASSIGNMENTS")
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@EqualsAndHashCode(of = {"id"})
@Builder(toBuilder = true)
@Getter

public class Assignment {

    @Id
    @Column(name = "ID")
    private UUID id;

    @Column(name = "TASK")
    private Task task;

//    @Column(name = "LANGUAGE")
//    private Language language;

    @Column (name = "SCHEDULE")
    private Schedule schedule;

//    @Column (name = "EMPLOYEE")
//    private Employee employee;

  /*  @ManyToOne(fetch = FetchType.LAZY)
    @JoinTable(name = "Assignment_Generator",
            joinColumns = {@JoinColumn(name = "SCHEDULE_ID")},
            inverseJoinColumns = {@JoinColumn(name = "TASK_ID")})
*/



}

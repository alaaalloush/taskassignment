package org.redischool.models;

import lombok.*;

import javax.persistence.*;
import java.util.Set;
import java.util.UUID;

@Entity
@Table(name = "LANGUAGE , uniqueConstraints = {@UniqueConstraint(columnNames = {\"NAME\"})})")
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@EqualsAndHashCode(of = {"id"})
@Builder(toBuilder = true)
@Getter
public class Language {

    @Id
    @Column(name = "ID")
    private UUID id;

    @Column(name = "NAME")
    private String name;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "Language_Employee",
            joinColumns = {@JoinColumn(name = "LANGUAGE_ID")},
            inverseJoinColumns = {@JoinColumn(name = "EMPLOYEE_ID")})
    private Set<Employee> employees;

}

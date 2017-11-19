package org.redischool.models;


import lombok.*;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.UUID;

@Entity
@Table(name = "EMPLOYEE_LANGUAGES")
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@EqualsAndHashCode(of = {"id"})
@Builder(toBuilder = true)
@Getter
public class EmployeeLanguage implements Serializable {

    @Id
    @Column(name = "ID")
    private UUID id;

    @Column(name = "LANGUAGE_ID")
    private UUID languageId;

    @Column(name = "EMPLOYEE_ID")
    private UUID employeeId;


}

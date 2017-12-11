package org.redischool.repositories;

import org.redischool.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface EmployeeRepository extends JpaRepository<Employee, UUID> {



    List<Employee> findByFirstName(String firstName);

    List<Employee> findByEmail(String email);



}
package org.redischool.repositories;

import org.redischool.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface EmployeeRepository extends JpaRepository<Employee, UUID> {
}

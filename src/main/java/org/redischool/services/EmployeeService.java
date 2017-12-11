package org.redischool.services;

import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import org.jvnet.hk2.annotations.Service;
import org.redischool.models.Employee;
import org.redischool.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@SuppressFBWarnings("RV_RETURN_VALUE_IGNORED_NO_SIDE_EFFECT")
@Service
public class EmployeeService extends AbstractService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public List<Employee> findByFirstName(String firstName){
        return this.employeeRepository.findByFirstName(firstName);
    }

    List<Employee> findByEmail (String email){
        return this.employeeRepository.findByEmail(email);

    }
}

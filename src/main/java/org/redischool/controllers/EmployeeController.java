package org.redischool.controllers;


import org.redischool.models.Employee;
import org.redischool.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("employee")
public class EmployeeController {

    final private EmployeeService employeeService;

    @Autowired
    public EmployeeController (EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @Path("{firstName}")
    @GET
    public Response getEmployee (@PathParam("firstName") String firstName){
        List<Employee> employees = employeeService.findByFirstName(firstName);
        return Response.ok(employees).build();
    }

    //www.localhost.com/api/employee/123?first_name="Ulrich"&last
//    @Path("{id}")
//    @PUT
//    public Response addEmployee(@PathParam("id")UUID id , @QueryParam("first_name") String firstName , @QueryParam("last_name") String lastName , @QueryParam("email") String email ){
//        //employeeService.save
//
//    }
//

}

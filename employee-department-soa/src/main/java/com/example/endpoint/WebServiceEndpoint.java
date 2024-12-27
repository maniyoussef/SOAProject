package com.example.endpoint;

import com.example.service.EmployeeService;
import com.example.service.DepartmentService;
import com.example.service.impl.EmployeeServiceImpl;
import com.example.service.impl.DepartmentServiceImpl;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import javax.xml.ws.Endpoint;

@Configuration
public class WebServiceEndpoint {

    @Autowired
    private EmployeeService employeeService;

    @Autowired
    private DepartmentService departmentService;

    // Publish the EmployeeService
    @Bean
    public Endpoint employeeServiceEndpoint() {
        EndpointImpl endpoint = new EndpointImpl(employeeService);
        endpoint.publish("/employeeService");
        return endpoint;
    }

    // Publish the DepartmentService
    @Bean
    public Endpoint departmentServiceEndpoint() {
        EndpointImpl endpoint = new EndpointImpl(departmentService);
        endpoint.publish("/departmentService");
        return endpoint;
    }
}

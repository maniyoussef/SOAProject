package com.example.service;

import com.example.model.employee.Employee;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import java.util.List;

@WebService
public interface EmployeeService {
    @WebMethod
    boolean addEmployee(@WebParam(name = "employee") Employee employee);
    
    @WebMethod
    boolean updateEmployee(@WebParam(name = "employee") Employee employee);
    
    @WebMethod
    boolean deleteEmployee(@WebParam(name = "id") String id);
    
    @WebMethod
    Employee getEmployeeById(@WebParam(name = "id") String id);
    
    @WebMethod
    List<Employee> getAllEmployees();
}
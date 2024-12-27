package com.example.service;

import com.example.model.department.Department;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import java.util.List;

@WebService
public interface DepartmentService {
    @WebMethod
    boolean addDepartment(@WebParam(name = "department") Department department);
    
    @WebMethod
    boolean updateDepartment(@WebParam(name = "department") Department department);
    
    @WebMethod
    boolean deleteDepartment(@WebParam(name = "id") String id);
    
    @WebMethod
    Department getDepartmentById(@WebParam(name = "id") String id);
    
    @WebMethod
    List<Department> getAllDepartments();
}
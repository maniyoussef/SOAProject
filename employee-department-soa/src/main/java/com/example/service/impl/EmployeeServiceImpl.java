package com.example.service.impl;

import com.example.model.employee.Employee;
import com.example.service.EmployeeService;
import org.springframework.stereotype.Service;
import javax.jws.WebService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@WebService(endpointInterface = "com.example.service.EmployeeService")
public class EmployeeServiceImpl implements EmployeeService {
    private final Map<String, Employee> employees = new HashMap<>();

    @Override
    public boolean addEmployee(Employee employee) {
        if (employees.containsKey(employee.getId())) {
            return false;
        }
        employees.put(employee.getId(), employee);
        return true;
    }

    @Override
    public boolean updateEmployee(Employee employee) {
        if (!employees.containsKey(employee.getId())) {
            return false;
        }
        employees.put(employee.getId(), employee);
        return true;
    }

    @Override
    public boolean deleteEmployee(String id) {
        return employees.remove(id) != null;
    }

    @Override
    public Employee getEmployeeById(String id) {
        return employees.get(id);
    }

    @Override
    public List<Employee> getAllEmployees() {
        return new ArrayList<>(employees.values());
    }
}
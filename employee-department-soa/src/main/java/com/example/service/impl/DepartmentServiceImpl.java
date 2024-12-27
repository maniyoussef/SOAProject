package com.example.service.impl;

import com.example.model.department.Department;
import com.example.service.DepartmentService;
import org.springframework.stereotype.Service;
import javax.jws.WebService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@WebService(endpointInterface = "com.example.service.DepartmentService")
public class DepartmentServiceImpl implements DepartmentService {
    private final Map<String, Department> departments = new HashMap<>();

    @Override
    public boolean addDepartment(Department department) {
        if (departments.containsKey(department.getId())) {
            return false;
        }
        departments.put(department.getId(), department);
        return true;
    }

    @Override
    public boolean updateDepartment(Department department) {
        if (!departments.containsKey(department.getId())) {
            return false;
        }
        departments.put(department.getId(), department);
        return true;
    }

    @Override
    public boolean deleteDepartment(String id) {
        return departments.remove(id) != null;
    }

    @Override
    public Department getDepartmentById(String id) {
        return departments.get(id);
    }

    @Override
    public List<Department> getAllDepartments() {
        return new ArrayList<>(departments.values());
    }
}
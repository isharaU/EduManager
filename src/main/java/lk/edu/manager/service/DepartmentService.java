package lk.edu.manager.service;

import lk.edu.manager.entity.Department;
import lk.edu.manager.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DepartmentService {

    private final DepartmentRepository departmentRepository;

    @Autowired
    public DepartmentService(DepartmentRepository departmentRepository) {
        this.departmentRepository = departmentRepository;
    }

    public List<Department> getAllDepartments() {
        return departmentRepository.findAll();
    }

    public Department getDepartmentById(Long id) {
        Optional<Department> department = departmentRepository.findById(id);
        return department.orElse(null);
    }

    public Department createDepartment(Department department) {
        return departmentRepository.save(department);
    }

    public Department updateDepartment(Long id, Department department) {
        if (!departmentRepository.existsById(id)) {
            return null;
        }
        department.setId(id);
        return departmentRepository.save(department);
    }

    public boolean deleteDepartment(Long id) {
        if (!departmentRepository.existsById(id)) {
            return false;
        }
        departmentRepository.deleteById(id);
        return true;
    }
}


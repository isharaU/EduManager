package lk.edu.manager.repository;

import lk.edu.manager.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
    // Additional query methods can be defined here
}

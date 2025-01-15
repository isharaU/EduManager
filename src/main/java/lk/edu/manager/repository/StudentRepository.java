package lk.edu.manager.repository;

import lk.edu.manager.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository <Student, Long> {
}

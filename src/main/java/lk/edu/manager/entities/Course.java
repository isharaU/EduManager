package lk.edu.manager.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "courses")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "course_name", nullable = false)
    private String courseName;

    @ManyToOne
    @JoinColumn(name = "teacher_id")
    private Teacher teacher; // Each course is taught by a teacher

    @ManyToMany(mappedBy = "courses")
    private List<Student> students;
}
